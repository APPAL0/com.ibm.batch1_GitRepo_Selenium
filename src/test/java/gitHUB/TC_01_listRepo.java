package gitHUB;




import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class TC_01_listRepo {
	
	
	
	@Test
	public void verifyListRepo() {
		

		baseURI = "https://api.github.com";
		
		
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
			get("/repositories").
		
		
		
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
