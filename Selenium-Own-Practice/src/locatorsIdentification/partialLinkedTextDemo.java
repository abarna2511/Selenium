package locatorsIdentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partialLinkedTextDemo {
	
	// NOT RECOMENDED APPROACH

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(	"webdriver.chrome.driver", "G:\\Softwares-exe\\Studies\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");	
		driver.findElement(By.partialLinkText("Forgotten")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
