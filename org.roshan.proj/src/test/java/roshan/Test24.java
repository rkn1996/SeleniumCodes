package roshan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test24 
{
	public static void main(String[] args) 
	{
		// Collect all link tag ("href")
		//open Browser
		ChromeDriver driver=new ChromeDriver();
		//launch site
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//collect all link tag
		List<WebElement> l=driver.findElements(By.xpath("//a"));
		System.out.println(l.size());
		for(WebElement a:l)
		{
			System.out.println(a.getAttribute("href"));
		}		
		//close site
		driver.close();

	}

}
