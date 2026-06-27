package reqres;




import static io.restassured.RestAssured.*;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

//io.restassured.RestAssured.*
//io.restassured.matcher.RestAssuredMatchers.*
//org.hamcrest.Matchers.*


import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TC_02_POST_CreateUser {
	
	
	
	@Test
	public void verifyListUserTest() {
		

		baseURI = "https://reqres.in";
		
		
		String ibm_emp = "Mahalaxmi";
		String ibm_role = "leader";
		
		JSONObject request = new JSONObject();
		
		request.put("name", ibm_emp);
		request.put("job", ibm_role);
		
		
		
		
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
		
//			param("page", "2").
		
			
//			{
//			    "name": "Harinath",
//			    "job": "leader"
//			}
			
			
			
		
		when().
			//action
			//get/post/put/delete
			post("/api/users").
		
		
		
		then().
			//validation
		
			//StatusCode
			//Header
			//ContentType
			//Response --- JSON path
		
			statusCode(201).
			
			
			header("Content-Type", "application/json; charset=utf-8").
			header("X-Powered-By", "Express").
			header("CF-Cache-Status", "DYNAMIC").
			
			
			body("name", equalTo(ibm_emp)).
			body("job", equalTo(ibm_role)).
			
			log().all();
		
		
		
		
		
		
		
		
	}

}
