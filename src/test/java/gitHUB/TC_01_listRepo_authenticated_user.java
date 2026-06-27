package gitHUB;




import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import utility.Constants;

public class TC_01_listRepo_authenticated_user {
	
	
	
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
		
			contentType(ContentType.JSON).
			
			
			auth().
				oauth2(Constants.gitToken).
			//param("page", "2").
		
		
		when().
			//action
			//get/post/put/delete
			get("/user/repos").
		
		
		
		then().
			//validation
		
			//StatusCode
			//Header
			//ContentType
			//Response --- JSON path
		
			statusCode(200).
			
			
			header("X-OAuth-Scopes", "repo").
			//X-OAuth-Scopes: repo
			
			body("[4].html_url", equalTo("https://github.com/APPAL0/restAssured_git_jenkins_temp")).
			body("[4].name", equalTo("restAssured_git_jenkins_temp")).
			body("[3].html_url", equalTo("https://github.com/APPAL0/learningPostman")).
			
			log().all();
		
		
		
		
		
		
		
		
	}

}
