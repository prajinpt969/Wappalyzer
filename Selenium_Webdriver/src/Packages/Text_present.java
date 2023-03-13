package Packages;

import org.openqa.selenium.chrome.ChromeDriver;

public class Text_present {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String title=driver.getPageSource();
		String s="Gmail";
		if(title.contains(s))
		{
			System.out.println("Text is present");
		}
		else
		{
			System.out.println("Text is not present");
		}

	}

}
