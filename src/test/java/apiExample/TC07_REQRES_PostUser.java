package apiExample;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


public class TC07_REQRES_PostUser {
	
	
@Test

public void VerifyListUserTest() {
	
	baseURI = "https://reqres.in";
	JSONObject request = new JSONObject();
    
    
    given().
    
        //header
        //parameter
        //body
        //auth token
        //queryparameter
    //param("page","2");
    
    
    header("Content-Type","application/json").
    contentType(ContentType.JSON).
    
    body(request.toJSONString()).
    
//  {
//      "name":"Harinath",
//      "job": "leader"
//  }
//
    
    
    when().
        //action
        //get/post/put/delete
    
       post("/api/users").
    
    
    then().
        //validation
        //statusCode
        //responseTime
        //responseBody
        //responseBody-JSON path
        //headers
            //ContentType
        statusCode(201).
        log().all();
        
    
    
    
}

}
