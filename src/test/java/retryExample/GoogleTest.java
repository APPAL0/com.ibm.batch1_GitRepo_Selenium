package retryExample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest {

	@Test
	public void searchItemOnGooglePage() {
		
		System.out.println("searchItemOnGooglePage test case");
		Assert.assertTrue(true);
	}
	
	//@Test(retryAnalyzer = retryExample.RetryLogic.class)
	
	@Test
	public void verifyGpayFeature() {
		
		System.out.println("verifyGpayFeature test case");
		Assert.assertTrue(true);
	}
	
	

}
