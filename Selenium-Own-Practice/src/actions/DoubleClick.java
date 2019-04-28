package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args){
		System.setProperty(	"webdriver.chrome.driver", "G:\\Softwares-exe\\Studies\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);
		WebElement tb = driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(tb).click().keyDown(Keys.SHIFT).sendKeys("mobile").doubleClick().build().perform();
	}
}
