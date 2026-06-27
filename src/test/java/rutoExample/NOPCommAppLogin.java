package rutoExample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NOPCommAppLogin extends BaseTest{
	
	
	@Test
	public void verifyLoginFeature() throws Exception {
		
		
		//driver.findElement(By.cssSelector("input#Email")).sendKeys("");
		
		driver.findElement(By.cssSelector("input#Email")).sendKeys("values to send");
		
		
		driver.findElement(By.name("Password")).sendKeys("values to send");
		
		
		
		driver.findElement(By.cssSelector("input#RememberMe")).click();
		
		
		
		driver.findElement(By.tagName("button")).click();
		
		
		
	}

}
