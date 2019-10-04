import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingMultipleWindows {

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		 
		 driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/ul[1]/li/div/div/div[1]/div/div[3]/a[1]")).click();
		 System.out.println("Before Switching");
		 System.out.println(driver.getTitle());
		 
		 driver.switchTo().window("");
		Set<String>ids=driver.getWindowHandles(); 
		
		 // the 'iterator' method in java allows movement across multiple rows in the data structure
		 
		Iterator<String> it=ids.iterator();
		
		String parentid = it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		System.out.println("After Switching");
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentid);
		System.out.println("Switching back to parent");
		System.out.println(driver.getTitle());
		
		
		
	}

}
