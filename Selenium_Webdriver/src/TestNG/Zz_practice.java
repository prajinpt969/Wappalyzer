/*package TestNG;

public class Zz_practice {

}*/

package TestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Zz_practice {
	WebDriver driver;

@BeforeTest
	public void setup() 
	{
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}

@Test()
	public void test1() throws InterruptedException 
	{
		//driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement rightclick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		
		Actions act = new Actions(driver);
		act.contextClick(rightclick);
		act.perform();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[4]")).click();
		driver.switchTo().alert().accept();
		//Thread.sleep(3000);
	
	}
@Test()
	public void test2() throws InterruptedException 
	{
		//driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		WebElement doubleclick =driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		Actions act2 = new Actions(driver);
		act2.doubleClick(doubleclick).perform();
		String s = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		//act2.perform();
		
		
		//String s = a.getText();
		if(s.contentEquals("You double clicked me.. Thank You..")) 
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		//System.out.println(s);
		//a.accept();
		//Thread.sleep(3000);
	
	
	}

}
