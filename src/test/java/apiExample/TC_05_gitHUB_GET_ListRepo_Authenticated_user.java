package apiExample;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

//import static io.restassured.RestAssured.*;
//import static io.restassured.matcher.RestAssuredMatchers.*;
//import static org.hamcrest.Matchers.*;


import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import utility.Constants;

public class TC_05_gitHUB_GET_ListRepo_Authenticated_user {
	 @Test
	    public void verifyListUserTest() {
	        
	        
	        //baseURI = "https://reqres.in";
	        baseURI = "https://api.github.com";
	        
	        
	        given().
	        
	            //header
	            //parameter
	            //body
	            //auth token
	            //queryparameter
	            //contentType
	        
	            auth().oauth2(Constants.gitToken).
	        
	        
	        
	            //param("page", "2").
	        
	            contentType(ContentType.JSON).
	        
	        
	        when().
	            //action
	            //get/post/put/delete
	        
	            get("/user/repos").
	        
	        
	        then().
	            //validation
	            //statusCode
	            //responseTime
	            //responseBody
	            //responseBody-JSON path
	            //headers
	                //ContentType
	            statusCode(200).
	            body("[4].url", equalTo("https://api.github.com/repos/APPAL0/SeleniumAutomation")).
	            body("[3].full_name", equalTo("APPAL0/learningPostman")).
	            
	            header("Content-Type","application/json; charset=utf-8").
	            header("Transfer-Encoding","chunked").
	            header("X-OAuth-Scopes","repo").
	            
//	          Content-Type: application/json; charset=utf-8
//	          Transfer-Encoding: chunked
//	          X-OAuth-Scopes: repo
	            
	            
	            
	            log().all();
	            
	        
	        
	        
	    }

	}
