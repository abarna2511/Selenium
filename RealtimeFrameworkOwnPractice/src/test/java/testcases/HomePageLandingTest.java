package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageLandingTest extends resources.Base{
	
	@BeforeMethod
	public void initializeBrowser() throws Exception {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test()
	public void loginPageNavigation(){
		Assert.assertEquals(driver.getTitle(), "QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy", "Wrong Title");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
