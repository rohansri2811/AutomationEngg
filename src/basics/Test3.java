package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
	
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		// multiple import statement --> Control + Shift + O
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		
		String title = driver.getTitle();
		driver.get(title);
		
		String ps = driver.getPageSource();
		System.out.println(ps);
		
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
