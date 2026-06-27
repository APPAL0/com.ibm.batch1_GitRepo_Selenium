package mmtPackage;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class PopUpTest {
	WebDriver driver;
	


	@AfterTest
	public void closeMmt() throws InterruptedException {
		
		Set<String> closeWindow = driver.getWindowHandles();
		String window1 = (String)closeWindow.toArray()[0];
		
		System.out.println("closing application");
		driver.switchTo().window(window1);
                Thread.sleep(5000);
		//driver.close();
		
	//	Thread.sleep(5000);
		//close the application
	//	driver.close();  // -------- close the current browser instance
		driver.quit();	// ----------- close all the browser instance which are opened by driver

}

	@BeforeTest
	public void launchMmt() throws Exception {
		
		System.out.println("launching application");
		
		
		//app1
		//driver = WebDriverManager.chromedriver().create();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		//app2
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
	
		driver.get("https://www.dummysoftware.com/popupdummy_testpage.html");
		Thread.sleep(4000);
}
	@Test
	
		
		public void popupTest() throws Exception {
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window: " + parentWindow);
		System.out.println("Title of Parent Window: " +driver.getTitle());
		
		
//		Set<String> allWindow = driver.getWindowHandles();
//		System.out.println("how many windows count: " + allWindow.size());
		
		
		
		
		
		Set<String> allWindow = driver.getWindowHandles();
		System.out.println("how many windows count: " + allWindow.size());
		
		

		
		
		//String window1 = (String)allWindow.toArray()[0];
		String window2 = (String)allWindow.toArray()[1];
		String window3 = (String)allWindow.toArray()[2];
		String window4 = (String)allWindow.toArray()[3];
		
		
		//System.out.println("window1: " + window1);
		System.out.println("window2: " + window2);
		System.out.println("window3: " + window3);
		System.out.println("window4: " + window4);
		
		
		
		Thread.sleep(5000);
		
		
		
		
		//driver.switchTo().window(window1);
		//System.out.println("Application title of Window1: " + driver.getTitle());
		
		
		driver.switchTo().window(window2);
                Thread.sleep(5000);
		System.out.println("Application title of Window2: " + driver.getTitle());

		driver.close();
		
		driver.switchTo().window(window3);
                Thread.sleep(5000);
		System.out.println("Application title of window3: " + driver.getTitle());
		driver.close();
		
		driver.switchTo().window(window4);
                Thread.sleep(5000);
		System.out.println("Application title of window4: " + driver.getTitle());
		driver.close();
		Thread.sleep(5000);
}
}