package nopComm_config;

//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadConfig;

public class BaseTest {
	
	WebDriver driver;
	ReadConfig ibm_conf;

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
		
		
		
		
		ibm_conf = new ReadConfig();
		
		
		String appURL = ibm_conf.get_AppURL();
		System.out.println("application url from config file: " + appURL);
		
		//app1
		//driver = WebDriverManager.chromedriver().create();
		
		
		//app2
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		driver.get(appURL);
		Thread.sleep(4000);
		
		
	}
	
	

}
