package roshan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test27 
{
	public static void main(String args[])
	{
		//AMAZON SITE AUTOMATION
		//get all image tag i.e <img> and display source path of visible images in a webpage
		//open browser
		ChromeDriver driver=new ChromeDriver();
		//launch site
		driver.get("https://www.amazon.in/");
		//get all img tag counts
		List<WebElement> l=driver.findElements(By.xpath("//img"));
		int index=0;
		for(WebElement img:l)
		{
			if(img.isDisplayed())
			{
				index++;
				System.out.println(index+"."+img.getAttribute("src"));
			}
		}
		//close browser
		driver.close();
	}  
}
