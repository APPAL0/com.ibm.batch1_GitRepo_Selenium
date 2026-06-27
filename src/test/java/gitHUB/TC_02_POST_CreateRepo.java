package gitHUB;




import static io.restassured.RestAssured.*;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

//io.restassured.RestAssured.*
//io.restassured.matcher.RestAssuredMatchers.*
//org.hamcrest.Matchers.*


import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import utility.Constants;

public class TC_02_POST_CreateRepo {
	
	
	
	@Test
	public void verifyListUserTest() {
		

		baseURI = "https://api.github.com";
		
		
		JSONObject request = new JSONObject();
		
		request.put("name", "restAssuredGitJenkinsTemp");
		
		
		given().
			//condition
			//header
			//body
			//auth token
			//parameter/queryParameter
			//contentType
		
			contentType(ContentType.JSON).
			
			auth().oauth2(Constants.gitToken).
		
			body(request.toJSONString()).
		
	
			
		
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
		
			//statusCode(201).
			
			
//			header("Content-Type", "application/json; charset=utf-8").
//			header("Transfer-Encoding", "chunked").
//			header("X-OAuth-Scopes", "repo").
			
			
			//Transfer-Encoding: chunked
			//X-OAuth-Scopes: repo
			
			//body("enter JSON path", equalTo("repoName_restAssured_git_jenkins")).
			
			
			log().all();
		
		
		
		
		
		
		
		
	}

}
