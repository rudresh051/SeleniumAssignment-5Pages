package base;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomTestListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test started...");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("test passed...");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("test failed...");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("test skipped...");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("test");
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Test execution is started");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("test execution is completed...");
		
	}

}
