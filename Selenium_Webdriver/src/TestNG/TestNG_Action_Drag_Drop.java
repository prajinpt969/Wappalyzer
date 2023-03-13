package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Action_Drag_Drop {
	WebDriver driver;
	@BeforeTest
	public void start()
	{
		driver =new ChromeDriver();
	}
	@Test
	public void test()
	{
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		WebElement from=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement to=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(from, to).build().perform();
		String text=to.getText();
		if(text.contentEquals("Dropped!"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	@AfterTest
	public void end()
	{
		driver.quit();
	}

}
