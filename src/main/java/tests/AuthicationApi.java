package tests;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;


public class AuthicationApi {

 @Test
    public void testBasicAuth(){
     RestAssured.baseURI = "http://restapi.demoqa.com/authentication/CheckForAuthentication";
     RequestSpecification request = RestAssured.given();
     Response response = request.get();
     System.out.println(response.statusCode() + " message " + response.body().toString());
 }

}
