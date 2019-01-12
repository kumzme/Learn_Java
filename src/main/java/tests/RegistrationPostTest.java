package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

public class RegistrationPostTest {

    public static void simplePostTest() {
        RestAssured.baseURI = "http://restapi.demoqa.com/customer";
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        //Create Json object
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("FirstName", "Deepa");
        jsonObject.put("LastName", "MP");
        jsonObject.put("UserName", "Deep");
        jsonObject.put("Email", "Deepa@gmail.com");
        jsonObject.put("Password", "Password");
        request.body(jsonObject.toString());
        Response response = request.post("/register");
        ResponseBody body = response.getBody();
        System.out.println(body.toString());
        if(response.statusCode() == 200){
            RegistrationFailureResponse responsebody = body.as(RegistrationFailureResponse.class);
            System.out.println("Opperation_Failure" +responsebody.FaultId);
            System.out.println("Failure message" +responsebody.fault);
        }
        if(response.statusCode() == 201) {
            RegistrationSucessResponse responsebody = body.as(RegistrationSucessResponse.class);
            System.out.println("OPERATION_SUCCESS" + responsebody.SucessCode);
            System.out.println("Message" + responsebody.Message);
        }



    }

    public static void main(String[] aa) {
        simplePostTest();
    }
}
