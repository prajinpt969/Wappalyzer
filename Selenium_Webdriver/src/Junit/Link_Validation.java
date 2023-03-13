package Junit;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Validation {
	WebDriver driver;
	
	@Before
	public void start()
	{
		driver=new ChromeDriver(); 
		String url="https://www.google.com";
		driver.get(url);
	}
	@Test
	public void test()
	{
		List<WebElement> list=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:"+list.size());
		
		for(WebElement link:list )
		{
			String linkdetails=link.getAttribute("href");
			verify(linkdetails);
		}
	}
	private void verify(String linkdetails)
	{
		try {
			URL u=new URL(linkdetails);
			HttpURLConnection conn=(HttpURLConnection)u.openConnection();
			conn.connect();
			
			if(conn.getResponseCode()==200)
			{
				System.out.println("Ststus is 200..."+linkdetails);
			}
			else if(conn.getResponseCode()==404)
			{
				System.out.println("Statsus is 404...."+linkdetails);
			}
			else
			{
				System.out.println("Other status cod..."+linkdetails);
			}
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		
	}
}
