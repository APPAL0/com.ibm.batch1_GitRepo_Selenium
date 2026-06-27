package logExample;

//import org.junit.After;
//import org.junit.Before;
//import org.testng.annotations.Test;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NOPCommLogin extends BaseTest_Headless{
	
	
	@Test
	public void login() throws Exception {
		
		System.out.println("login test case");
		Thread.sleep(7000);
		
		log.info("-----enter user details-----");
		
//		driver.findElement(By.xpath(""))
//		driver.findElement(By.xpath("//input[@class='email valid']")).sendKeys("admin@yourstore.com");
		
		log.info("clear email");
		driver.findElement(By.cssSelector("input[id='Email']")).clear();
		Thread.sleep(2000);
		log.info("enter email: admin@yourstore.com");
		driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("admin@yourstore.com");
		
		
		log.info("clear password");
		driver.findElement(By.cssSelector("input[id='Password']")).clear();
		log.info("enter pass: admin");
		driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("admin");
		
		log.info("click on rememberMe checkbox");
		driver.findElement(By.cssSelector("input[id='RememberMe']")).click();
		
		log.info("click on login button");
		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();


		log.info("verify application title after login, actual title: " + driver.getTitle());
//		Assert.assertEquals(driver.getTitle(), "Your store. Login");
		
		Thread.sleep(5000);
		log.info("click on logout button");
		driver.findElement(By.cssSelector("[href=\"/logout\"]")).click();
		
		Thread.sleep(5000);
		
		log.info("verify application title after logout, actual title: " + driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Your store. Login");
		
	}
	
	
	

}
