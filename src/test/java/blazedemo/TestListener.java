package blazedemo;

import org.apache.log4j.Logger;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.WebDriverManager;

public class TestListener implements ITestListener {

    private Logger logger = Logger.getLogger(TestListener.class);

    @Override
    public void onTestStart(ITestResult iTestResult) {

        logger.info(iTestResult.getName() + " start!");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        logger.info(iTestResult.getName() + " success!");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        TakeScreenShot.takeScreenShot(WebDriverManager.getInstance(),iTestResult.getName());
        logger.error(iTestResult.getName() + " failure!");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {


    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
