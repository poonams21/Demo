package mavenTest1.Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin 
{
	public static void main(String a[])
	{

	System.setProperty("webdriver.chrome.driver", "G:\\DriversProg\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.amazon.com/");
	System.out.println("Logged in to Amazon suceesfully. " +driver.getTitle());
	
	}
}
