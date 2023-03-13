package Junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_Q_google_value {

	WebDriver driver;
	@Before
	public void start()
	{
		driver =new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void test()
	{
		driver.findElement(By.name("q")).sendKeys("Apple",Keys.ENTER);
	//	driver.findElement(By.name("btnK")).click();
	/*  driver.findElement(By.name("q")).sendKeys("Apple");
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[1]")).click();
	*/
	}
}
