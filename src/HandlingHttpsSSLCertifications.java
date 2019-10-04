import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandlingHttpsSSLCertifications {

	public static void main(String[] args) {

		/*SSL certificates
		 Desired capabilities helps customise ChromeBrowser which helps provide knowledge to the ChromeBrowser and then pass the object of the capabilities to your
		 ChromeOptions
		 
		*/
		
		
		//Desired capabilities
		//General Chrome profile
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		// ch.acceptInsecureCerts();
		
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		//This ChromeOptions belongs to your local browser
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);
		
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://spicejet.com/");
		
	}

}
