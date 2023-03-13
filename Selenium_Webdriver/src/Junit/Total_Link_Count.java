package Junit;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;


public class Total_Link_Count {
	WebDriver driver;
	
	@Before
	public void start()
	{
		driver=new ChromeDriver();
		String url="https://www.yatra.com/";
		driver.get(url);
	}
	@Test
	public void test()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links :"+li.size());
	}
	@After
	public void end()
	{
		driver.quit();
	}

}
