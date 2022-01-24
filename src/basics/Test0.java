package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test0
{
	public static void main(String[] args) throws InterruptedException
	{
		String key = ("webdriver.chrome.driver");
		String value = ("./drivers/chromedriver.exe");
		
		System.setProperty(key, value);  //setProperty-> which type of driver
		
		ChromeDriver driver = new ChromeDriver(); // in-built statement used to launch the empty browser
		
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
