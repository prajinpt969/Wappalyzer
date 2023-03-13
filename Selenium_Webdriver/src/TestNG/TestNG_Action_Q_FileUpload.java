package TestNG;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Action_Q_FileUpload {

	WebDriver driver;
	@BeforeTest
	public void start()
	{
		driver=new ChromeDriver();
		driver.get(" http://demo.guru99.com/test/upload/");
	}
	@Test
	public void test()
	{
		driver.manage().window().maximize();
//file_upload
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\User\\Downloads\\Petcare-Category-List-Screen.png");
//check_box
		driver.findElement(By.xpath("//*[@id=\"terms\"]")).isSelected();
//submit
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
	}
}
