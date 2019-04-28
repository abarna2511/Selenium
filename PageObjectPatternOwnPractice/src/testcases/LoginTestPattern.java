package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import objectrepositorypattern.LoginPagePattern;

public class LoginTestPattern {
	WebDriver driver;
	@Test
	public void login() {
		System.setProperty(	"webdriver.chrome.driver", "G:\\Softwares-exe\\Studies\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://classic.crmpro.com/login.cfm");
		LoginPagePattern login = new LoginPagePattern(driver);
		login.enterUserName().sendKeys("vignesh1810");
		login.enterPassword().sendKeys("vignesh1810");
		login.clickLoginButton().click();
	}

}
