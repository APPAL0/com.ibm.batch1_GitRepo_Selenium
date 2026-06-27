package apiExample;



import java.util.List;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ZephyrExecutor {

	 private static final String BASE_URL = "https://api.zephyrscale.smartbear.com/v2";
	    private static final String TOKEN = "YOUR_API_TOKEN";

	    public static List<Integer> getExecutionIds(int cycleId) {

	        Response response = RestAssured.given()
	            .header("Authorization", "Bearer " + TOKEN)
	            .header("Content-Type", "application/json")
	            .get(BASE_URL + "/testexecutions?cycleId=" + cycleId);

	        JsonPath json = response.jsonPath();
	        return json.getList("values.id");
	    }


}
