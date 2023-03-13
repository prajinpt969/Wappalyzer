package Junit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethodsIf.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junit_Demo {
	WebDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver=new EdgeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void test1()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	@After
	public void browserclose()
	{
		driver.quit();
	}
}
