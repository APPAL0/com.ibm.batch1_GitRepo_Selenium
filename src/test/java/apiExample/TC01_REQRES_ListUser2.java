package apiExample;


import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;


public class TC01_REQRES_ListUser2 {
	
	
@Test

public void VerifyListUserTest() {
	
	baseURI = "https://reqres.in";
    
    
    given().
    
        //header
        //parameter
        //body
        //auth token
        //queryparameter
    param("page","2");
    
    
    when().
        //action
        //get/post/put/delete
    
       get("/api/users?page=2").
    
    
    then().
        //validation
        //statusCode
        //responseTime
        //responseBody
        //responseBody-JSON path
        //headers
            //ContentType
        statusCode(200).
        log().all();
        
    
    
    
}

}
