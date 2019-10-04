import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindowAndDeleteCookies {

	public static void main(String[] args) {

		
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 // delete all cookies before execution
		 driver.manage().deleteAllCookies();
		 
		 // delete cookies with known name 
		 driver.manage().deleteCookieNamed("");
		 
		 
		 
		 driver.get("http://spicejet.com/");
		 
	}

	
}
