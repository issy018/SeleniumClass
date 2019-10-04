import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdownOptions {

	public static void main(String[] args) throws InterruptedException {

		// Requirement is to confirm the suggestive text in the search box is "BENGALURU INTERNATION AIRPORT"
		
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.ksrtc.in/oprs-web/");
		
	    Thread.sleep(10000);
		driver.findElement(By.cssSelector("input[id='fromPlaceName']")).sendKeys("BENG");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText());
		
		
		// Retrieving hidden WebElements using JavaScript Executor that Selenium cannot retrieve
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text = (String) js.executeScript(script);
		System.out.println(text);
		
		int i = 0;
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT")) {
			
			++i;
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
			
			text = (String) js.executeScript(script);
			System.out.println(text);
			if(i > 10) 
			{
				break;
			}
			
		}
		
		if(i > 10) 
		{
			System.out.println("Element not found");
		}
		else 
		{
			System.out.println("Element found");
		}
		
		
	}

}
