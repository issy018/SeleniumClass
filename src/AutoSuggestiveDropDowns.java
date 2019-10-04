import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDowns {

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://www.makemytrip.com/");
			
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		// tagName[attribute='value']
		
	    WebElement source = driver.findElement(By.xpath("//*[@id=\\\"root\\\"]/div/div[2]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
	//    tagName[attribute='value']
		source.clear();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		source.sendKeys("MUM");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		source.sendKeys(Keys.ARROW_DOWN);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		source.sendKeys(Keys.ENTER);
		
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[2]/label")).click();
		 
		WebElement destination = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input"));
		
		destination.clear();
		destination.sendKeys("BAN");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		for(int i = 0; i < 4; i++) {
			destination.sendKeys(Keys.ARROW_DOWN);
		}
		
		destination.sendKeys(Keys.ENTER);
		
		
		
	}

}
