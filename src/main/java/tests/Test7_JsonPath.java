package tests;

import io.restassured.http.Cookies;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Map;

import static io.restassured.RestAssured.get;

public class Test7_JsonPath {
    @Test
    public void testJsonPath1() {
/*        String responseAsString =
               when().
                   get("http://jsonplaceholder.typicode.com/photos").
                   then().extract().asString();
        JsonPath jsonPath = new JsonPath(responseAsString);
        List<Integer> albumId = from(responseAsString).get("id");
        List<String> title    = jsonPath.get("title");
        System.out.println(albumId.size());
        System.out.println(title.size());
*/
        Response response = get("http://jsonplaceholder.typicode.com/photos");
        String header = response.header("CF-RAY");
        System.out.println(header);
        Headers headers = response.headers();
        for (Header h : headers) {
            System.out.println(h.getName() + ":" + h.getValue());
        }
        Map<String,String> getcookies = response.getCookies();
        for(Map.Entry<String,String > entry : getcookies.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
           }
      Cookies cookies = response.detailedCookies();
       System.out.println(cookies.asList());
       for(int i = 0; i < cookies.size();i++){
           System.out.println(cookies.exist());
           System.out.println(cookies.get("__cfduid").getExpiryDate());
           System.out.println(cookies.get("__cfduid").getName());
           System.out.println(cookies.get("__cfduid").getComment());
           System.out.println(cookies.get("__cfduid").getDomain());
           System.out.println(cookies.get("__cfduid").getMaxAge());
           System.out.println(cookies.get("__cfduid").hasExpiryDate());


       }

    }
}
