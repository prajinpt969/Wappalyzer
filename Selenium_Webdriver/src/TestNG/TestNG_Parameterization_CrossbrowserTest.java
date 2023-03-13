package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameterization_CrossbrowserTest {
	WebDriver driver;
	@Parameters("passvalue")
	 @BeforeTest
	 public void start(String s)
	 {
		if(s.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(s.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
	 }
	@Parameters("passvalue")
	 @Test
	 public void test(String x)
	 {
		 driver.get("https://www.google.com");
		 driver.findElement(By.name("q")).sendKeys(x,Keys.ENTER);
	 }
	

}
