import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowserDemoClass {

	public static void main(String[] args) {

		
		// Step to invoke the IEdriver.exe file from the test, Browser will  be opened
				System.setProperty("webdriver.ie.driver","C:\\MicrosoftWebDriver.exe");
		
		// Create Driver object for InternetExplorer-Browser
				InternetExplorerDriver driver = new InternetExplorerDriver();
				
				
				
				driver.get("http://google.com");
			//	driver.manage().window().maximize();
				
				//This step gets the title of the web page in other to validate it 
				System.out.println(driver.getTitle());
				
				// This step retrieves the actual url which can be compared with what was sent by selenium
				System.out.println(driver.getCurrentUrl());
				
				//to get page source (the code of the opened web-page) to help retrieve page source of some web-pages where right-clicking is disabelled ie: banking web-pages
				
			//	System.out.println(driver.getPageSource());
				
				
				driver.get("http://youtube.com");
				
				// this step goes back one step on the web-page
				driver.navigate().back();
				
	}

}
