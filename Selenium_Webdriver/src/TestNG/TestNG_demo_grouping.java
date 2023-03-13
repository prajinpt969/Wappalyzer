package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_demo_grouping {

	WebDriver driver;
	@BeforeTest
	public void start()
	{
		driver =new ChromeDriver();
	}
	@BeforeMethod(alwaysRun = true)
	public void urlloading()
	{
		driver.get("https://www.google.com");
	}
	@Test ( groups= {"smoke","sanity"})
	public void test1()
	{
		System.out.println("smoke1");
	}
	@Test (groups = {"sanity"} )
	public void test2()
	{
		//test activity
	}
	@Test (groups = {"sanity"} )
	public void test3()
	{
		//test activity
	}
	@Test (groups = {"regression"})
	public void test4()
	{
		//test activity
	}
	@Test (groups = {"smoke"} )
	public void test5()
	{
		System.out.println("smoke2");
	}
	@AfterMethod
	public void aftermethod()
	{
		
	}
	@AfterTest
	public void end()
	{
		
	}
}
