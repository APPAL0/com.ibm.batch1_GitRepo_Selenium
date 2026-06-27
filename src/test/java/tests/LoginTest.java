package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test
	public void verifyLoginFeature() throws Exception {
		
		
		
		
		LoginPage lp = new LoginPage(driver);
//		
//		lp.enterEmail("admin@yourstore.com");
//		lp.enterPass("admin");
//		lp.clickCkeckbox();
//		lp.clickLogin();
		
		
		lp.login("admin@yourstore.com", "admin");
		
		//lp.verifyApplicationTitle("Dashboard / nopCommerce administration");
		
		
		
	}

}