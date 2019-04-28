package headlessbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class VerifyTitleChromeOptions {
	
	WebDriver driver;
	
	@Test
	public void verifyFacbookTitle() throws Exception {
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		System.setProperty(	"webdriver.chrome.driver", "G:\\Softwares-exe\\Studies\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver(options);
		driver.get("https://classic.crmpro.com/login.cfm");
		System.out.println("Login Page Title is === "+driver.getTitle());
		driver.findElement(By.xpath("//input[@placeholder='Login']")).sendKeys("vignesh1810");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("vignesh1810");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(5000);
		System.out.println("Home Page Title is === "+driver.getTitle());
		driver.quit();
	}

}
