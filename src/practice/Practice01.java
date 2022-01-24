package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice01  //	//ALERT POPUP/JAVA SCRIPT POPUP/CONFIRMATION POPUP
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriver driver = new ChromeDriver(); //launch an empty browser chrome browser
		 driver.manage().window().maximize();	//maximize the current window
		 driver.get("http://www.javascriptkit.com/javatutors/alert2.shtml"); //open the url
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);// if the WebDriver cannot find the element immediately because
		 														// it is unavailable, then WebDriver will wait for mentioned time
		 JavascriptExecutor jse = (JavascriptExecutor) driver;	// Object type casting
		 jse.executeScript("window.scrollBy(0,200)");			// scroll down
		 
		 driver.findElement(By.name("B2")).click(); 			// find the element to show the alert popup
		 
		 Thread.sleep(2000);
		 
		 Alert a = driver.switchTo().alert();  					//to switch from page to alert popup
		 a.accept(); 											//to click on ok button
		 
		 Thread.sleep(2000);
		 driver.close();

	}

}
