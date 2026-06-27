package locator_xpath_css;

//import org.junit.After;
//import org.junit.Before;
//import org.testng.annotations.Test;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NOPCommLogin extends BaseTest{
	
	
	@Test
	public void login() throws Exception {
		
		System.out.println("login test case");
		Thread.sleep(7000);
		
		System.out.println("enter user details");
		
//		driver.findElement(By.xpath(""))
//		driver.findElement(By.xpath("//input[@class='email valid']")).sendKeys("admin@yourstore.com");
		
		driver.findElement(By.xpath("//input[@id='Email']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin@yourstore.com");
		
		
		
		driver.findElement(By.xpath("//input[@id='Password']")).clear();
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("admin");
		
		
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		
		
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@href=\"/logout\"]")).click();
		
		Thread.sleep(5000);
		
	}
	
	
	

}
