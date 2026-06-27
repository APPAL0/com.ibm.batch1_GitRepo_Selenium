package localAPI;




import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TC_02_POST_CreateUser_DDT {
	
	
	
	@Test(dataProvider = "sampleData")
	public void verifyListUserTest(String ibm_emp, String ibm_role) {
		

		baseURI = "https://reqres.in";
		
		
//		String ibm_emp = "Mahalaxmi";
//		String ibm_role = "leader";
		
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
			log().all();
		
		
	}
	
	@DataProvider
	public Object[][] sampleData() {
		
		Object [] [] data = { {"Anusha","manager"},{"Divya","leader"},{"Utkarsh","sr. leader"},{"Pradeep","sr.manager"} };
		return data;
		
	}

}
