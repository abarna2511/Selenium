package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParemetersDemo {
	
	WebDriver driver ;
	
	@Test
	@Parameters({"url","browser","emailId","password"})
	public void facebookInput(String url, String browser, String emailId, String password){
		if(browser.equals("chrome")) {
			System.setProperty(	"webdriver.chrome.driver", "G:\\Softwares-exe\\Studies\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
			driver =new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			System.setProperty(	"webdriver.gecko.driver", "G:\\Softwares-exe\\Studies\\Selenium\\drivers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver =new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emailId);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
		driver.quit();
	}
}
