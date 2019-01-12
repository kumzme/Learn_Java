General commands

 

1. create JKS keystore

    keytool -genkey -alias localhostkey -keystore localhost.keystore -storepass password \

    -keypass password -dname "CN=localhost,OU=QE,O=example.com,L=Brno,C=CZ"

 

2. convert localhost.keystore to pkcs12

    keytool -importkeystore -srckeystore localhost.keystore -destkeystore localhost.p12 \

    -srcstoretype jks -deststoretype pkcs12 -srcstorepass password -deststorepass password

 

3. convert keystore to PEM

    openssl pkcs12 -in localhost.p12 -out localhost.pem

 

4. just private key

    openssl pkcs12 -in localhost.p12 -out localhost-privkey.pem -nocerts -nodes

 

5. pem file with just certificate

    openssl pkcs12 -in localhost.p12 -out localhost-cert.pem -clcerts -nokeys

 
Creating a CA authority certificate and adding it into keystore

 

openssl.cnf file:

 

    #  
    # OpenSSL configuration file.  
    #  
      
    # Establish working directory.  
      
    dir                 = .  
      
    [ ca ]  
    default_ca              = CA_default  
      
    [ CA_default ]  
    serial                  = $dir/serial  
    database                = $dir/certindex.txt  
    new_certs_dir           = $dir/  
    certificate             = $dir/wfkqeca.crt  
    private_key             = $dir/wfkqeca.pem  
    default_days            = 3650  
    default_md              = md5  
    preserve                = no  
    email_in_dn             = no  
    nameopt                 = default_ca  
    certopt                 = default_ca  
    policy                  = policy_match  
      
    [ policy_match ]  
    countryName             = match  
    stateOrProvinceName     = match  
    organizationName        = match  
    organizationalUnitName  = optional  
    commonName              = supplied  
    emailAddress            = optional  
      
      
    [ policy_anything ]  
    countryName = optional  
    stateOrProvinceName= optional  
    localityName= optional  
    # organizationName = optional  
    organizationName = match  
    organizationalUnitName = optional  
    commonName= supplied  
    emailAddress= optional  
      
    [ req ]  
    default_bits            = 1024          # Size of keys  
    default_keyfile         = key.pem       # name of generated keys  
    default_md              = md5           # message digest algorithm  
    string_mask             = nombstr       # permitted characters  
    distinguished_name      = req_distinguished_name  
    req_extensions          = v3_req  
      
    [ req_distinguished_name ]  
    # Variable name             Prompt string  
    #-------------------------    ----------------------------------  
    0.organizationName          = Organization Name (company)  
    organizationalUnitName      = Organizational Unit Name (department, division)  
    emailAddress                = Email Address  
    emailAddress_max            = 40  
    localityName                = Locality Name (city, district)  
    stateOrProvinceName         = State or Province Name (full name)  
    countryName             = Country Name (2 letter code)  
    countryName_min             = 2  
    countryName_max             = 2  
    commonName              = Common Name (hostname, IP, or your name)  
    commonName_max              = 64  
      
    # Default values for the above, for consistency and less typing.  
    # Variable name             Value  
    #  
    #------------------------     ------------------------------  
    0.organizationName_default      = JBoss QE  
    localityName_default            = Brno  
    stateOrProvinceName_default     = Jihomoravsky kraj  
    organizationalUnitName_default  = WFK QE  
    countryName_default         = CZ  
    emailAddress_default        = whatever@wherever.com  
    commonName_default          = WFK QE CA  
      
    [ v3_ca ]  
    basicConstraints            = CA:TRUE  
    subjectKeyIdentifier        = hash  
    authorityKeyIdentifier      = keyid:always,issuer:always  
      
    [ v3_req ]  
    basicConstraints            = CA:FALSE  
    subjectKeyIdentifier        = hash  
    subjectAltName              = @alt_names  
      
    [ server_eku ]  
    basicConstraints            = CA:FALSE  
    subjectKeyIdentifier        = hash  
    extendedKeyUsage = serverAuth  
    subjectAltName              = @alt_names  
      
    [ client_eku ]  
    basicConstraints            = CA:FALSE  
    subjectKeyIdentifier        = hash  
    extendedKeyUsage = clientAuth  
    subjectAltName              = @alt_names  
      
    [ alt_names ]   
    DNS.1 = localhost  
    IP.1 = 127.0.0.1  

 

To create a CA key pair:

 

    openssl req -new -x509 -config openssl.cnf -extensions v3_ca -keyout wfkqeca.pem -out wfkqeca.crt -days 3650  

 

To import in into a keystore:

 

    keytool -importcert -alias wfkqaca -file wfkqeca.crt -keypass password -trustcacerts -storetype jks -keystore wfkqe.jks -storepass password  

 
Creating a multiple hosts (SAN) private key, signing it with CA and storing in keystore/truststore

(Note JDK7 keytool is required to handle extension syntax):

 

Creating a key pair:

 

    keytool -genkeypair -alias wfkqe -keystore wfkqe.jks -storetype jks -storepass password -keypass password -dname "CN=localhost,OU=WFK QE,O=JBoss QE,L=Brno,C=CZ" -ext "SAN=DNS:localhost,IP:127.0.0.1" -validity 3650  

 

Creating a certification request:

 

    keytool -certreq -ext "SAN=DNS:localhost,IP:127.0.0.1" -alias wfkqe -file wfkqereq.cer -keypass password -storetype jks -keystore wfkqe.jks -storepass password  

 

Sign it:

 

    openssl ca -policy policy_anything -config openssl.cnf -extensions server_eku -out wfkqe.crt -days 3650 -infiles wfkqereq.cer  

 

Import it into keystore:

 

    openssl x509 -in wfkqe.crt -out wfkqex509.crt  
    keytool -importcert -alias wfkqe -file wfkqex509.crt -keypass password -storetype jks -keystore wfkqe.jks -storepass password  

 
Creating a signed X509 certificate for usage in browsers

Create a certificate request:

 

    openssl req -new -nodes -config openssl.cnf -extensions client_eku -out rodreq.cer -keyout rod.pem -days 3650  

 

Sign it:

 

    openssl ca -policy policy_anything -config openssl.cnf -extensions client_eku -out rod.crt -days 3650 -infiles rodreq.cer  

 

Create X509 in PKCS12 format:

 

    openssl pkcs12 -export -in rod.crt -inkey rod.pem -certfile wfkqeca.crt -clcerts -name "rod" -out rod.p12  
