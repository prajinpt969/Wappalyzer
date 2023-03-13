package Junit;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_prgm {

	WebDriver driver;
	
	@Before
	public void start()
	{
		driver =new ChromeDriver();
		driver.get("file:///E:/Luminar/selenium..screenshot/alertbox.html");
	}
	
	@Test
	public void test() throws IOException
	{
		//ScreenShot code of a page
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("E:\\Luminar\\selenium..screenshot/samplepage.png"));
	
		//ScreenShot code of a button ie webelement
		
		WebElement button=driver.findElement(By.xpath("/html/body/input[1]"));
		File sc=button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(sc, new File("./images/sample.png"));
	}
}
