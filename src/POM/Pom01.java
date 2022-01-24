package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pom01
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers.geckodriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver(); // LAUNCH THE BROWSER
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do"); // enter url to open google page
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.id("username"));
		
		Pom02 p = new Pom02(driver);
		
		driver.navigate().refresh();							
		//ele.sendKeys("admin");			//StaleElementReferenceException
		
		p.demo("admin");
		
		Thread.sleep(2000);
		driver.close();
	}
}
