package TestNG;

import java.awt.Window;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Action_Q_Ebay {

	WebDriver driver;
	@BeforeTest
	public void start()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void test()
	{
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	//to avoid ElementNotInteractableException
		//driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
//MouseHower_to_electronics
		Actions act=new Actions(driver);
		WebElement menu=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
		act.moveToElement(menu).perform();
//click_the_subMenu_Apple			
		WebElement submenu=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[1]/a"));
		submenu.click();
		
		
//scroll_down_vertical_by_defining_pixel
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
//scroll_down_vertical_to_the_bottom_of_the_page
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//scroll_down_vertical_until_an_element_is_visible	
		WebElement Element = driver.findElement(By.linkText("New iMac"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
	}
	@AfterTest
	public void end()
	{
		//driver.quit();
	}
}
