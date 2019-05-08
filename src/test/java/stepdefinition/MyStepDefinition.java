package stepdefinition;

import org.openqa.selenium.By;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.PortalPage;
import resources.base;

public class MyStepDefinition extends base {

	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
		driver=initilization();
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and login$")
	public void user_enters_something_and_something_and_login(String strArg1, String strArg2) throws Throwable {
		LoginPage l = new LoginPage(driver);
		l.getEmail().sendKeys(strArg1);
		l.getPassword().sendKeys(strArg2);
		l.getBtn().click();
	}

	@Then("^Verify the user is successfully logged in$")
	public void verify_the_user_is_successfully_logged_in() throws Throwable {
		PortalPage pp=new PortalPage(driver);
		Assert.assertTrue(pp.SerchBar().isDisplayed());
	}

	@And("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_something_site(String strArg1) throws Throwable {
		driver.get(strArg1);
	}

	@And("^click on login link in home poage to land on sign on page$")
	public void click_on_login_link_in_home_poage_to_land_on_sign_on_page() throws Throwable {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='NO THANKS']")).click();
		LandingPage lp = new LandingPage(driver);
		lp.getLogin().click();
	}

}
