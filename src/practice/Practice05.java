package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice05    // FILE UPLOAD POPUP
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
		driver.get("https://html.com/input-type-file/"); // enter url to open google page
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//JavascriptExecutor jse = (JavascriptExecutor) driver;     // DID NOT WORK
		//jse.executeScript("window.srollBy(0,200)");
		
		driver.findElement(By.name("fileupload")).sendKeys("C:\\Users\\Rahul Srivastava\\Downloads\\Rahul Srivastava resume word-converted (1).pdf");
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
