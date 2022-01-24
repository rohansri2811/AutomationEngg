package practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice06 //TAKE SCREENSHOT
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers.geckodriver.exe");
	}

	public static void main(String[] args) throws IOException, InterruptedException
	{
		WebDriver driver = new ChromeDriver(); // LAUNCH THE BROWSER
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/"); // enter url to open google page
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		TakesScreenshot t = (TakesScreenshot) driver;
		
		File src = t.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./Photo/hello.png");
		
		FileUtils.copyFile(src, dest);
		
		Thread.sleep(2000);
		driver.close();
				
	}

}
