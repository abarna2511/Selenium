package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;


public class LoginPageLandingTest extends resources.Base{
	
	@BeforeMethod
	public void initializeBrowser() throws Exception {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test(dataProvider="getData")
	public void loginPageNavigation(String uname, String pswd) throws Exception{
		HomePage home = new HomePage(driver);
		home.getLogin().click();
		LoginPage login = new LoginPage(driver);
		login.getEmail().sendKeys(uname);
		login.getPassword().sendKeys(pswd);
		login.getLoginButton().click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@DataProvider
	public Object[][] getData() {
		//Row stands for how many times should the @Test going to run
		//Col stands for how many data going to be passed for one run
		Object[][] data = new Object[2][2];
		data[0][0]="abc@gmail.com";
		data[0][1]="passwordabc";
		data[1][0]="123@gmail.com";
		data[1][1]="password123";
		return data;
	}
}
