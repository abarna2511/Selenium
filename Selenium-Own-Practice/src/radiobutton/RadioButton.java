package radiobutton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args){
		System.setProperty(	"webdriver.chrome.driver", "G:\\Softwares-exe\\Studies\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		System.out.println("OneWay Radio button selceted is "+driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isSelected());
		System.out.println("RoundTrip Radio button selceted is "+driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println("OneWay Radio button selceted is "+driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isSelected());
		System.out.println("RoundTrip Radio button selceted is "+driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());
	}

}
