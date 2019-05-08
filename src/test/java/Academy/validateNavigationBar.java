package Academy;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.ResetPage;
import resources.base;

public class validateNavigationBar extends base {
	
	public static Logger log=LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initilization();
		driver.get(prop.getProperty("url"));
	}

	@Test
	public void validateNavigationPage() throws IOException, InterruptedException {
		
		LandingPage lp = new LandingPage(driver);
		Assert.assertTrue(lp.getNavigationBar().isDisplayed());
		log.info("Navigation bar is verified");
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		driver=null;
	}

}
