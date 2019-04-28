package objectrepositorypattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPagePattern {
	
	WebDriver driver;
	
	public LoginPagePattern(WebDriver driver) {
		this.driver = driver;
	}
	
	By username = By.name("username");
	By password = By.name("password");
	By loginButton = By.xpath("//input[@value='Login']");
	
	
	public WebElement enterUserName() {
		return driver.findElement(username);
	}
	
	public WebElement enterPassword() {
		return driver.findElement(password);
	}
	
	public WebElement clickLoginButton() {
		return driver.findElement(loginButton);
	}	
}
