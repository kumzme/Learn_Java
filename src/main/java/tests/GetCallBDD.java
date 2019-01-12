package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.hasSize;

public class GetCallBDD {

    @Test
    public void test_numberOfCircuitsFor2017_Season(){
    //given().
    //when().
    //then().
    //assert()
        Response resp = RestAssured.get("http://ergast.com/api/f1/2017/circuits.json");
        int code =resp.getStatusCode();
        System.out.println(resp.getBody());

    given().

     when().get("http://ergast.com/api/f1/2017/circuits.json").
    then().
      assertThat().
      statusCode(200).
      and().
      body("MRData.CircuitTable.Circuits.circuitId",hasSize(20)).
      and().
      header("Content-Length","4551").
      and().
      header("Content-Type","application/json; charset=utf-8");



    }

}
