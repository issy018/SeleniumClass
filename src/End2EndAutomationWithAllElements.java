import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class End2EndAutomationWithAllElements {

	public static void main(String[] args) {

		// Open the  browser
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://spicejet.com/");
			
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		// Click the 'From' DDL button
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		// select the Bengalaru option
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		// This is a step to avoid using the index method to identify the multiple instances of a UI instance on your web page
				//driver.findElement(By.xpath(("(//a[@value='MAA'])[2]"))).click();
				
				driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
				
				
				driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
				
				//System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
				driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
				//System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
				
				if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
				
					System.out.println("its enabled");
					Assert.assertTrue(true);
				}
				else {
					Assert.assertTrue(false);
				}
				driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
				
				driver.findElement(By.id("divpaxinfo")).click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				for(int i = 1; i < 5; i++) {
					driver.findElement(By.id("hrefIncAdt")).click();
					
				}
				
				driver.findElement(By.id("btnclosepaxoption")).click();
				Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
				System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
				
				driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights"));
	}

}
