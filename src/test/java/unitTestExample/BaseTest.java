package unitTestExample;

import org.junit.After;
import org.junit.Before;

public class BaseTest {
	

	@After
	public void closeApp() {
		
		System.out.println("closing application");
		
	}
	
	@Before
	public void launchApp() {
		
		System.out.println("launching application");
		
	}
	
	

}
