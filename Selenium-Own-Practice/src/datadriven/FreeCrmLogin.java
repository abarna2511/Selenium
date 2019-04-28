package datadriven;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FreeCrmLogin {
	WebDriver driver;
	@Test(dataProvider = "FreeCrmData")
	public void login(String username, String password) throws InterruptedException {
		System.setProperty(	"webdriver.chrome.driver", "G:\\Softwares-exe\\Studies\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://classic.crmpro.com/login.cfm");
		driver.findElement(By.xpath("//input[@placeholder='Login']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		Assert.assertEquals(title, "CRMPRO", "Tite Does not match");
		driver.quit();
	}

	@DataProvider(name = "FreeCrmData")
	public Object[][] passData(){
		Object[][] data = new Object[5][2];
		data[0][0] = "vignesh1810";
		data[0][1] = "vignesh1810";
		data[1][0] = "abarna";
		data[1][1] = "abarna";
		data[2][0] = "bala";
		data[2][1] = "bala";
		data[3][0] = "lavanya";
		data[3][1] = "lavanya";
		data[4][0] = "param";
		data[4][1] = "param";
		return data;
	}
}
