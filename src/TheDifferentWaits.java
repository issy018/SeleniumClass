import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TheDifferentWaits {

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://spicejet.com/");
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			
			driver.findElement(By.xpath("//a[@value='BLR']")).click();
			
			// This is a step to avoid using the index method to identify the multiple instances of a UI instance on your web page
			//driver.findElement(By.xpath(("(//a[@value='MAA'])[2]"))).click();
			
			
			//This wait command puts the code to sleep until a required element is visible
			WebDriverWait d = new WebDriverWait(driver,20);
			d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")));
			
			//This wait command puts the code to sleep until a required text in the element is present in the element
			
			d.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")));
			
			driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();	
		
		
		
		
		/*Synchronization in Selenium
		
		// ImplicitWait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS): When declared globally, then its ImplicitWait. If the application takes 10sec to find the object, the application 
        will not wait for the entire 20secs, it wil come out of the wait method to continue with executing the code 		 
		
		
		// ExplicitWait
		
		Specific element can be targeted with this type of wait
		
		//ThreadSleep
		This type of wait is not encouraged 
		Thread.sleep(5000L);
		
		//FluentWait
		 This wait type is categorised under the ExplicitWait 
		 Fluent wait finds the web element repeatedly at regular intervals of time until timeout or till the object is found. once the object is found, the wait command expires
		  
		  */
		
		
	}

}
