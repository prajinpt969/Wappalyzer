package POM_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM_Page.Fb_Login_Page;

public class Fb_Login_Test {

	WebDriver driver;
	String base_url="https://www.facebook.com/";
	@BeforeTest
	public void start_test()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void start_method()
	{
		driver.get(base_url);
	}
	@Test
	public void test()
	{
		Fb_Login_Page ob=new Fb_Login_Page(driver);
		ob.Set_Values("qwerty","qwerty123");
		ob.Login_test();
		
	}
}
