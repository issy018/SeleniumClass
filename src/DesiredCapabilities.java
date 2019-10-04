import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DesiredCapabilities {

	public static void main(String[] args) {
		
		/* To automate on - Chrome , Firefox, IE, Safari( write 4 test cases ,one for each browser and set desired capabilities for each test case according 
		to each browser and then configure the Node machine to accommodate the browser type using the cmd line on the Node machine thus:
		
		java –Dwebdriver.chrome.driver=”C:\chromedriver.exe” -jar selenium-server-standalone-3.141.59.jar –role node –hub http://192.168.1.100:4444/grid/console  -port 5566
		
		*/

		// DesiredCapabilities class outlines the properties the browser and OS the tests are to be executed 
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		// to run the test on Chrome:
		
		dc.setBrowserName("Chrome");
		
		// set the OS
		dc.setPlatform(Platform.WINDOWS);
		
		//Set version
		dc.version
		
		/*To run the test case remotely and make the test know the browser and OS to use for the test pass 'dc' as an argument into the below and specify the
		server
		
		*/
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.100:4444/grid/console"),dc);
		
		driver.get("http://google.com");
		
	}

}
