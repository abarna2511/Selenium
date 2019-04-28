package library;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	public static void captureScreenShot(WebDriver driver, String ImageName) {
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
