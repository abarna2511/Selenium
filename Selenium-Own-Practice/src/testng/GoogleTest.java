package testng;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver ;
	
	@BeforeMethod
	public void setup(){
		System.setProperty(	"webdriver.chrome.driver", "G:\\Softwares-exe\\Studies\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://google.com");
	}
	
	@Test(priority=3)
	public void googleTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=1)
	public void googleLogo() {
		boolean b = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		System.out.println("Google Logo displayed is "+b);
	}
	
	@Test(priority=2)
	public void mailLink() {
		boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println("Mail Link displayed is "+b);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
