package section2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section207
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
		driver.get("https://paytm.com/");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		Thread.sleep(2000);
		
		//driver.switchTo().frame(0);
		
		WebElement ele = driver.findElement(By.xpath("//iframe[@scrolling='no']"));
		driver.switchTo().frame(ele);
		
		driver.findElement(By.xpath("//span[contains(text(),'Google Play')]")).click();
		
		Thread.sleep(2000);
		driver.quit();

	}

}
