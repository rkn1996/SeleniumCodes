package roshan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test44 
{
	public static void main(String[] args) 
	{
		//collect all image type elements.
		//open browser
		ChromeDriver driver=new ChromeDriver();
		//launch site
		driver.get("https://www.flipkart.com/");
		//get the input tag elements
		List<WebElement> l=driver.findElements(By.xpath("(//img)|(//input[@type='image'])")); 
		System.out.println(l.size());
		//close site
		driver.close();
	}
}
