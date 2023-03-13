package Packages;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class First_Script {

	public static void main(String[] args) {
		ChromeDriver cdriver=new ChromeDriver();
		cdriver.get("https://www.google.com");
		String title=cdriver.getTitle();
		String s="google";
		if(title.equalsIgnoreCase(s))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		EdgeDriver edriver=new EdgeDriver();
		edriver.get("https://www.facebook.com");
		String etitle=edriver.getTitle();
		String es="google";
		if(etitle.equals(es))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		FirefoxDriver fdriver=new FirefoxDriver();
		fdriver.get("https://www.google.com");
	}

}
