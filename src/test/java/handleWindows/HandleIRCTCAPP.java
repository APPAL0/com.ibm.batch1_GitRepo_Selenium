package handleWindows;

import java.util.Set;

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

public class HandleIRCTCAPP {
	
	WebDriver driver;

	@AfterTest
	public void closeApp() throws InterruptedException {
		
		System.out.println("closing application");
		
		Thread.sleep(7000);
		//close the application
		//driver.close();  // -------- close the current browser instance
		driver.quit();	//-------- close all the browser instance which are opened by driver
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
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(4000);
		
		
	}
	@Test
	public void verifyHotelBooking() throws Exception {
		
		
		
		//multiple window
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window: " + parentWindow);
		
		
//		Set<String> allWindow = driver.getWindowHandles();
//		System.out.println("how many windows count: " + allWindow.size());
		
		
		driver.findElement(By.partialLinkText("HOTELS")).click();
		
		
		Set<String> allWindow = driver.getWindowHandles();
		System.out.println("how many windows count: " + allWindow.size());
		

		
		
		String window1 = (String)allWindow.toArray()[0];
		String window2 = (String)allWindow.toArray()[1];
		
		
		System.out.println("window1: " + window1);
		System.out.println("hotelWindow: " + window2);
		
		
		
		Thread.sleep(5000);
		
		System.out.println("===================hotel Window======================");
		
		
		driver.switchTo().window(window2);
		System.out.println("Application title: " + driver.getTitle());
		
		
		
		
//		
//		if(!driver.getTitle().contains("Hotel")) {
//			
//			
//			
//			
//		}
//		else {
//			
//			
//		}
	
		
		
		
		driver.findElement(By.partialLinkText("Login")).click();
		
		
		
		
		
		Thread.sleep(5000);
		
		System.out.println("===================main Window======================");
		
		
		driver.switchTo().window(window1);
		System.out.println("Application title: " + driver.getTitle());
		
		driver.findElement(By.partialLinkText("CONTACT US")).click();
		
		
		
		
		Thread.sleep(5000);
		
		System.out.println("===================hotel Window===again===================");
		
		
		driver.switchTo().window(window2);
				
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(5000);
		
	}
	
	
	

}
