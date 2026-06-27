package javascriptExample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
//import org.junit.After;
//import org.junit.Before;
//import org.testng.annotations.Test;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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

public class AmazonSearchItem {
	
	WebDriver driver;

	@AfterTest
	public void closeApp() {
		
		System.out.println("closing application");
		
		
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
		
		
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		Thread.sleep(4000);
		
		
	}
	@Test
	public void performActionOnDisabledElement() throws Exception {
		
		WebElement txt_fname = driver.findElement(By.cssSelector("[name*=fname]"));			
		//txt_fname.sendKeys("enter your name");
		
		WebElement txt_lname = driver.findElement(By.cssSelector("[name*=lname]"));			
		//txt_lname.sendKeys("enter your last name");
		
		
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		
		//JS.executeScript("alert('hello');");
		
		JS.executeScript("arguments[1].value='enter your last name......'", txt_fname, txt_lname);
		JS.executeScript("arguments[0].value='enter your first name......'",  txt_fname, txt_lname);
		
		
		
		
		Thread.sleep(4000);
		
	}

	

}
