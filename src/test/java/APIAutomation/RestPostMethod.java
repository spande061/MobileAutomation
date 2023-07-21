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
        System.out.println("job2");
        }



    @Test
    public void PostMethod2(){

        System.out.println("job3");



    }

}
