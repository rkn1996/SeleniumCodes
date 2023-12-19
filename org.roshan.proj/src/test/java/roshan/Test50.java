package roshan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test50 
{
	public static void main(String[] args) 
	{
		//collect all link type elements.
		//open browser
		WebDriver driver=new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//launch site
		driver.get("https://my.aidaform.com/signup");
		//get the input tag elements
		List<WebElement> l=driver.findElements(By.xpath("(//a)|(//link)")); 
		System.out.println(l.size());
		//close site
		driver.close();
	}
}
