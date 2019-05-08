package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PortalPage {

	WebDriver driver;
	By searchbar= By.id("search-courses");
	
	public PortalPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public WebElement SerchBar()
	{
		return driver.findElement(searchbar);
	}
}
