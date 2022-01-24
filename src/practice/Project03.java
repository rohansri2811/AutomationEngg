package practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project03  //CHILD BROWSER POPUP (MOST IMPORTANT) // CLOSE ONLY ONE POPUP
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
		System.out.println(driver);
		
		int count = all_Id.size();
		System.out.println(count);
		
		String expectedTitle = "ICICI";
		for(String popup : all_Id)
		{
			driver.switchTo().window(popup);
			
			String actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			
			if(actualTitle.equals(expectedTitle))
			{
				Thread.sleep(2000);
				driver.close();
			}
		}
	}

}
