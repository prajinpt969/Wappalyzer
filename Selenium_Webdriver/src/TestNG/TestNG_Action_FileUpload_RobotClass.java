package TestNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.netty.handler.codec.http.multipart.FileUpload;

public class TestNG_Action_FileUpload_RobotClass {

	WebDriver driver;
	@BeforeTest
	public void start()
	{
		driver =new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
	}
	@Test
	public void test() throws AWTException
	{
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		FileUpload("C:\\Users\\User\\Downloads\\Prajin's Resume");
	}
	private void FileUpload(String s) throws AWTException {
		StringSelection strselct=new StringSelection(s);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselct, null);
		Robot rob=new Robot();
		rob.delay(3000);
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.delay(200);
		rob.keyRelease(KeyEvent.VK_ENTER);
	}
}
