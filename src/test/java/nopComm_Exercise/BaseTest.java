package nopComm_Exercise;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Constants;
import utility.ReadConfig;


public class BaseTest {
	
	WebDriver driver;
	  Logger log;
	  ReadConfig ibm_conf;

	@AfterTest
	public void closeApp() {
		
		System.out.println("closing application");
		
		log.info("Closing app");
		
		
		//close the application
		driver.close();  // -------- close the current browser instance
		//driver.quit();	-------- close all the browser instance which are opened by driver
	}
	
	@BeforeTest
	public void launchApp() throws Exception {
		
        log = Logger.getLogger("NOP Commerce Portal");
        
        PropertyConfigurator.configure(".\\testData\\log4j.properties");
        
        
        
        log.info("------------info-----------------");
        log.error("------------error-----------------");
        log.warn("------------warn-----------------");
        
		
        ibm_conf = new ReadConfig();
		
		
		String appURL = ibm_conf.get_AppURL();
		
		Thread.sleep(7000);
		System.out.println("application url from config file: " + appURL);
		
		//app1
		//driver = WebDriverManager.chromedriver().create();
		
		
		//app2
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		//driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		//driver.get(appURL);
		
		System.out.println(Constants.nopComm);
		driver.get(Constants.nopComm);
		
		
		Thread.sleep(4000);
		
		log.info("Launching Application");
		
		
		
	}
	
	

}
