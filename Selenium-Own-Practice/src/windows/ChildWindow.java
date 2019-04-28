package windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"G:\\Softwares-exe\\Studies\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[contains(@href,'http://www.google.com')]")).click();
		Set<String> allWindows = driver.getWindowHandles();
		int windowCount = allWindows.size();
		System.out.println("Number of Windows opened is "+windowCount);
		
		for (String child : allWindows) {

			if (!parentWindow.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				System.out.println("Title is " + driver.getTitle());
				driver.findElement(By.name("q")).sendKeys("Selenium Webdriver");
				Thread.sleep(3000);
				driver.close();
			}
		}
		
		driver.switchTo().window(parentWindow);
		System.out.println("Title is " + driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		/*String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[contains(@href,'http://www.google.com')]")).click();
		Set<String> allWindows = driver.getWindowHandles();
		int count = allWindows.size();
		System.out.println("Total Window Size is " + count);

		for (String child : allWindows) {

			if (!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				System.out.println("Title is " + driver.getTitle());
				driver.findElement(By.name("q")).sendKeys("Selenium Webdriver");
				Thread.sleep(3000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		System.out.println("Title is " + driver.getTitle());*/
	}
}
