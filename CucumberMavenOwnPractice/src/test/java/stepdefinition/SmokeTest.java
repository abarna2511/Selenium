package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	WebDriver driver;
@Given("^Open Chrome and start application$")
public void Open_Chrome_and_start_applicatin() {
	System.setProperty(	"webdriver.chrome.driver", "G:\\Softwares-exe\\Studies\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");	
}

@When("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")
public void Enter_Username_and_password(String uname, String pass){
	driver.findElement(By.id("email")).sendKeys(uname);
	driver.findElement(By.id("pass")).sendKeys(pass);	
}

@Then("^click on submit button to login$")
public void click_on_submit_button_to_login(){
	driver.findElement(By.xpath("//label[@id='loginbutton']")).click();	
	driver.quit();
}
}
