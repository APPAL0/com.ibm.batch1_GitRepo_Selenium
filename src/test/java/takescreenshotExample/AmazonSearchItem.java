package takescreenshotExample;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.chrome.ChromeOptions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
//import org.junit.After;
//import org.junit.Before;
//import org.testng.annotations.Test;
//import org.junit.Test;
import org.openqa.selenium.By;
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
       // driver.quit();    -------- close all the browser instance which are opened by driver
    }
    
    @BeforeTest
    public void launchApp() throws Exception {
        
        System.out.println("launching application");
        
        
        //app1
        //driver = WebDriverManager.chromedriver().create();
        
	//ChromeOptions options = new ChromeOptions();
	//	options.addArguments("--headless");
		
        
        //app2
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        
        
        driver.manage().window().maximize();
        
        Thread.sleep(4000);
        
        
       // System.out.println(Constants.alert_app);
        driver.get("https://www.amazon.in/");
        Thread.sleep(4000);
        
        
    }
    @Test
    public void handleCarList() throws Exception {
        
        WebElement txt_searchItem = driver.findElement(By.cssSelector("#twotabsearchtextbox"));         
        
        txt_searchItem.sendKeys("iphone 14");
        
        driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
        
        
        Thread.sleep(5000);
        
//      File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//      
//      File targetLocation = new File(".\\ibm_screenshot\\Amazon_search.png");
//      
//      
//      FileUtils.copyFile(screenshotFile, new File(".\\ibm_screenshot\\Amazon_search.png"));
        
        getScreenshot("ibm_amazonSearch");
        
    }
    
    
    public void getScreenshot(String fileName) throws Exception {
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        
        File targetLocation = new File(".\\ibm_screenshot\\"+fileName+".png");
        
        
        FileUtils.copyFile(screenshotFile, targetLocation);
        
    }
    
    

}
