package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResetPage {
	
	WebDriver driver;
	
	By Email=By.id("user_email");
	By SendInstruction=By.xpath("//input[@value='Send Me Instructions']");
	By SchoolAcc=By.linkText("Log In with a School Account");
	By CreateAcc=By.linkText("Create an Account");
	
	public ResetPage (WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getEmail()
	{
		return driver.findElement(Email);
	}
	
	public WebElement getgetInstructions()
	{
		return driver.findElement(SendInstruction);
	}
	
	public WebElement getSchoolAcc()
	{
		return driver.findElement(SchoolAcc);
	}
	
	public WebElement getCreateAcc()
	{
		return driver.findElement(CreateAcc);
	}

}
