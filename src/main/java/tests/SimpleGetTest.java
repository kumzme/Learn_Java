package tests;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class SimpleGetTest {

    public static void  getWhetherDeatils(){
        RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
        RequestSpecification httpsRequest = RestAssured.given();
        Response response = httpsRequest.request(Method.GET,"/Chennai");
        String responseBody = response.getBody().asString();
        System.out.println(responseBody);
        int statusCode = response.getStatusCode();
        System.out.println(statusCode);
        String contentType = response.header("Content-Type");
        Headers alheader = response.headers();
        for(Header header:alheader){
            System.out.println("Keys" + "|" + header.getName() + " Value" + "---" + header.getValue());
        }

    }

    public static void  main (String[] nn){
        getWhetherDeatils();

    }
}
