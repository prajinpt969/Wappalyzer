package Junit;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample_Q_rediff_check_select_box_valuepass {

	WebDriver driver;
	@Before
	public void start()
	{
		driver =new ChromeDriver();
		String url="https://register.rediff.com/register/register.php?FormName=user_details";
		driver.get(url);
	}
	@Test
	public void test()
	{
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
		
		List<WebElement> list1=dropdown1.getOptions();
		int size1=list1.size();
		System.out.println("Totol count of options in Date field is : "+(size1-1));
		for(int i=1;i<size1;i++)
		{
			String values1= list1.get(i).getText();
			System.out.println(values1);
		}
		
		List<WebElement> list2=dropdown2.getOptions();
		int size2=list2.size();
		System.out.println("Totol count of options in Month field is : "+(size2-1));
		for(int i=1;i<size2;i++)
		{
			String values2= list2.get(i).getText();
			System.out.println(values2);
		}
		
		List<WebElement> list3=dropdown3.getOptions();
		int size3=list3.size();
		System.out.println("Totol count of options in Year field is : "+(size3-1));
		for(int i=1;i<size3;i++)
		{
			String values3= list3.get(i).getText();
			System.out.println(values3);
		}
	}
	@After
	public void end()
	{
		driver.close();
	}
}
