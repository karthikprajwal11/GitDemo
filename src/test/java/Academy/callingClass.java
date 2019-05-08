package Academy;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.ResetPage;
import resources.base;

public class callingClass extends base {
	
	public static Logger log=LogManager.getLogger(base.class.getName());
	
/*	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initilization();
		
	}*/
	
	@BeforeMethod
	public void initialize() throws IOException
	{
		driver=initilization();
		log.info("Driver is Initialized");
		driver.get(prop.getProperty("url"));
		log.info("The url is successfully passed and its being loaded");
		
	}

	@Test(dataProvider = "getData")
	public void HomePageNavigation(String Username, String Password) throws IOException, InterruptedException {
		log.info("Waiting for news letter notification");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='NO THANKS']")).click();
		log.info("Successfully clicked no thanks button");
		LandingPage lp = new LandingPage(driver);
		lp.getLogin().click();
		LoginPage l = new LoginPage(driver);
		l.getEmail().sendKeys(Username);
		l.getPassword().sendKeys(Password);
		log.info("Restrcicted user");
		/* System.out.println(text); */
		l.getBtn().click();
		/*
		 * driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 * l.getForgetPsw().click();
		 * 
		 * ResetPage rp=new ResetPage(driver);
		 * rp.getEmail().sendKeys("karthik@gmail.com"); rp.getgetInstructions().click();
		 */

	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
		driver=null;
	}

	@DataProvider
	public Object[][] getData() {
		/*
		 * Row stands for how many different data types test should run Column stands
		 * for how many values per each test
		 */
		Object[][] data = new Object[2][2];
		data[0][0] = "ab@gmail.com";
		data[0][1] = "12344";
		/* data[0][2]="Non-Restricted data"; */

		data[1][0] = "bc@gmail.com";
		data[1][1] = "23456";
		/* data[1][2]="Restricted data"; */

		return data;

	}

}
