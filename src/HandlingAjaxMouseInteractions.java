import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingAjaxMouseInteractions {

	
	
	public static void main(String[] args) {

		
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		// driver.manage().window().maximize();
		 
		 driver.get("https://www.amazon.com/");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 Actions a = new Actions(driver);
		 
		 WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		 
		 
		 //whenever we simulate user actions with the 'Actions' class, it must be concluded with 'build' method and 'perform' method executes the line of code
		 
		 a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		 // this moves to specific element
		 
		 // right-clicking on an element
		 a.moveToElement(move).contextClick().build().perform();
		
		
	}

}
