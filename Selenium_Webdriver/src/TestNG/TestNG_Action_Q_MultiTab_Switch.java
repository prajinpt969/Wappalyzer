package TestNG;

import java.awt.RenderingHints.Key;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Action_Q_MultiTab_Switch {

	WebDriver driver;
	@BeforeTest
	public void start()
	{
		driver =new ChromeDriver();
	}
	@Test
	public void test()
	{
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		String parent_tab=driver.getWindowHandle();
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String> all_tab = driver.getWindowHandles();
		for(String handle:all_tab)
		{
			if(!handle.equalsIgnoreCase(parent_tab))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("hai@gmail.com",Keys.ENTER);
				//driver.close();
			}
			driver.switchTo().window(parent_tab);
		}
		
	}
	@AfterTest
	public void end()
	{
		//driver.quit();
	}
}
