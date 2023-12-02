package roshan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test25 
{
	public static void main(String args[])
	{
		//AMAZON SITE AUTOMATION
		//get all image tag i.e <img> and their src attribute
		//open browser
		ChromeDriver driver=new ChromeDriver();
		//launch site
		driver.get("https://www.amazon.in/");
		//get all img tag counts
		List<WebElement> l=driver.findElements(By.xpath("//img"));
		System.out.println(l.size());
		for(WebElement img:l)
		{
			System.out.println(img.getAttribute("src"));
		}
		//close browser
		driver.close();
	}  
}
