package xpathAxisExample;

import org.openqa.selenium.Alert;
//import org.junit.After;
//import org.junit.Before;
//import org.testng.annotations.Test;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Constants;

public class Amazon_SeeMoreExample {
	
	WebDriver driver;

	@AfterTest
	public void closeApp() throws InterruptedException {
		
		System.out.println("closing application");
		
		Thread.sleep(7000);
		//close the application
		//driver.close();  // -------- close the current browser instance
		//driver.quit();	-------- close all the browser instance which are opened by driver
	}
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		System.out.println("launching application");
		
		
		//app1
		//driver = WebDriverManager.chromedriver().create();
		
		
		//app2
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		
		System.out.println(Constants.alert_app);
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		
		
	}
	
	
	
	
	@Test
	public void doubleClickTest() throws Exception {
		
		
		//handle a frame
//		WebElement ele_SeeMore = driver.findElement(By.xpath("//h2[contains(text(),'Appliances for your home | Up to 55% off')]//parent::div//following-sibling::div[contains(@class,'foo')]/a[text()='See more']"));	
//		ele_SeeMore.click();
		
		
		WebElement ele_SeeMore = driver.findElement(By.xpath("//h2[contains(text(),'ls | Up to 60% off')]//parent::div//following-sibling::div[contains(@class,'foo')]/a[text()='See more']"));	
		ele_SeeMore.click();
		
		
	}

}
