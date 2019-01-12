package Security;

public class SSL {

    /*
How does SSL and website certificate work?
Importance of SSL is to secure communication between client and server.

When a user enters data in to SSL protected website, no other person or bot can access the data.

How SSL Certificate Works on a Website?

When a user tries to open a SSL secured website on browser

    The browser first attempts to connect to that website.
    The very next step is the browser quickly request to the web server of the website to identify itself.
    In respond to the browser’s request, the server sends the copy of its SSL certificate
    Now the browser checks the SSL certificate sent by the server, and respond back with a message to the server that it trusts the SSL certificate.
    To start the SSL encrypted session the server sends a digital signed acknowledgement to the browser.
    The encrypted data is transmitted securely between the web browser and the web server and finally HTTPS appears.
*/


    /*Are there different types of SSL Certificates?
Jake Adley
Jake Adley, Search Evangelist
Updated Apr 6, 2018

SSL Certificates can be classified based on the applications and requirements of the user & website admin. Here I’ve listed the types of SSL in details, read it carefully and get the best one for the security of your website.

 Classification of SSL Certificate

1. Wildcard SSL Certificates: Its secures your website along with the unlimited number of first level sub-domains. A user can get a wildcard SSL with Domain and Organization Validation.


2. Multi-Domain (SAN) SSL Certificate: A single MDC SL certificate can protect up to 250 multiple fully qualified domains. It is available with DV, OV and EV validation options.

Multi Domain SSL Certificates are also known as Unified Communications or UCC SSL Certificates.

UCC SSL Certificates are widely used and recommended to secure multiple domains on Microsoft Exchange Server and Microsoft Office Communication Server.

3. EV SSL Certificate: It validated business, display Green Address Bar and Business name in URL. EV is industries highly recognized and encrypted SSL certificate.

4. Domain validated SSL: Recommended to secure medium or low-level websites where less amount of security is required.


5. Organization Validation SSL: Used to validated online business and to ensure customer’s that they are accessing a genuine and legitimate business.


6. Code Signing Certificate: To Secure Code/script of Software, Application & files & to display author’s real identity.


7. Multi Domain Wildcard SSL Certificates

What if you want to secure your multiple domains and their all sub-domains under a single certificate? you will say it is not possible. Buy no it is possible. A Multi Domain SSL Certificate will work it out.

A Multi Domain Wildcard SSL Certificate can secure multiple domains up to 250 and their unlimited number of sub-domains on multiple servers.

Hence, a single SSL Certificate works better for every security solution.

*/


}
