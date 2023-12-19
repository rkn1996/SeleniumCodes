package roshan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test48 
{
	public static void main(String[] args) 
	{
		//collect all button type elements.
		//open browser
		WebDriver driver=new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//launch site
		driver.get("https://my.aidaform.com/signup");
		//get the input tag elements
		List<WebElement> l=driver.findElements(By.xpath("(//button)|(//input[@type='button' or @type='submit'])")); 
		System.out.println(l.size());
		//close site
		driver.close();
	}
}
