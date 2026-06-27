package browserStack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;


import java.net.URL;

public class BrowserStack_HRM {
	
	WebDriver driver;
	
	public static final String USERNAME="anuppal_aHeNRZ";
	public static final String AUTOMATE_KEY= "Ug2CAcX8HZ35daGLz4ds";
	
	public  static final String URL="https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd.hub";
	
	
	@BeforeMethod
	
	public void setup() throws Exception {
		
		String browserName="chrome";
		String os="chrome";
		String os_version="chrome";
		String browser_version= "chrome";
		System.out.println("browser name is:" +browserName);
		
		DesiredCapabilities caps=new DesiredCapabilities();
		
	//	caps.setCapability("os", os);
	//	caps.setCapability("os_version", os_version);
	//	caps.setCapability("browser_version", browser_version);
		
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Google Pixel 3a V9.0");
		
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, MobileBrowserType.CHROME);
		
		caps.setCapability("build","chrome browser script");
		
		caps.setCapability("name","Run chrome on device- NOP Comm Test on Cloud");
		
		driver = new RemoteWebDriver (new URL(URL),caps);
		
	}

	@Test
	public void login() throws Exception {
		
		System.out.println("login test case");
		Thread.sleep(4000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    Thread.sleep(4000);
		
		
		
	    driver.findElement(By.cssSelector("input[placeholder*='Username']")).clear();
		
		WebElement txtUserName = driver.findElement(By.name("username"));
		
		txtUserName.sendKeys("Admin");
		
		driver.findElement(By.cssSelector("input[placeholder*='Password']")).clear();
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
	
		Thread.sleep(4000);

		driver.findElement(By.linkText("Logout")).click();

		Thread.sleep(4000);
		
		
		
	}
	

}
