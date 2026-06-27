package localAPI;




import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class TC_01_listUserTest_static {
	
	
	
	@Test
	public void verifyListUserTest() {
		

		baseURI = "http://localhost:3000";
		
		
		given().
			//condition
			//header
			//body
			//auth token
			//parameter/queryParameter
			//contentType
		
			//param("page", "2").
		
		
		when().
			//action
			//get/post/put/delete
			get("/users").
		
		
		
		then().
			//validation
		
			//StatusCode
			//Header
			//ContentType
			//Response --- JSON path
		
			statusCode(200).
			log().all();
		
				
		
	}

}
