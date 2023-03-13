package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_parameterization_Q_reddifmail {
	WebDriver driver;
	
	@BeforeTest
		public void start()
		{
			driver=new ChromeDriver();
		}
	@BeforeMethod
		public void startmethod()
		{
			String url="https://register.rediff.com/register/register.php?FormName=user_details";
			driver.get(url);
		}
	@Test 
		public void rediffpage()
		{
//logo_is_displayed_or_not
		
			boolean q=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
			if(q==true)
			{
				System.out.println("Logo is displayed");
			}
			else
			{
				System.out.println("not displayed");
			}
//fullname
			driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("prajin");
//rediff_id
			driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("prajin159");
//check_availability
			String buttontext= driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).getAttribute("value");
			if(buttontext.equals("Check availability"))
			{
				System.out.println("text is same");
			}
			else
			{
				System.out.println("not same");
			}
//password
			driver.findElement(By.xpath("//*[@id=\"newpasswd\"]")).sendKeys("123456");
//retype_password
			driver.findElement(By.xpath("//*[@id=\"newpasswd1\"]")).sendKeys("123456");
//alternate_email_address
			driver.findElement(By.xpath("//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input")).sendKeys("prajinpt09@gmail.com");
//check_box
			boolean box=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).isSelected();
			if(box==true)
			{
				System.out.println("box is checked");
			}
			else
			{
				System.out.println("box is not checked");
			}
//mobile_no
			driver.findElement(By.xpath("//*[@id=\"mobno\"]")).sendKeys("9947785187");
//date_of_birth
			
			WebElement x=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
			Select dropdown1=new Select(x);
			dropdown1.selectByIndex(9);
			
			WebElement y=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
			Select dropdown2=new Select(y);
			//dropdown2.selectByIndex(05);
			dropdown2.selectByVisibleText("MAY");
			
			WebElement z=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
			Select dropdown3=new Select(z);
			dropdown3.selectByVisibleText("1996");
			
//gender
			
			boolean radio=driver.findElement(By.xpath("//input[@type='radio']")).isSelected();
			
			if(radio)
			{
				System.out.println("Radio button is selected");
			}
			else
			{
				System.out.println("Radio button is not selected");
			}
//country
			WebElement a=driver.findElement(By.xpath("//*[@id=\"country\"]"));
			Select country=new Select(a);
			country.selectByVisibleText("India");
//city
			WebElement b=driver.findElement(By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select"));
			Select city=new Select(b);
			city.selectByVisibleText("Cochin");
		}

}
