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

public class TC_03_PUT_UpdateUserDeatils {
	
	
	
	@Test
	public void verifyUpdateUserTest() {
		

		baseURI = "http://localhost:3000";
		
		
		
		
		JSONObject request = new JSONObject();
		
		request.put("last_name", "Naikwadi.....");
		request.put("first_name", "Imtiaz");
		request.put("subjectId", 3);
		
		

		
		
		
		System.out.println("=====================================");
		
		System.out.println(request.toJSONString());
		
		System.out.println("=====================================");
		
		given().
			//condition
			//header
			//body
			//auth token
			//parameter/queryParameter
			//contentType
		
			contentType(ContentType.JSON).
		
			body(request.toJSONString()).
		

			
			
		
		when().
			//action
			//get/post/put/delete
			put("/users/71").
		
		
		
		then().
			//validation
		
			//StatusCode
			//Header
			//ContentType
			//Response --- JSON path
		
			statusCode(200).
			
			
//			header("Content-Type", "application/json; charset=utf-8").
//			header("X-Powered-By", "Express").
//			header("CF-Cache-Status", "DYNAMIC").
//			
			
			body("first_name", equalTo("Imtiaz")).
			//body("job", equalTo(ibm_role)).
			
			log().all();
	
		
	}

}
