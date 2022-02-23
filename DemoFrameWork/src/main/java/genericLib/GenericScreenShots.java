package genericLib;

import java.io.File;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

/**
 * 
 * @author Vishwa
 *
 */
public class GenericScreenShots implements FrameWorkConstants {


	public static void getPhoto(WebDriver driver) throws IOException {

		String photo=SCREENSHOT_PATH;			
		Date date= new Date();
		String ScreenShotDate=date.toString().replaceAll(":", "-");
		TakesScreenshot takeScreenShot=(TakesScreenshot)driver;
		File source=takeScreenShot.getScreenshotAs(OutputType.FILE);
		File destination= new File(photo+ScreenShotDate+".png");
		FileHandler.copy(source, destination);		
	}

}
