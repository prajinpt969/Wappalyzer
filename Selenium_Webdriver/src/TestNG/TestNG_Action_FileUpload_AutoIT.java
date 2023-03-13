package TestNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Action_FileUpload_AutoIT {

	WebDriver driver;
	@BeforeTest
	public void start()
	{
		driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
	}
	@Test
	public void test() throws IOException
	{
		String title=driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		Runtime.getRuntime().exec("E:\\Selenium\\AutoIT\\SciTE\\pdf_fileUpload.exe");
		
	}
	@AfterTest
	public void end()
	{
	//	driver.quit();
	}
}
