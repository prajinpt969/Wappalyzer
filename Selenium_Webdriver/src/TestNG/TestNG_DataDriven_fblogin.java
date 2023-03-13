package TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_DataDriven_fblogin {

	WebDriver driver;
	@BeforeTest
	public void start() 
	{
		driver= new ChromeDriver();
	}
	@Test
	public void test() throws IOException
	{
		FileInputStream f=new FileInputStream("E:\\Selenium\\DataDriven\\fb_login.xlsx"); //load excel file
		XSSFWorkbook wb=new XSSFWorkbook(f);	//workbook
		XSSFSheet sheet=wb.getSheet("sheet1");	//sheet
		int rowcount=sheet.getLastRowNum();		//row count
		for(int i=1;i<=rowcount;i++)
		{
			String username=sheet.getRow(i).getCell(0).getStringCellValue();
			String pswd=sheet.getRow(i).getCell(1).getStringCellValue();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.name("email")).sendKeys(username);
			driver.findElement(By.name("pass")).sendKeys(pswd);
			driver.findElement(By.name("login")).click();
		}
		//driver.get("https://www.facebook.com/");
	}
}
