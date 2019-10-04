import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteScreenshotsKillUndergroundProcess {

	public static void main(String[] args) throws IOException {

		// commons.apache.org/proper/commons-io/
		
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://spicejet.com/");
		
		// To take a screenshot, convert the 'WebDriver' object into screenshot object
		
	    File src =    ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	    FileUtils.copyFile(src,new File("C:\\Users\\Bamisho\\screenshot.png"));
	    
	}

}
