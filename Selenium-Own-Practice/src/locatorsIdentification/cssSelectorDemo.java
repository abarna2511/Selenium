package locatorsIdentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorDemo {

	public static void main(String[] args) {
		System.setProperty(	"webdriver.chrome.driver", "G:\\Softwares-exe\\Studies\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input#email")).sendKeys("username");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("password");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		driver.quit();
	}

}
