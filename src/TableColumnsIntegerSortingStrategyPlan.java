import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableColumnsIntegerSortingStrategyPlan {

	public static void main(String[] args) {

		
System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		for(int i=1; i < 3; i++ )
		{
			driver.findElement(By.cssSelector("tr th:nth-child(3)")).click();
		}
		List<WebElement> firstColList = driver.findElements(By.cssSelector("tr td:nth-child(3)"));
		sortColumn(firstColList,"asc", "integers");
	}
	
	
	
	
		public static void sortColumn(List<WebElement> firstColList, String order, String format)
		
		{
			ArrayList<String> originalList = new ArrayList<String>();
			
			for(int i=0; i < firstColList.size(); i++) 
			{
				
				originalList.add(firstColList.get(i).getText());
			}
			
			ArrayList<String> copiedList = new ArrayList<String>();
			
			for(int i =0; i < originalList.size(); i++)
			{
				copiedList.add(originalList.get(i));
			}
			System.out.println("*************************************");
			
			if(format.equalsIgnoreCase("integers"))
			{
				Arrays.sort(copiedList.toArray());  // this step sorts Integer
				if(order.equalsIgnoreCase("desc"))
				{
					Arrays.sort(copiedList.toArray(),Collections.reverseOrder());
				}
			}
			else
			{
				Collections.sort(copiedList);  // this step sorts String
				if(order.equalsIgnoreCase("desc"))
					
				{
					Collections.reverse(copiedList);
				}
				
			}
			
			Assert.assertTrue(originalList.equals(copiedList));
		
		}
		
	}


