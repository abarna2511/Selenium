package browserinvoking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		
		System.setProperty(	"webdriver.chrome.driver", "G:\\Softwares-exe\\Studies\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.quit();
	}

}
