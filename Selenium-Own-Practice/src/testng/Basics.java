package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basics {
	
	//Pre-Condition Annotations stars with @Before
	@BeforeSuite
	public void setUp() {
		System.out.println("Setup System Property");
	}
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("Launch Chrome Browser");
	}
	
	@BeforeClass
	public void login() {
		System.out.println("Login Method");
	}
	
	@BeforeMethod
	public void enterUrl() {
		System.out.println("Enter Url");
	}
	
	//Test cases stars with @Test
	@Test
	public void googleTitle() {
		System.out.println("Google Title");
	}
	
	@Test
	public void googleLogo() {
		System.out.println("Google Logo");
	}
	
	//Post-Condition Annotations stars with @Before
	@AfterMethod
	public void logOut() {
		System.out.println("Log Out Method");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close Browser");
	}
	
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("All Cookies Deleted");
	}
	
	@AfterSuite
	public void generateReport() {
		System.out.println("Generate Report");
	}
}
