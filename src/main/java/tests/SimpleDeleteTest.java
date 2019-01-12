package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SimpleDeleteTest {

    public static void SimpleDeleteTest() {
        RestAssured.baseURI = "http://restapi.demoqa.com/customer";
        RequestSpecification request = RestAssured.given();
        Response response = request.delete("/register");
        int statusCode = response.getStatusCode();
        System.out.println(statusCode);


    }

    public static void main(String[] aa) {
        SimpleDeleteTest();
    }
}
