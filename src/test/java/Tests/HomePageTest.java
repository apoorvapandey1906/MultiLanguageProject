package Tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ConfigReader.ConfigPropReader;
import Factory.DriverFactory;
import pages.HomePage;

public class HomePageTest {
	
	DriverFactory df;
	ConfigPropReader cf;
	Properties prop;
	WebDriver driver;
	HomePage homePage;
	
	@BeforeTest
	public void setUp() {
		cf = new ConfigPropReader();
		prop = cf.initLanguageProp("french");
		df = new DriverFactory();
		driver = df.initDriver("chrome", prop);
		homePage = new HomePage(driver);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void verifyHeader() {
		Assert.assertTrue(homePage.isHeaderPresent(prop.getProperty("header")), "Header is not present on the homepage");
	}
	
	@Test
	public void verifyContact() {
		Assert.assertTrue(homePage.isContactPresent(prop.getProperty("contact")), "Header is not present on the homepage");
	}
	
}
