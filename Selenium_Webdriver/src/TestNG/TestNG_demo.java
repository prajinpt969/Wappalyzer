package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_demo {
	WebDriver driver;
	@BeforeTest
	public void start()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.google.com");
	}
	@Test (priority=1,invocationCount = 3,dependsOnMethods = {"test2"})
	public void test1()
	{
		System.out.println("this is test");
	}
	@Test (priority = 2,enabled = false)
	public void test2() 
	{
		System.out.println("this is test2");
	}
	@Test (priority = 3,enabled = false)
	public void test3()
	{
		System.out.println("ths is test3");
	}
	@AfterMethod
	public void aftermethod()
	{
		
	}
	@AfterTest
	public void end()
	{
		driver.close();
	}

}
