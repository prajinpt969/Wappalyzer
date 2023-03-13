package TestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Action_RightClick_DoubleClick {

	WebDriver driver;
	@BeforeTest
	public void start()
	{
		driver =new ChromeDriver();
	}
	@Test
	public void test()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
//right click
		WebElement right=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions act=new Actions(driver);
		act.contextClick(right).perform();
		WebElement right2=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span"));
		act.contextClick(right2).perform();
		driver.switchTo().alert().accept();
//double click		
		WebElement doubleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(doubleclick).perform();
		String alerttext=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
//to verify alert
		if(alerttext.contentEquals("You double clicked me.. Thank You.."))
		{
			System.out.println("Passed message is "+ "'"+alerttext+"'");
		}
		else
		{
			System.out.println("Failed print");
		}
	}
	@AfterTest
	public void end()
	{
		//driver.quit();
	}
}
