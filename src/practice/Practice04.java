package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice04 // LAUNCH A BROWSER, NAVIGATE TO URL, BACK AND FORWARD, REFRESH
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver(); // LAUNCH THE BROWSER
		driver.manage().window().maximize();
		driver.get("https://www.google.com/"); // enter url to open google page
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.facebook.com/renilraj711/?ref=pages_you_manage"); 
		Thread.sleep(2000);
		
		driver.navigate().back();  
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();

	}

}
