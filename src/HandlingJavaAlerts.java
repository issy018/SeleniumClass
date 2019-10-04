import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingJavaAlerts {

	
	public static void main(String[] args) {

		 String text = "Rahul";
		
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.findElement(By.id("name")).click();
		 driver.findElement(By.id("name")).sendKeys(text);
		 
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		
		// Also the text in the pop-up window can be grabbed
		System.out.println(driver.switchTo().alert().getText()); 
		
		
		//the 'switch' method in /selenium can be used to switch the context of the Selenium driver to 'alert' in other to accept the alert
		driver.switchTo().alert().accept();
		/*driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().dismiss();*/
		
		

}

	
}