package locatorsIdentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		System.setProperty(	"webdriver.chrome.driver", "G:\\Softwares-exe\\Studies\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//Using Single attribute
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("username");
		
		//Using multiple attribute
		driver.findElement(By.xpath("//input[@id='pass'][@name='pass']")).sendKeys("password");
		
		//Using multiple attribute with And/Or
		driver.findElement(By.xpath("//input[@value='Log In']")).click();

		driver.quit();
	}

}
