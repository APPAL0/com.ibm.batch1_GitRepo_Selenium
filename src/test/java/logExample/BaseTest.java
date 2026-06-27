package logExample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
    
    WebDriver driver;
    Logger log;

    @AfterTest
    public void closeApp() {
        
        
        
        log.info("closing an application");
        
        
        //close the application
        driver.close();  // -------- close the current browser instance
        //driver.quit();    -------- close all the browser instance which are opened by driver
    }
    
    @BeforeTest
    public void launchApp() throws Exception {
        
        
        
        //log = Logger.getLogger("NOP Comm App");
        
        log = Logger.getLogger("Orange HRM Portal");
        
        PropertyConfigurator.configure(".\\testData\\log4j.properties");
        
        
        
        log.info("------------info-----------------");
        log.error("------------error-----------------");
        log.warn("------------warn-----------------");
        
        
        
        
        //app1
        //driver = WebDriverManager.chromedriver().create();
        
        
        //app2
        ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
        
       // WebDriverManager.chromedriver().setup();
       // driver = new ChromeDriver();
        
        log.info("launching chrome browser");
        driver.manage().window().maximize();
        
        Thread.sleep(4000);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(4000);
        log.info("launching application: " + "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        
    }
    
    

}
