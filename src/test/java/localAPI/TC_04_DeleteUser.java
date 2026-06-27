package localAPI;




import static io.restassured.RestAssured.*;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

//io.restassured.RestAssured.*
//io.restassured.matcher.RestAssuredMatchers.*
//org.hamcrest.Matchers.*


import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TC_04_DeleteUser {
	
	
	
	@Test
	public void verifyListUserTest() {
		

		baseURI = "https://reqres.in";
		
		
		
		given().
			//condition
			//header
			//body
			//auth token
			//parameter/queryParameter
			//contentType
		
			contentType(ContentType.JSON).
		
			//body(request.toJSONString()).
		
		
		
		when().
			//action
			//get/post/put/delete
			delete("/api/users/2").
		
		
		
		then().
			//validation
		
			//StatusCode
			//Header
			//ContentType
			//Response --- JSON path
		
			statusCode(204).
			
//			
//			header("Content-Type", "application/json; charset=utf-8").
			header("X-Powered-By", "Express").
			header("CF-Cache-Status", "DYNAMIC").
			
			
			
			log().all();
		
		
		
		
		
		
		
		
	}

}
