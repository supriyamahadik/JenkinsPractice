package UtilsLayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ListenerClass extends ExtentReportClass implements ITestListener {

	private ExtentTest extenttest;
	
	public void onStart(ITestContext context) {
		ExtentReportClass.reportsSetup();
	}
	
	public void onTestStart(ITestResult result) {
		extenttest=extentreports.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		extenttest.log(Status.PASS, result.getMethod().getMethodName());
		extenttest.addScreenCaptureFromPath(ExtentReportClass.captureScreenShot("ALLPassScreenshot", result.getMethod().getMethodName()));
	}

	public void onTestFailure(ITestResult result) {
		extenttest.log(Status.FAIL, result.getMethod().getMethodName());
		extenttest.addScreenCaptureFromPath(ExtentReportClass.captureScreenShot("ALLFailScreenshot", result.getMethod().getMethodName()));
	}

	public void onTestSkipped(ITestResult result) {
		extenttest.log(Status.SKIP, result.getMethod().getMethodName());
	}

	public void onFinish(ITestContext context) {
		extentreports.flush();
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}
	public void onTestFailedWithTimeout(ITestResult result) {
	}
}
