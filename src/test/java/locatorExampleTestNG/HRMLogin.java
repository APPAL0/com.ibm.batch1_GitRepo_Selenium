package locatorExampleTestNG;

//import org.junit.After;
//import org.junit.Before;
//import org.testng.annotations.Test;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HRMLogin extends BaseTest{
	
	
	@Test
	public void login() throws Exception {
		
		System.out.println("login test case");
		Thread.sleep(4000);
		
//		id
//		className
//		tagname
//		name
//
//
//		linkText
//		partialLinkText
//
//
//		xpath
//		css selector	

		
		//x = 10;
		
		//username ----- locator: name
		
		
		
		
		WebElement txtUserName = driver.findElement(By.name("username"));
		
		
		txtUserName.sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		
		
		//tagname
		driver.findElement(By.tagName("button")).click();
		
		
		Thread.sleep(4000);
		//dashboard
		String actualText = driver.findElement(By.tagName("h6")).getText();
		System.out.println("Text after login: " + actualText);
		
		
		//classname
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		
		
		Thread.sleep(4000);
		
		//linktext
		//driver.findElement(By.linkText("Logout")).click();
		
		
		
		//linktext
		driver.findElement(By.partialLinkText("ogo")).click();
		
		Thread.sleep(4000);
		
		
		
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("asiudhoaisodaposdpoai");
		
		Thread.sleep(4000);
		
		
		
	}
	
	
	

}
