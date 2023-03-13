package Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit_locators {

		ChromeDriver driver;
		
		@Before
		public void setup()
		{
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
		}
		
		@Test
		public void test()
		{
			driver.findElement(By.name("email")).sendKeys("prajinpt09@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("123456");
			driver.findElement(By.name("login")).click();
		}
		
		@After
		public void brwserclose()
		{
			driver.close();
		}
		
}
