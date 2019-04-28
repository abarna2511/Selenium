package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class HomePage extends Base {
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By signIn = By.cssSelector("a[href*='sign_in']");
	
	public WebElement getLogin() {
		return driver.findElement(signIn);
	}
}
