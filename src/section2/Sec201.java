package section2;
//SECTION 1 IMPLICIT/EXPLICIT WAIT
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sec201
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		WebDriverWait w = new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.titleContains("Enter"));
		//Thread.sleep(2000);
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		String expectedTitle = "actiTIME - Enter Time-Track";
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Pass: Home page is displayed");
		}
		else
		{
			System.out.println("Username or Password is invalid. Please try again should be displayed");
		}
		
		driver.findElement(By.id("container_reports")).click();
		actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		expectedTitle = "actiTIME - Reports Dashboard";
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("good");
		}
		else
			System.out.println("not good");
		
		Thread.sleep(2000);
		driver.close();
	}
}
