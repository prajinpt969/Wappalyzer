package Junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {

	WebDriver driver;
	@Before
	public void start()
	{
		driver=new ChromeDriver();
		driver.get("file:///E:/Luminar/selenium..screenshot/alertbox.html");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		a.accept();			//to accept the alert box message
		//a.dismiss();		//to reject the alert box message  
		//driver.findElement(By.xpath("//*[@id=\"fn\"]")).sendKeys("FIRST NAME");
		//driver.findElement(By.xpath("//*[@id=\"ln\"]")).sendKeys("LAST NAME");
		driver.findElement(By.name("fname")).sendKeys("Test data");
		driver.findElement(By.name("lname")).sendKeys("Test123");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
		
	}
}
