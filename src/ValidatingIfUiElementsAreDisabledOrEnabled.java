import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ValidatingIfUiElementsAreDisabledOrEnabled {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://spicejet.com/");
			
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		// Assertions helps to validate expected results. TestNG provides the assertion feature | The below step expects false.
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		/*Clicking radio button to enable return date. Find the attribute(s) that the developer changes in the HTML when something is disabled or enabled
		Use the 'get' method to retrieve the value of the attribute before and after disabling and enabling. The value of the chosen attribute is expected to change 
		*/
		
		
		//System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
		
		//	System.out.println("its enabled");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
		
	}

}
