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

public class MyntraApp {
    
    WebDriver driver;

    @AfterTest
    public void closeApp() {
        
        System.out.println("closing application");
        
        
        //close the application
        driver.close();  // -------- close the current browser instance
        //driver.quit();    -------- close all the browser instance which are opened by driver
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
        
        
        driver.get("https://www.myntra.com/");
        Thread.sleep(4000);
        
        
    }
    @Test
    public void performActionOnMyntraPortal() throws Exception {
        
        //WebElement returnPolicy = driver.findElement(By.xpath("//*[contains(text(),'Return with')]"));          
        driver.findElement(By.cssSelector("span.desktop-userTitle")).click();
        
        
        //JavascriptExecutor JS = (JavascriptExecutor) driver;
        
       // JS.executeScript("arguments[0].scrollIntoView()",  returnPolicy);
        
        
        
        
        Thread.sleep(4000);
        
    }
    
    
    
    
    

}