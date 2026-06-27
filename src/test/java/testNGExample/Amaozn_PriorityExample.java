package testNGExample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Amaozn_PriorityExample {

	//Priority ----
	
	//highest negative value --- having hight priority
	//By default ------ Priority is 0
	//If Priority is same ----- execution as per naming conv (ascii)
	
	
	
	
	@BeforeTest
	public void launchApp() {
		
		System.out.println("launching application");
		
	}

	
	@AfterTest
	public void closeApp() {
		
		System.out.println("closing application");
		
	}
	
	
	@Test(priority = -100, description = "login with valid user credentails")
	public void login() {
		
		System.out.println("login test case");
	}
	
	@Test()				//priority ---- 0
	public void searchItem() {
		
		System.out.println("searchItem test case");
	}
	
	
	@Test(priority = 4)
	public void logout() {
		
		System.out.println("logout test case");
	}
	
	@Test(priority = 1)
	public void addItem() {
		
		System.out.println("addItem test case");
	}
	
	@Test(priority = 3)
	public void payment() {
		
		System.out.println("payment test case");
	}
	
	
	
	@Test(priority = 3, enabled = false)
	public void cancelOrder() {
		
		System.out.println("cancelOrder test case");
	}

}
