import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrames {

	public static void main(String[] args) {

		//Frames are independent of the HTML code that defines the elements on a web-page
		
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("http://jqueryui.com/droppable/");
		 
		 // To know the number of frames present on a WebElement 
		 System.out.println(driver.findElement(By.tagName("iframe")));
		 driver.switchTo().frame(0);
		 
		 driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		 driver.findElement(By.id("draggable")).click();
		 
		 Actions a = new Actions(driver);
		 
		 
		 //Drag and drop on WebElement into another
		 WebElement source = driver.findElement(By.id("draggable"));
		 WebElement target = driver.findElement(By.id("droppable"));
		 
		 a.dragAndDrop(source, target).build().perform();
		 
		 // This step switches Selenium back to the Wep-page from the frame 
		 driver.switchTo().defaultContent();
	}

}
