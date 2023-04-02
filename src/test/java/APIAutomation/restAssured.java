package APIAutomation;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.core.Is;
import org.json.simple.JSONObject;
import org.testng.Assert;
import static io.restassured.RestAssured.get;
import  org.testng.annotations.Test;

public class restAssured {

    @Test
    void print(){

            //specify base url
            RestAssured.baseURI=("https://reqres.in/api/users?page=2");

            //Requst object
            RequestSpecification httprequest = RestAssured.given();

            //Response Object
            Response response = httprequest.request(Method.GET,"");

            // [print the response

            String GetResponse = response.getBody().asString();

            System.out.println(GetResponse);

           String url="https://reqres.in/api/users?page=2";

          get(url).then().assertThat().body("data.last_name[0]", Is.is("Lawson")).log().all();


       // int status_code=  response.getStatusCode();

       // System.out.println(status_code);
//        JsonPath jasonresponse = resopnse.jsonPath();
//        System.out.println(jasonresponse.get("city"));
//        Assert.assertEquals(404,status_code);
        }
    }

