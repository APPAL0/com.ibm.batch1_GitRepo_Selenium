package controlExample;

import org.openqa.selenium.Alert;
//import org.junit.After;
//import org.junit.Before;
//import org.testng.annotations.Test;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Constants;

public class HandleAlertExample2 extends BaseTest{
	

	WebDriver driver;

	//@AfterTest
	public void closeApp() {
		
		System.out.println("closing application");
		
		
		//close the application
		driver.close();  // -------- close the current browser instance
		//driver.quit();	-------- close all the browser instance which are opened by driver
	}
	
	//@BeforeTest
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
		driver.get("file:///C:/Users/91995/Downloads/Test.html");
		Thread.sleep(4000);
		
		
	}
	
	
	
	
	//@Test
	public void promptAlert() throws Exception {
		
		System.out.println("prompt Alert Example");
		//Thread.sleep(4000);

		
		
		WebElement ShowMeAlertButton = driver.findElement(By.cssSelector("[onclick=\"generatePromptBox()\"]"));
		ShowMeAlertButton.click();
		
		Thread.sleep(4000);
		
		
		//handle an alert
		
		Alert promptAlert = driver.switchTo().alert();
		
		
		String alertText = promptAlert.getText();
		System.out.println("Alert TExt: " + alertText);
		
		
		
		
		promptAlert.sendKeys("Shalini");
		
		
		
		//promptAlert.dismiss();
		
		promptAlert.accept();
		
		
		//validation step
		Assert.assertEquals(alertText, "Please enter your name:");				///pass the test case ---- match........ Hi.. This is alert message!
		
		
		
		
		
		
		
		Thread.sleep(6000);
		
		
		
	}
	
	
	

}
