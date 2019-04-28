package synchronisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty(	"webdriver.chrome.driver", "G:\\Softwares-exe\\Studies\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.alaskaair.com/hotels");
		driver.findElement(By.xpath("//input[@placeholder='Where do you need a hotel?']")).sendKeys("nyc");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Where do you need a hotel?']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='New York Marriott at the Brooklyn Bridge']")).click();

	}

}
