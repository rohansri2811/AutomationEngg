package practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice02  // CHILD BROWSER POPUP (MOST IMPORTANT) // CLOSE ALL THE POPUP ONE AT A TIME
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> all_Id = driver.getWindowHandles();
		System.out.println(all_Id);
		
		for(String popup : all_Id)
		{
			driver.switchTo().window(popup);
			
			Thread.sleep(2000);
			driver.close();
		}
	}
}
