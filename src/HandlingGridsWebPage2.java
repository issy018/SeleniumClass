import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingGridsWebPage2 {

	public static void main(String[] args) {

		int sum=0;
		
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://www.cricbuzz.com/live-cricket-scorecard/23259/wiw-vs-ausw-3rd-odi-icc-championship-match-australia-women-tour-of-west-indies-2019");
		 
		 // here, 'table' is limited for use in the webElement-table containing the elements required
		 
		 WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		 
		 int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		 
		 for(int i = 0; i < count-2; i++) {
			 
			String value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			
			//convert String to int
			int valueIntergger = Integer.parseInt(value);
			
			sum=sum+valueIntergger;
		 }
		 
		 System.out.println(sum);
		 
		// driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		 // driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
	}

}
