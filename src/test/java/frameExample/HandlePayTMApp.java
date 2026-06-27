package frameExample;

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

public class HandlePayTMApp {
	
	WebDriver driver;

	@AfterTest
	public void closeApp() throws InterruptedException {
		
		System.out.println("closing application");
		
		Thread.sleep(7000);
		//close the application
		driver.close();  // -------- close the current browser instance
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
		
		
		//System.out.println(Constants.alert_app);
		driver.get("https://paytm.com/");
		Thread.sleep(4000);
		
		
	}
	@Test
	public void handleframe() throws Exception {
		
		WebElement signIn = driver.findElement(By.xpath("//span[contains(text(),'Sign')]"));				// match -3 
		signIn.click();
		
		
		Thread.sleep(3000);
		
		//handle frame
		
		//index ------- indexing start from 0
		//name or id
		//webElement
		
		//app1
		//driver.switchTo().frame(0);
		
		
		
		//app2
//		driver.switchTo().frame("name or id");
		
		
		//app3
		WebElement paytmFrame = driver.findElement(By.cssSelector("[src*='paytm-web']"));
		
		driver.switchTo().frame(paytmFrame);
		
		
		
		
		
		
		
		
		String headingFrame = driver.findElement(By.cssSelector(".heading")).getText();
		System.out.println("Heading: " + headingFrame);
		
		
		
		Assert.assertEquals(headingFrame, "To Login into your Paytm Web account");
		Assert.assertTrue(headingFrame.contains("Paytm Web account"));
		
//		
//		if(headingFrame.equals("To Login into your Paytm Web account")) {
//			
//			
//			System.out.println("-----------match---------");
//		}
//		else {
//			
//			System.out.println("-----------notmatch - failed---------");
//		}
		
		
		
//		if(headingFrame.contains("Paytm Web account")) {
//			
//			
//			System.out.println("-----------match-----Paytm Web account----");
//		}
//		else {
//			
//			System.out.println("-----------notmatch - failed---------");
//		}
		
		
		
		
		System.out.println("is Paytm Web account text present into heading Text: " + headingFrame.contains("Paytm Web account"));
		
		
		
		WebElement WatchVideo = driver.findElement(By.xpath("//span[contains(text(),'Watch')]"));	
		WatchVideo.click();
		
		
		
	}
	
	
	

}
