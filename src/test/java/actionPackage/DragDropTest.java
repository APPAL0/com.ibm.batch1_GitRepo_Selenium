package actionPackage;

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

public class DragDropTest {
	
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
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		Thread.sleep(4000);
		
		
	}
	
	
	
	
	@Test
	public void doubleClickTest() throws Exception {
		
		
		//handle a frame
		WebElement photoFrame = driver.findElement(By.cssSelector("[data-src*='photo']"));	
		driver.switchTo().frame(photoFrame);
		
		
		
		
		WebElement img3 = driver.findElement(By.cssSelector("img[src*='tatras3']"));	
		WebElement img4 = driver.findElement(By.cssSelector("img[src*='tatras4']"));
		WebElement trash = driver.findElement(By.cssSelector("div#trash"));	
		
		
		
		//action class
		
		
		Actions act = new Actions(driver);
		
		//app1
		act.dragAndDrop(img3, trash).perform();
		
		
		Thread.sleep(4000);
		
		//app2
		//A convenience method that performs click-and-hold at the location of the source element, 
		//moves to the location of the target element, then releases the mouse.	
		
		act.clickAndHold(img4).moveToElement(trash).release().perform();
		
		
	}

}
