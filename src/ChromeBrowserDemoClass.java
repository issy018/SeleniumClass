import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ChromeBrowserDemoClass {

	public static void main(String[] args) {
		
		
		// Step to invoke the chromedriver.exe file from the test, Browser will  be opened
	       System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		
		
		
		// Create Driver object for Chrome-Browser
	       WebDriver driver = new ChromeDriver();
		
		
		
		
	
		
	// Open a browser
	       driver.get("http://facebook.com");
		   driver.findElement(By.id("email")).sendKeys("this is my first code");
	//	driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		// This step retrieves the actual url which can be compared with what was sent by selenium
		System.out.println(driver.getCurrentUrl());
		
		//to get page source (the code of the opened web-page) to help retrieve page source of some web-pages where right-clicking is disabelled ie: banking web-pages
		
	//	System.out.println(driver.getPageSource());
		
		// validating xpath and CSS using the console pane
		// xpath = $x("") 
		// CSS = $("")
		
		// driver.findElement(By.id(""));
		
		// this step goes back one step on the web-page
		// driver.navigate().back();
		
		// this step goes back one step on the web-page
		// driver.navigate().forward();
		
		// This step closes current the browser window in view
		// driver.close();
		
		//closes multiple child and parent windows opened by Selenium
		// driver.quit();
		
		
    
		
		
		

	}

}
