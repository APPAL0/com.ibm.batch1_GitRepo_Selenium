
package apiExample;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;

//import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import utility.Constants;

public class TC_02_REQRES_POST_CreateUser {
    
    
    @Test(dataProvider = "sampleData")
    public void verifyListUserTest(String empName, String role) {
        
        
        baseURI = Constants.reqresAPI;
        
        
        JSONObject request = new JSONObject();
        
        
        String ibm_emp = empName;
        String ibm_role = role;
        
        request.put("name", ibm_emp);
        request.put("job", ibm_role);
        
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
            
//          {
//              "name":"Harinath",
//              "job": "leader"
//          }
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
            
            body("name", equalTo(ibm_emp)).
            body("job", equalTo(role)).
            log().all();
            
        
    }
    
    
    
    @DataProvider
    public Object[][] sampleData() {
        
        Object[][] data = {{"Anup", "tester"}, {"Sumit", "sr.manager"}, {"Srikanta", "leader"}};
        return data;
    }

}
