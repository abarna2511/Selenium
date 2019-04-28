package browserinvoking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {

	public static void main(String[] args) {
		
		System.setProperty(	"webdriver.ie.driver", "G:\\Softwares-exe\\Studies\\Selenium\\drivers\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver =new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.quit();
	}

}
