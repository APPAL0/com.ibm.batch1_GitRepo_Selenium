package crossBrowserTest;

//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
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
		
		
		
		
		String browser = "edge";
		
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			System.out.println("Execution of test on chrome browser");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		
		else if(browser.equalsIgnoreCase("edge")) {
			
			System.out.println("Execution of test on edge browser");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
			
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			
			System.out.println("Execution of test on firefox browser");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
			
		}
		
		else {
			
			System.out.println("Execution of test on default chrome browser");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		
//		//app1
//		//driver = WebDriverManager.chromedriver().create();
//		
//		
//				System.out.println("Execution of test on chrome browser");
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		
//		//app2
//		
////		System.out.println("Execution of test on chrome browser");
////		WebDriverManager.chromedriver().setup();
////		driver = new ChromeDriver();
//		
//		
//		
//		System.out.println("Execution of test on edge browser");
//		WebDriverManager.edgedriver().setup();
//		driver = new EdgeDriver();
//		
		
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		driver.get(appURL);
		Thread.sleep(4000);
		
		
	}
	
	

}
