package unitTestExample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import org.junit.Test;

public class TestNGExample {

	
	@BeforeTest
	public void launchApp() {

		System.out.println("launching app");
	}

	@AfterTest
	public void closeApp() {

		System.out.println("closing app");
	}

	@Test
	public void TC_verifyLoginFeature() {

		System.out.println("login test case using testNG");
	}

}
