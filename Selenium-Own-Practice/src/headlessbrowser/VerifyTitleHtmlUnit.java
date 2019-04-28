package headlessbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class VerifyTitleHtmlUnit {
	
	WebDriver driver;
	
	@Test
	public void verifyFreeCrmTitle() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Softwares-exe\\Studies\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new HtmlUnitDriver();
		//driver =new ChromeDriver();
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
