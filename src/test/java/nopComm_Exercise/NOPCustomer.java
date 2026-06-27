package nopComm_Exercise;

import java.util.concurrent.TimeUnit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NOPCustomer extends BaseTest {

	@Test
	public void login() throws Exception {
		
		System.out.println("login test case");
		
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("enter user details");
		
//		driver.findElement(By.xpath(""))
//		driver.findElement(By.xpath("//input[@class='email valid']")).sendKeys("admin@yourstore.com");
		
		driver.findElement(By.xpath("//input[@id='Email']")).clear();
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin@yourstore.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='Password']")).clear();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("admin");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		
		//Thread.sleep(7000);
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.cssSelector("html>body>div:nth-of-type(3)>aside>div>div:nth-of-type(4)>div>div>nav>ul>li:nth-of-type(4)>a")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//p[text()=' Customers']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='SearchFirstName']")).sendKeys("Virat");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='SearchLastName']")).sendKeys("Kohli");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='search-customers']")).click();
		Thread.sleep(9000);
		
	
	
	

}
}
