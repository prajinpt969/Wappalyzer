package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Wappalyzer {

	WebDriver driver;
	@BeforeTest
	public void start()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void test()
	{
		//1. Go to https://www.wappalyzer.com/
		driver.get("https://www.wappalyzer.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Actions act=new Actions(driver);
		//2. Click on Resources
		WebElement menu1=driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/header/div/div/div/div[2]/button[2]"));
		menu1.click();
		
		//3. Click on Technologies
		WebElement submenu1=driver.findElement(By.xpath("//*[@id=\"list-item-50\"]/div/div[1]"));
		submenu1.click();
		
		//4. Click on Shopify
		WebElement shopify=driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[2]/div/div[2]/div[1]/div[1]/a/div/div/div[2]"));
		shopify.click();
		
		//5. Click on Create a lead list
		WebElement createaleadlist=driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[1]/div[2]/div[3]/div/div/a/span"));
		createaleadlist.click();
		
		//6. Select Technologies
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\\\"app\\\"]/div/main/div/div[2]/div/div[2]/form/div[1]/div[1]/div[1]/div/div[1]/button")));
		WebElement select=driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div/div[2]/form/div[1]/div[1]/div[1]/div/div[1]/button"));
		select.click();
		
		//7. Click Find Technology and enter Java
		WebElement fromDropDwon =driver.findElement(By.xpath("//*[@id=\\\"input-370\\\"]"));
		fromDropDwon.sendKeys("Java");
		fromDropDwon.sendKeys(Keys.ARROW_DOWN);
		fromDropDwon.sendKeys(Keys.ENTER);
	}		
	@AfterTest
	public void end()
	{
		//driver.quit();
	}
}
