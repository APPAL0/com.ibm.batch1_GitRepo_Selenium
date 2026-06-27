package apiExample;




import java.io.FileInputStream;

import org.apache.commons.io.IOUtils;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;


public class TC08_SOAP_Test {
	
	@Test
	public void soapTest() throws Exception{
		
		FileInputStream fis=new FileInputStream(".\\testData\\request.xml");
		RestAssured.baseURI="http://webservices.oorsprong.org";
		 
        
        
		
		     Response response=
		         given()
		               .header("Content-Type","text/xml")
		               .and()
		               .body(IOUtils.toString(fis,"UTF-8"))
		               .when()
		                     .post("/websamples.countryinfo/CountryInfoService.wso")
		               .then()
		                    .statusCode(200)
		                    .and()
		                    .log().all().extract().response();
		                
		         XmlPath xmlpath=new XmlPath(response.asPrettyString()) ;
		         String capitalcity=xmlpath.getString("");
		         System.out.println("capital city is :" +capitalcity);
		               

	
	}

}
	
