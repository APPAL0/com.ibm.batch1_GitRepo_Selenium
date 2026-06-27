package retryExample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest {
	@Test
	public void addItem() {
		
		System.out.println("add item test case");
		//Assert.assertTrue(false);
	}
	
	//@Test(retryAnalyzer = retryExample.RetryLogic.class)
	
	@Test
	public void payment() {
		
		System.out.println("payment test case");
		Assert.assertTrue(false);
	}
	
	
	@Test(priority = -1)
	public void login() {
		
		System.out.println("login test case");
	}
	
	@Test(priority = 2)
	public void logout() {
		
		System.out.println("logout test case");
	}

}
