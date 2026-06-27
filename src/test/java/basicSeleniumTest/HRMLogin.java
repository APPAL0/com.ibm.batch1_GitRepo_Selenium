package basicSeleniumTest;

import org.junit.After;
import org.junit.Before;
//import org.testng.annotations.Test;
import org.junit.Test;
import org.openqa.selenium.By;

public class HRMLogin extends BaseTest{
	
	//ctrl+shift+o ---- autoimport/remove unused import
	//Unit Testing framework   -----JUNIT -----> TestNG
	//execution workflow ----- Before -----Test -----After
	
	
	
	
	
	@Test
	public void login() throws Exception {
		
		System.out.println("login test case");
		
		Thread.sleep(4000);
		//driver.findElement(By.cssSelector(".orangehrm-login-forgot-header")).click();
		//use of .classname shortcut
		driver.findElement(By.cssSelector(".orangehrm-login-forgot")).click();
		
		Thread.sleep(4000);
	}
	
	
	

}
