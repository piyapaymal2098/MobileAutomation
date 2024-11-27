package org.example.utility;


import org.example.base.TestBase;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener extends TestBase implements ITestListener {
    public void onTestStart(ITestResult result) {

    }

    public void onTestSuccess(ITestResult result) {
    }

    public void onTestFailure(ITestResult result) {
        utility.captureScreenShot(driver,result.getMethod().getMethodName());
    }

    public void onTestSkipped(ITestResult result) {
        utility.captureScreenShot(driver,result.getMethod().getMethodName());

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    public void onStart(ITestContext context) {

    }

    public void onFinish(ITestContext context) {

    }
}
