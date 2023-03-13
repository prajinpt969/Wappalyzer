package Junit;

import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	ChromeDriver driver;
	
	@Before
	public void start()
	{
		driver =new ChromeDriver();
		driver.get("https://www.amazon.in");																			//open 'amazon.in' site
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobiles",Keys.ENTER);				//enter mobiles in 'search field' & enter
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[@   href='/deals?ref_=nav_cs_gb']")).click();											//click 'todays deals'
		driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();											//click 'cart'
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();							//click 'hello sign in'
		driver.findElement(By.xpath("//div[@class='a-row a-spacing-base']/input[1]")).sendKeys("abc@gmail.com");		//enter invalid email address 
		driver.findElement(By.xpath("//span[@class='a-button-inner']/input[@id='continue']")).click();					//click 'continue'
		driver.navigate().back();																						//navigate to back page
		driver.navigate().back();																						//navigate to back page
		driver.navigate().back();																						//navigate to back page
		driver.navigate().back();																						//navigate to back page
		driver.navigate().back();																						//navigate to back page
		driver.findElement(By.xpath("//span[@class='hm-icon-label']")).click();											//click hangberger menu
	
	}
	

}
