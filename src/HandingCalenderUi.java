import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandingCalenderUi {

	public static void main(String[] args) {

		
System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Sept 19
		driver.findElement(By.xpath(".//*[@id='travel_date']")).click();
		
		
		
		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("January")) {
		
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
			
		List<WebElement> dates = driver.findElements(By.className("day"));
		
		int count = driver.findElements(By.className(".day")).size();
		
		for(int i = 0; i < count; i++) {
			
			String text = driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("19")) {
				
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
			
		}
	}

}
