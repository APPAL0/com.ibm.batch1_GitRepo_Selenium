package logExample;

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
		
		log.info("-----enter user details-----");
	
		log.info("clear username");
		
	      driver.findElement(By.cssSelector("input[placeholder*='Username']")).clear();
		
		WebElement txtUserName = driver.findElement(By.name("username"));
		
		 log.info("enter username: Admin");
		
		txtUserName.sendKeys("Admin");
		
		log.info("clear password");
		
		driver.findElement(By.cssSelector("input[placeholder*='Password']")).clear();
		
		log.info("enter password: admin123");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		
		
		//tagname
		//driver.findElement(By.tagName("button")).click();
		
		
		Thread.sleep(4000);
		
		
		//linktext
		//driver.findElement(By.linkText("Logout")).click();
		
		
		
	
		//Thread.sleep(4000);
		
		
		
	}
	
	
	

}
