package apiExample;

import org.json.simple.JSONObject;


import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import utility.Constants;

public class TC_06_gitHUB_POST_CreateRepo {
	
	 @Test
	    public void verifyListUserTest() {
	        
	        
	        baseURI = "https://api.github.com";
	        
	        
	        JSONObject request = new JSONObject();
	        
	        

	        
	        request.put("name", "restAssured_git_jenkins_temp");
	        
	        
	        System.out.println("===============================");
	        
	        System.out.println(request.toJSONString());
	        
	        System.out.println("===============================");
	        
	        
	        
	        given().
	        
	            //header
	            //parameter
	            //body
	            //auth token
	            //queryparameter
	            //contentType
	            header("Content-Type","application/json").
	            contentType(ContentType.JSON).
	            
	            body(request.toJSONString()).
	            
	            
	            auth().oauth2(Constants.gitToken).
	        
	            
	        
	        
	        when().
	            //action
	            //get/post/put/delete
	        
	            post("/user/repos").
	        
	        
	        then().
	            //validation
	            //statusCode
	            //responseTime
	            //responseBody
	            //responseBody-JSON path
	            //headers
	                //ContentType
	            statusCode(201).
	            
	            //body("", equalTo("restAssured_git_jenkins")).
	            
	            log().all();
	            
	        
	    }
	    
	    
	   
	}



