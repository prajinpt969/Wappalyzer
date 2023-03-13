package POM_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fb_Login_Page {

	WebDriver driver;
	By fb_email=By.name("email");
	By fb_pswd=By.name("pass");
	By fb_log=By.name("login");
	public Fb_Login_Page(WebDriver driver)
	{
		this.driver=driver;
	}

	public void Set_Values(String email, String password) {
		
		driver.findElement(fb_email).sendKeys(email);
		driver.findElement(fb_pswd).sendKeys(password);
	}
	
	public void Login_test() {
		
		driver.findElement(fb_log).click();
	}

	
}
