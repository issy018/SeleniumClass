import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageLinksCount {

	public static void main(String[] args) throws InterruptedException {

		// 'a' stands for anchor. any link on an HTML page has an anchor tag
		
        System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		/*get the count of links of the footer section of a web-page by limiting the 'Driver' scope to the footer section
		a sub-set of the 'driver' is created to handle the mini-sections of a web-page*/ 
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		// Get the list count of the first column in the footer section
	    WebElement columndriver =	footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
	   System.out.println(columndriver.findElements(By.tagName("a")).size());
	   
	   //click on each link in the footer column section and retrieve the title of each page
	   
	   for(int i = 1; i < columndriver.findElements(By.tagName("a")).size(); i++) {
		   
		  String clickOnLinkTab =  Keys.chord(Keys.CONTROL, Keys.ENTER); //this step opens required link on a new tab
		  
		    
		  
		   columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
		   Thread.sleep(5000L);
	   }
		// To get the title of a specific window, you have to switch the 'driver' to the required window
		   Set<String> abc = driver.getWindowHandles();
		   Iterator<String> it = abc.iterator();
		   
		   while(it.hasNext()){                                              // 'it.hasNext()'checks if there is another window
			   
			   driver.switchTo().window(it.next());                         // 'it.next' moves from one index to the next window
			   
			   System.out.println(driver.getTitle());
		   }
		
	}

}
