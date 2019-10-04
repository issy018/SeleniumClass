import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserDemoClass {

	public static void main(String[] args) {

		
		// Step to invoke the geckodriver.exe file from the test, Browser will  be opened
			System.setProperty("Webdriver.gecko.driver","C:\\geckodriver.exe");
		
		
		// Create Driver object for Firefox-Browser
			FirefoxDriver driver  = new FirefoxDriver();
		// Selenium does not accept class locators with white-spaces within it 
		
		// Open a browser
				driver.get("http://facebook.com");
			//	driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
			// if there are similar object attributes, selenium only identifies one of them 
				driver.findElement(By.xpath("//input[@type='email']")).sendKeys("olumusa@googlemail.com");
				driver.findElement(By.name("pass")).sendKeys("HaLLelujaH4040!");
				
				// Avoid using alpha-numeric values for locators because they change each time a browser is re-opened. Use Xpath or CSS. X-Path such as (/html/body/div[2]/div....) are not relaible
				 driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
				 
				 //grabbing error message from entering the wrong credentials
				// System.out.println(driver.findElement(By.cssSelector("div._4rbf._53ij")).getText());
				
				//X-Path locator (replace the double qoutes in the x-path expression with single qoutes)
			     //driver.findElementByXPath("//*[@id=\'u_0_3\']").click();
				
				//Link objects are located using the anchor 'a' link
		//		driver.findElementByLinkText("Forgotten account?").click();
				
			//	System.out.println(driver.getTitle());
				
			//	System.out.println(driver.getCurrentUrl());
				
			//	driver.close();
				 
	}
	
}
				 
				 
				 
				 
				 
				 
				 
				 
				 
				// NOTES

                //change a class name to CSS by putting a '.' in front of the class name and put a # in front of the id. Replace any space in the class name with a '.'

				/*X-path and CSS generation techniques:
				 
				 Standard
				 Tag name Traverse
				 Regular Expressions
				 
				 */
				 
				 
				 
				 /* X-path syntax for any given expression 
				  
				  (copy outerHTML like below)
				  
				  <input type="email" class="inputtext login_form_input_box" name="email" id="email" placeholder="Email or Phone" data-testid="royal_email" aria-label="Email or Phone">
				  
				 : //tagName[@attribute='value'] = //input[@type='email'] 
				 
				 OR
				 
				 // Use regular expression - Accept any tagName(which changes all the time) which has type attribute and corresponding value  
				  
				  // tagName[contains(@attribute, 'value')]
				    
				   
				  //*[@type='email']
				   
				   
				   Writing X-path using text(only use this option when the code is not ready):
				   
				   //*[text()='Selenium']
				   
				    /* 
				     
				     
				  X-path can be written using parent-child relationship in the event there isn't a unique attribute to identify the object uniquely or the attribute keeps changing.
				  If the parent of the child is known which is unique and static and it can used to write an X-path - Use the parent to write an Xpath and then traverse from parent to child using tags. 
				 
				  //div[@class='gb_Oa gb_fg gb_g gb_Eg gb_jg gb_Wf']/div/div[2]/div/a
				  
				  */
				   
				   
				 /*  CSS syntax is light-weight and is 10 times faster in identifying an object on a page than X-path 
				  
				   tagName[attribute='value']
				   tagName#id = input#username(if theres id in the OuterHTML code)
				   tagName.className
				   
				   	 // Use regular expression - Accept any tagName(which changes all the time) which has type attribute and corresponding value  
				  // tagName[Attribute*='value']
				  //[type='email']
				   
				   
				  
					 */
				 
				
				 
	


