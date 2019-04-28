package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drag {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"G:\\Softwares-exe\\Studies\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		
		driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']")).click();
	}

}
