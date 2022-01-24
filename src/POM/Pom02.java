package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom02 
{
	@FindBy(id="username")
	
	private WebElement usernameTb;
	
	Pom02(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void demo(String username)
	{
		usernameTb.sendKeys(username);
	}

}
