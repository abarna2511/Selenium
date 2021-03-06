package calendar;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(	"webdriver.chrome.driver", "G:\\Softwares-exe\\Studies\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		//Need to Select April 10 as Start date and May 13 as End date
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		Thread.sleep(2000);
		
		//Static way ===> Not much recommended
		//driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[4]/a[1]")).click();
		
		List<WebElement> dates = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//td"));
		int total_dates = dates.size();
			
		for(int i=0; i<total_dates;i++) {
			String date = dates.get(i).getText();
			if(date.equalsIgnoreCase("16")) {
				dates.get(i).click();
				break;
			}
		}
		Thread.sleep(2000);
		
		//For 2nd table
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date2']")).click();
		Thread.sleep(2000);
		List<WebElement> dates2 = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//td"));
		int total_dates2 = dates2.size();
			
		for(int i=0; i<total_dates2;i++) {
			String date2 = dates2.get(i).getText();
			if(date2.equalsIgnoreCase("15")) {
				dates2.get(i).click();
				break;
			}
		}
		
		}
	}
