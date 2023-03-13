package POM_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fb_Login_Forgot_Password_Page {
	WebDriver driver;
	//By forgt_click=By.xpath("//*[contains(text(),'Forgotten password?')]");
	By f_email=By.xpath("//*[@id=\"identify_email\"]");
	By search =By.xpath("//*[@id=\"did_submit\"]");
	By forgt_click=By.linkText("Forgotten password?");
		public Fb_Login_Forgot_Password_Page(WebDriver driver2) 	{
			this.driver=driver2;
		}

		public void forgot_ctest() {
			driver.findElement(forgt_click).click();
	}

		public void setvalues(String email2) {
			driver.findElement(f_email).sendKeys(email2);
			
		}
		public void search()
		{
			driver.findElement(search).click();
		}


}
