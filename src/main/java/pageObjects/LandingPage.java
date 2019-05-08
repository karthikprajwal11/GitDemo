package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	WebDriver driver;
	
	By login=By.xpath("//a[contains(@href,'sign_in')]/span");
	By Title=By.xpath("//h2[text()='Featured Courses']");
	By Bar=By.xpath("//ul[@class='nav navbar-nav navbar-right']");
	
	public LandingPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}
	
	public WebElement getTitle()
	{
		return driver.findElement(Title);
	}
	
	public WebElement getNavigationBar()
	{
		return driver.findElement(Bar);
	}

}
