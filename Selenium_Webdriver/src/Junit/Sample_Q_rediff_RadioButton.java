package Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_Q_rediff_RadioButton {

	WebDriver driver;
	
	@Before
	public void start()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void test()
	{
		boolean radio=driver.findElement(By.xpath("//input[@type='radio']")).isSelected();
		
		if(radio)
		{
			System.out.println("Radio button is selected");
		}
		else
		{
			System.out.println("Radio button is not selected");
		}
	}
	
	@After
	public void end()
	{
		driver.quit();
	}
	
}
