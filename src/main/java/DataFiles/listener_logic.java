package DataFiles;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class listener_logic implements ITestListener{
	public static WebDriver driver;
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		String mname= result.getName();
		ITestListener.super.onTestSuccess(result);
		Reporter.log("testcase is passed");
		
		TakesScreenshot t1 = (TakesScreenshot) driver;
		File source = t1.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\RC-PC\\Pictures\\Screenshots\\passed\\"+mname+ Math.random() + ".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String mname= result.getName();
		ITestListener.super.onTestFailure(result);
         Reporter.log("testcase is failed");
		
		TakesScreenshot t1 = (TakesScreenshot) driver;
		File source = t1.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\RC-PC\\Pictures\\Screenshots\\failed\\"+mname + Math.random() + ".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

}
