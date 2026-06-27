package discussion;

//import org.junit.After;
//import org.junit.Before;
//import org.testng.annotations.Test;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NOPCommLogin_classExample extends BaseTest{
	
	
	@Test
	public void login() throws Exception {
		
		System.out.println("login test case");
		Thread.sleep(7000);
		
		//driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
		
//		driver.findElement(By.xpath("//button[@class='button-1']")).click();   ///error--- unable to identify
		
//		driver.findElement(By.xpath("//button[@class='login-button']")).click();
		
		
		driver.findElement(By.xpath("//button[@class='button-1']")).click();
		
		
		Thread.sleep(5000);
		
	}
	
	
	

}
