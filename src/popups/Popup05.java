package popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//CHILD BROWSER POP-UP MOST IMPORTANT
public class Popup05
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
		driver.get("https://www.naukri.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> AllId = driver.getWindowHandles();
		System.out.println(AllId);
		
		int count = AllId.size();
		System.out.println(count);
		
		for(String popup : AllId)			//IF I WANT TO CLOSE ALL THE POPUPS ONE AT A TIME
		{
			driver.switchTo().window(popup);
		
			Thread.sleep(2000);
			driver.close();
		}
	}
	

}
