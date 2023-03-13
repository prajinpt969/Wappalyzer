package Junit;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname_Q_print_all_links {
	WebDriver driver;
	
	@Before
	public void start()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void test()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("Total no of links :"+li.size());
	    /* for (int i = 1; i<=li.size(); i = i+1)
	      {
	         System.out.println("Name of Link# " + i + li.get(i).getText());
	      }
	    */
			for(WebElement element:li)
			{
				String link=element.getAttribute("href");
				String text=element.getText();
				System.out.println(link+"...."+text);
				
				
			}
		}
	}
	
	


