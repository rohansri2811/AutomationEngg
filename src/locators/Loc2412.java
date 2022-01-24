//launch an empty browser
package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loc2412
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		//launch a empty chrome browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//enter the actiTIME url
		driver.get("https://demo.actitime.com/login.do");
		
		//enter the valid username
		driver.findElement(By.id("username")).sendKeys("admin");
		
		//enter the valid password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		//click on login button
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		Thread.sleep(2000);
		
		//verification
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		
		String ExpectedTitle = "actiTIME - Enter Time-Track";
		
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("Pass: HomePage is displayed");
		}
		else
		{
			System.out.println("Fail: Username or Password is invalid. Please try again is displayed");
		}
		
		Thread.sleep(2000);
		driver.close();
	}

}
