package Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


/**
 * @author raselvam
 *
 */
public class ListenerDemo implements ITestListener {

	public void onFinish(ITestContext arg0) {
		
		
	}

	
	public void onStart(ITestContext arg0) {
		
		
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
		
	}

	
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Testcase failed and details are "+result.getName());	
	}

	
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Testcase skipped and details are "+result.getName());
	}

	
	public void onTestStart(ITestResult result) {
		System.out.println("Testcase started and details are "+result.getName());	
		
	}

	//onTestSuccess-->pass
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Testcase completed and details are "+result.getName());
	}
	
	

}
