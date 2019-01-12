PKI main purpose is to ascertain a subject’s identity (a subject could be anything such as a computer, a person, a router or a service). Password based authentication is not secure enough for enterprises (such as banks) and government applications, and thus regulations made to enforce the use of more sophisticated and secure methods of authentication such as digital certificates. For example the use of smart card as a mean of authentication and authorization deployed in government agencies (A smart card in a PKI contains a certificate with a private key).

digital certificates are like a passport that certifies its holder’s identity. A passport must be published and signed by a trusted authority to be considered valid. The same way a digital certificate must be signed by a trusted certificate authority to be considered valid. here comes the role of PKI, it provides everything needed to use certificates such as issuance, revoking, verification, and many more.


In the context of PKI, trust can be broadly defined as Authenticity (sender is sure about the identity of receiver and vice-versa), Integrity (data sent by sender reaches the receiver as such; no tampering is possible), Confidentiality (secrecy of communication is maintained; other than the sender and receiver nobody can decipher the transmitted message) and Non-repudiation (inability to disown a transaction by a party involved in the communication).

To setup a ‘trust-worthy’ Public Key Infrastructure (PKI), you need technology (currently derived from Cryptography), Standards (to facilitate smooth operations and communications), Policy (to regulate, legalize transactions, criminalize frauds), and of course PKI-enabled applications.


PKI - Public Key Infrastructure is an infrastructure (like roads, rails etc…) to facilitate ‘trust’ in electronic transactions - whether it may be a simple electronic message or a financial transaction.

How ‘trust’ can be created in a faceless, paperless, electronic world ? - by ensuring integrity, authenticity, non-repudiation, and confidentiality (if required). Integrity - ensures that the messages are unaltered; Authenticity - ensures that the sender and receiver are confident of each other’s identity; Non-repudiation - ensures a party cannot deny an action; confidentiality - ensures secrecy of communication between sender and receiver. So for PKI to facilitate trust, it need to ensure all of these.

PKI requires at least 4 components to be in place for facilitating trust (as shown in the Figure). They are: Technology, Implementation, Standards and Policy. Each of this component has a role player (major stakeholder) - Technology: Cryptographers; Implementation: Certifying Authorities, HSM Manufacturers, PKI application Developers etc…; Standards: Standard Developing Organizations, like say IETF, IEEE, and other Industry consortium; Policy: Governments and Regulators.

So, all these players have to work together in establishing a PKI Infrastructure that is reliable, secure and trustworthy. Needless to say, gaps or weakness or failure of any of the component will affect PKI as a whole and make it untrustworthy for electronic transactions.

As of now, most of the PKI in the world, leverages the concepts of PKC (Public Key Cryptography) in the Technology component, an hierarchical model of Certifying authorities (CA) in the implementation component, adherence to PKCS in the Standards component, and laws set by the national governments (and regulators like CCA in India) in the policy component.

Well, what if you want to establish PKI within your organization or your private space? - You define the composition of each of these 4 components and set it up.



A public key infrastructure (PKI) can be termed as a support system for distribution and identification of public encryption keys, enabling users and computers to both securely exchange data over networks such as the internet and verify the identity of the other party.

Without this , sensitive information can still be encrypted into hashes (ensuring confidentiality) and exchanged, but there would be no assurance of the identity (authentication) of the other party. Any form of sensitive data exchanged over the Internet is reliant on PKI for security.

Elements of PKI:

A typical PKI includes the following key elements:

    A trusted party, called a Certification Authority (CA), acts as the root of trust and provides services that authenticate the identity of individuals, computers and other entities
    A Registration Authority, often called a subordinate CA, certified by a root CA to issue certificates for specific uses permitted by the root
    A certificate database, which stores certificate requests and issues and revokes certificates
    A certificate store, which resides on a local computer as a place to store issued certificates and private keys .

I hope this helps you….you can go through videos on YouTube…..it will get more clear then.

### >  Keys


* a
* a
* a
* a
 > - a
- a
- a

``aaa ``


The Public and Private key pair comprise of two uniquely related cryptographic keys (basically long random numbers). Below is an example of a Public Key:

3048 0241 00C9 18FA CF8D EB2D EFD5 FD37 89B9 E069 EA97 FC20 5E35 F577 EE31 C4FB C6E4 4811 7D86 BC8F BAFA 362F 922B F01B 2F40 C744 2654 C0DD 2881 D673 CA2B 4003 C266 E2CD CB02 0301 0001

The Public Key is what its name suggests - Public. It is made available to everyone via a publicly accessible repository or directory. On the other hand, the Private Key must remain confidential to its respective owner.

Comodo - SSL Certificate Authority

Because the key pair is mathematically related, whatever is encrypted with a Public Key may only be decrypted by its corresponding Private Key and vice versa.

For example, if Bob wants to send sensitive data to Alice, and wants to be sure that only Alice may be able to read it, he will encrypt the data with Alice's Public Key. Only Alice has access to her corresponding Private Key and as a result is the only person with the capability of decrypting the encrypted data back into its original form.

Comodo - SSL Certificate Authority

As only Alice has access to her Private Key, it is possible that only Alice can decrypt the encrypted data. Even if someone else gains access to the encrypted data, it will remain confidential as they should not have access to Alice's Private Key.

Public Key Cryptography can therefore achieve Confidentiality. However another important aspect of Public Key Cryptography is its ability to create a Digital Signature.
