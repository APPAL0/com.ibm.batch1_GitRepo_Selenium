package testNGExample;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerExample implements ITestListener{

public void onTestStart(ITestResult result) {
		
		System.out.println("execution of test case get started: " + result.getName());
		
	}


	public void onTestSuccess(ITestResult result) {
		
		
	}

	
	public void onTestFailure(ITestResult result) {
		
		
		
		System.out.println("=================capturing a screenshot====================");
		System.out.println("test case failed: " + result.getName());
		
	}

	
	public void onTestSkipped(ITestResult result) {
		
		
	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}


	public void onStart(ITestContext context) {
		
		
	}

	public void onFinish(ITestContext context) {
		
		
	}

}


