package roshan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test41 
{
	public static void main(String[] args) 
	{
		//get all input tag and type attribute value.
		//open browser
		ChromeDriver driver=new ChromeDriver();
		//launch site
		driver.get("https://www.flipkart.com/");
		//get the input tag elements
		List<WebElement> l=driver.findElements(By.tagName("input")); 
		for(WebElement e:l)
		{			
			System.out.println(e.getAttribute("type"));
		}		
		//close site
		driver.close();
	}

}
