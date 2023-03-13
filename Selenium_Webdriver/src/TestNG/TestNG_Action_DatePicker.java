package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Action_DatePicker {

	WebDriver driver;
	@BeforeTest
	public void start()
	{
		driver=new ChromeDriver();
		driver.get("https://www.expedia.com/");
				
	}
	@Test
	public void test()
	{
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"wizardMainRegionV2\"]/div/div/div/div/ul/li[2]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click();
		while(true)
		{
			WebElement month=driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[2]/h2"));
			String month1=month.getText();
			//if(month1.equals("February 2023"))
			if(month1.equals("May 2023"))
			{
				break;
			}
			else
			{
				//driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/button[2]")).click();
				  driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/button[2]")).click();
			}
		}
		List<WebElement> All_dates=driver.findElements(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[2]/table/tbody/tr/td/button"));
		for(WebElement date_element:All_dates)
		{
			String day=date_element.getAttribute("data-day");
			
			if(day.equals("9"))
			{
				date_element.click();
			}
		}
		driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/button")).click();
	}
}
