package tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class TestWeatherApi {
    @Test(priority = 0)
    public static void getWheatherInfo(){
        RestAssured.baseURI = "http://api.openweathermap.org/data/2.5/weather";
        String response = RestAssured.given().param("q", "Delhi").param("APPID", "c5e16cd4285a4d6ff4f39c5c602cd64f").
                when().get().then().extract().asString();
        System.out.println(response);
        Reporter.log("Response" +response,true);
        ValidatableResponse res = RestAssured.given().param("q", "Delhi").param("APPID", "c5e16cd4285a4d6ff4f39c5c602cd64f").when().get().then();
        res.statusCode(200);
        Reporter.log("statusCode"+response,true);
        res.contentType(ContentType.JSON);
        Object countryName = res.extract().response().path("sys.country");
        System.out.println("countryName "+countryName);
        JsonPath path = new JsonPath(response);
        Object countryName1 = path.get("sys.country");
        System.out.println("countryName "+countryName1);


    }

    public  static void  main (String [] args){
        getWheatherInfo();
    }

}
