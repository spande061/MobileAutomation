package APIAutomation;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.core.Is;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;

public class RestPostMethod {

    @Test
    public void PostMethod1() {

        //specifing base URI
        RestAssured.baseURI = "https://reqres.in/api/register";
        //Request object
        RequestSpecification httpRequest = RestAssured.given();
        //Request Body

        JSONObject body = new JSONObject();
        body.put("name", "sandip");
        body.put("job", "pande");
        body.put("id", "110");
        body.put("createdAt", "2022-11-28T14:31:59.192");

        httpRequest.header("Content-Type", "application/Json");
        httpRequest.body(body.toJSONString());

        //Response object
        Response response = httpRequest.request(Method.POST, "/register");



        //Print response
        String responseBody = response.getBody().asString();
        System.out.println(responseBody);

        //Status code validation
        int ActualstatusCode = response.getStatusCode();
        Assert.assertEquals(201, ActualstatusCode);
    }
         @Test
        public void getresponse(){
             //specifing base URI
             RestAssured.baseURI = "https://reqres.in/api/register/212";
             //Request object
             RequestSpecification httpRequest1 = RestAssured.given();
             Response resopnse = httpRequest1.request(Method.GET,"/212");
             String GetResponse1 = resopnse.getBody().asString();
             System.out.println(GetResponse1);

        }



    @Test
    public void PostMethod2(){

        RestAssured.baseURI=("https://reqres.in/api/login");

        RequestSpecification httpRequest = RestAssured.given();

        JSONObject body = new JSONObject();

        body.put("email","eve.holt@reqres.in");
        body.put("password","cityslicka");

        httpRequest.header("Content-Type","application/Json");
        httpRequest.body(body.toJSONString());
        Response response = httpRequest.request(Method.POST,"login");
        JsonPath path = response.jsonPath();
       // System.out.println((char[]) path.get("name"));

        String responseBody = response.getBody().asString();

        response.body();
        System.out.println(responseBody);
        System.out.println(response.getStatusCode());
        String url = "https://reqres.in/api/login/";
        get(url).then().assertThat().body("null", Is.is("null")).log().all();



    }

}
