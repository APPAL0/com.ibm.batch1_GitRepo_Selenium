package mmtTest1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MMTTest2 {

	WebDriver driver;



//@AfterTest

public void closeMmt() throws InterruptedException {
	
	Set<String> closeWindow = driver.getWindowHandles();
	String window1 = (String)closeWindow.toArray()[0];
	
	System.out.println("closing application");
	driver.switchTo().window(window1);
	driver.close();
	
//	Thread.sleep(5000);
	//close the application
//	driver.close();  // -------- close the current browser instance
	//driver.quit();	// ----------- close all the browser instance which are opened by driver

}

@BeforeTest
public void launchMmt() throws Exception {
	
	System.out.println("launching application");
	
	
	//app1
	//driver = WebDriverManager.chromedriver().create();
	
	
	//app2
	//WebDriverManager.chromedriver().setup();
	WebDriverManager.edgedriver().setup();
	//driver = new ChromeDriver();
	driver=new EdgeDriver();
	
	driver.manage().window().maximize();
	
	Thread.sleep(4000);
	

	driver.get("https://www.makemytrip.com/");
	Thread.sleep(4000);
}
}