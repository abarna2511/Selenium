package resources;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	public static WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws Exception 
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Vignesh\\WorkSpace\\RealtimeFrameworkOwnPractice\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
	
	if(browserName.equals("chrome")){
		System.setProperty(	"webdriver.chrome.driver", "G:\\Softwares-exe\\Studies\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
	}
	else if(browserName.equals("firefox")){
		System.setProperty(	"webdriver.gecko.driver", "G:\\Softwares-exe\\Studies\\Selenium\\drivers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver =new FirefoxDriver();
	}
	else if (browserName.equals("internetExplorer")){
		System.setProperty(	"webdriver.ie.driver", "G:\\Softwares-exe\\Studies\\Selenium\\drivers\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		driver =new InternetExplorerDriver();
	}
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	return driver;
	}
	
	public static void getScreenShot(String ImageName) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("./Screenshots/"+ImageName+".png"));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception while taking screenshot is "+e.getMessage());
		}
	}
}
