package roshan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test26 
{
	public static void main(String args[])
	{
		//AMAZON SITE AUTOMATION
		//get all image tag i.e <img> and and displayed count of visible and hidden elements
		//open browser
		ChromeDriver driver=new ChromeDriver();
		//launch site
		driver.get("https://www.amazon.in/");
		//get all img tag counts
		List<WebElement> l=driver.findElements(By.xpath("//img"));
		int vc=0;
		int hc=0;
		for(WebElement img:l)
		{
			if(img.isDisplayed())
			{
				vc++;
			}
			else
			{
				hc++;
			}
		}
		System.out.println("Total count of element is "+l.size());
		System.out.println("Visible count of element is "+vc);
		System.out.println("Hidden count of element is "+hc);
		//close browser
		driver.close();
	}  
}
