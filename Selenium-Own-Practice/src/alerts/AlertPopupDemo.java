package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupDemo {

	public static void main(String[] args) throws Exception{
		System.setProperty(	"webdriver.chrome.driver", "G:\\Softwares-exe\\Studies\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		// First Approach
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(2000);
		Alert alt=driver.switchTo().alert();
		String text = alt.getText();
		if (text.equals("Please enter a valid user name")) {
			System.out.println("Correct Alert message");
			
		} else {
			System.out.println("Wrong Alert message");

		}
		
		alt.accept();
		
		
		// Second Approach
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
	}

}
