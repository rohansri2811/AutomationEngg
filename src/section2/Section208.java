package section2;
//AUTO-SUGGESTIONS
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section208 
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
		driver.get("https://www.google.co.in/");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("seleni");
		Thread.sleep(2000);
		
		List<WebElement> ele1 = driver.findElements(By.xpath("//li[@class='sbct']"));
		
		int count = ele1.size();
		System.out.println(count);
		
		for(int i = 0;i<count;i++)
		{
			String text = ele1.get(i).getText();
			System.out.println(text);
		}
		
		ele1.get(2).click();
		
		Thread.sleep(2000);
		driver.close();
	}

}
