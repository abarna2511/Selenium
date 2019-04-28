package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CheckBox {

	public static void main(String[] args){
		System.setProperty(	"webdriver.chrome.driver", "G:\\Softwares-exe\\Studies\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		System.out.println("FF Checkbox selected is "+driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		System.out.println("SC Checkbox selected is "+driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		System.out.println("IAM Checkbox selected is "+driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
		System.out.println("Stu Checkbox selected is "+driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		System.out.println("UA Checkbox selected is "+driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).isSelected());
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		
		System.out.println("===============");
		
		System.out.println("FF Checkbox selected is "+driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		System.out.println("SC Checkbox selected is "+driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		System.out.println("IAM Checkbox selected is "+driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
		System.out.println("Stu Checkbox selected is "+driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		System.out.println("UA Checkbox selected is "+driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).isSelected());
		
		driver.quit();
		
	}

}
