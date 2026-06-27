package apiExample;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TC_01_UniversityTest {
	@Test
	public void verifyListUserTest() {
		
		
		System.out.println("execution of API test......");
		
		//RestAssured ------ test api
		
		Response resp = RestAssured.get("http://universities.hipolabs.com/search?country=India");
		
		
		
		int actualStatusCode = resp.getStatusCode();
		
		//resp.getBody();
//		resp.getTime()
		
		System.out.println("=========statusCode================" + actualStatusCode);
		System.out.println("=========Response Time in msec================" + resp.getTime());
		
		System.out.println("Response Body: " + resp.getBody().asString());
		System.out.println("============================================");
	 //   System.out.println("Response Body: " + resp.getBody().asPrettyString());
		
		
		
		
		//validation Step
		
		Assert.assertEquals(actualStatusCode, 200);
		
		
		
	}
	
	
	
	

}
