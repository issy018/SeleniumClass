import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {
// the use of the 'Select' class is dependent on the fact that the element has the 'select' tag and its static
	
	public static void main(String[] args) {

		
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://spicejet.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// Select an item from a Drop-down list by value
		
		Select dropdown = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		
		
	  dropdown.deselectByValue("AED");
		
		
		// Select an item from a Drop-down list by index
		
	//	dropdown.selectByIndex(2);
		
		// Select an item from a Drop-down list by visible text
	//	dropdown.selectByVisibleText("AED");
		
		// the items on the 
	}

}
