package section2;
//SINGLE SELECT DROP DOWN
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Section201
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers.geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/Live%20Projects/Selenium%20soft/HCSA12/section2.html");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.id("tag"));
		
		Select s = new Select(ele);
		s.selectByIndex(3);
		Thread.sleep(3000);
		
		s.selectByValue("333");
		Thread.sleep(3000);
		
		s.selectByVisibleText("samosa");
		Thread.sleep(3000);
		driver.close();

	}

}
