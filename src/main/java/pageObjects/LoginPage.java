package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
	By Email=By.id("user_email");
	By Password=By.id("user_password");
	By Button=By.xpath("//input[@value='Log In']");
	By ForgetPsw=By.linkText("Forgot Password?");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getEmail()
	{
		return driver.findElement(Email);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(Password);
	}
	
	public WebElement getBtn()
	{
		return driver.findElement(Button);
	}
	
	public WebElement getForgetPsw()
	{
		return driver.findElement(ForgetPsw);
	}

}
