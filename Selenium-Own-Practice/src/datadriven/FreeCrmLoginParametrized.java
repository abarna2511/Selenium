package datadriven;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import library.ExcelDataConfig;

public class FreeCrmLoginParametrized {
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
		ExcelDataConfig config=  new ExcelDataConfig("C:\\Users\\Vignesh\\WorkSpace\\Selenium-Own-Practice\\ExcelData\\FreeCrmTestData.xlsx");
		int rows = config.getRowCount(0);
		
		
		Object[][] data = new Object[rows][2];
		for (int i = 0; i <rows; i++) {
			data[i][0] = config.getData(0, i, 0);
			data[i][1] = config.getData(0, i, 1);
		}
		return data;
	}
}
