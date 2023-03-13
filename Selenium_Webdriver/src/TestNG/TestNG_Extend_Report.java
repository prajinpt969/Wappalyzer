package TestNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.netty.handler.codec.http.HttpContentEncoder.Result;

public class TestNG_Extend_Report {
	
	WebDriver driver;
	String base_url="https://www.facebook.com/";
	ExtentHtmlReporter reporter;				//class used to change look & feel
	ExtentReports extent;						//class used to add new entries
	ExtentTest test;							//class used to update entries
	
@BeforeTest
	public void start_test()
	{
		reporter=new ExtentHtmlReporter("./Report/Demo_report1.html");		// ./ refers to local directory
		reporter.config().setDocumentTitle("Automation_Report");
		reporter.config().setReportName("Functional_Test");
		reporter.config().setTheme(Theme.DARK);
		
		extent =new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Host_Name", "localhost");
		extent.setSystemInfo("OS", "Windws10");
		extent.setSystemInfo("Tester_Name", "PRAJIN");
		extent.setSystemInfo("Browser_Name", "Chrome");
		driver=new ChromeDriver();
	}
@BeforeMethod
	public void start_method()
	{
		driver.get(base_url);
	}
@Test
	public void FB_Title_Verification()
	{
		test=extent.createTest("FB_Title_Verification");	//to create test area in report
		String exp="Facebook";
		String actual=driver.getTitle();
		Assert.assertEquals(exp, actual);					//verifing or comparing
	}
@Test
	public void FB_Button_Test()
	{
		test=extent.createTest("FB_Button_Test");
		String buttontext=driver.findElement(By.xpath("//*[@id=\"u_0_9_5K\"]")).getText();
		Assert.assertEquals(buttontext, "Log In");
	}
@Test
	public void FB_Logo_Test()
	{
		test=extent.createTest("FB_Logo_Test");
		boolean b=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div[1]/img")).isDisplayed();
		Assert.assertTrue(b);
	}
@AfterMethod
	public void end_method(ITestResult result) throws IOException		//ITest is a listener in testnG
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "Testcase failed is "+result.getName());
			test.log(Status.FAIL, "Testcase failed is "+result.getThrowable());
			String screenshotpath=TestNG_Extend_Report.screenshotMethod(driver,result.getName());
			test.addScreenCaptureFromPath(screenshotpath);
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "Test case Skipped is "+result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "Testcase Passed is "+result.getName());
		}
	}
		private static String screenshotMethod(WebDriver driver2, String screenshotname) throws IOException
		{
			File src=((TakesScreenshot)driver2).getScreenshotAs(OutputType.FILE);
			String destination="./images/"+screenshotname+".png";
			FileHandler.copy(src, new File(destination));
			return destination;
		}
@AfterTest
	public void end_test()
	{
		extent.flush();
	}
}
