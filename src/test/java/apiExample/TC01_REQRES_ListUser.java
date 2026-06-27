package apiExample;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TC01_REQRES_ListUser {
	
	
@Test

public void VerifyListUserTest() {
	
	System.out.println("Execcuting list user API test");
	
	Response resp= RestAssured.get("https://reqres.in/api/users?page=2");
	System.out.println("Status code returned:" +resp.getStatusCode());
	System.out.println("Time is:"+resp.getTime());
	System.out.println("respon body:"+resp.body().asString());
	System.out.println("response body:"+resp.body().asPrettyString());
    
	
	Assert.assertEquals(resp.statusCode(), 200);
	
}



}
