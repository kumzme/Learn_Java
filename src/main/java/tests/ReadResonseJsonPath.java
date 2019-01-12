package tests;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

public class ReadResonseJsonPath {

    public static void readJsonPathObj() {
        RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";

        RequestSpecification httprequest = RestAssured.given();
        Response             response    = httprequest.get("/Chennai");
        JsonPath             jsonPath    = response.jsonPath();
        String               city        = jsonPath.get("City");

        System.out.println(jsonPath);

        System.out.println("Temperature receives in the Response: " + jsonPath.get("Temperature"));
        System.out.println("cities receives in the Response:" + city);
        Assert.assertEquals(city, "Chennai", "test is sucessful");

    }

    public static void main(String[] nn) {
        readJsonPathObj();

    }


}
