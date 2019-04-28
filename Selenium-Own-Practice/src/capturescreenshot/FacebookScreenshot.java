package capturescreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import library.Utility;

public class FacebookScreenshot {
	
	WebDriver driver;
	@Test
	public void openFacebook() throws Exception {
		System.setProperty(	"webdriver.chrome.driver", "G:\\Softwares-exe\\Studies\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		Utility.captureScreenShot(driver, "FacebookOpen");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("emailid");
		Utility.captureScreenShot(driver, "EmailIdEnter");
		driver.quit();
	}
}
