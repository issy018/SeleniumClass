import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown3 {

	public static void main(String[] args) {
		
		 System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://spicejet.com/");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Dynamic drop-down are dynamic because they are loaded based on a user action done beforehand. They are loaded due to pre-selected option(s)
		
		//a[value='MAA']
		//a[@value='BLR']
		
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//a[@value='BLR']")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath(("(//a[@value='MAA'])[2]"))).click();
//		 driver.close();
//		 driver.quit();
		 
		
	}

}
