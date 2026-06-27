package nopComm_config;

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
		
		
		//ibm_conf.get_userName()
		
		
		System.out.println("enter user details");
		System.out.println("enter user email: " + ibm_conf.get_userName() );
		System.out.println("enter user password: " + ibm_conf.get_password() );
		
		
//		driver.findElement(By.xpath(""))
//		driver.findElement(By.xpath("//input[@class='email valid']")).sendKeys("admin@yourstore.com");
		
		driver.findElement(By.xpath("//input[@id='Email']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(ibm_conf.get_userName());
		
		
		
		driver.findElement(By.xpath("//input[@id='Password']")).clear();
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(ibm_conf.get_password());
		
		
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		
		
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@href=\"/logout\"]")).click();
		
		Thread.sleep(5000);
		
	}
	
	
	

}
