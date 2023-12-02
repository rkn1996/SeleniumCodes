package roshan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test23 
{
	public static void main(String[] args) 
	{
		// Get all tag of a page source
		//open browser
		ChromeDriver driver=new ChromeDriver();
		//open site
		driver.get("https://www.google.com/");
		//maximize browser window
		driver.manage().window().maximize();
		//get all tags and count 
		List<WebElement> l=driver.findElements(By.xpath("//*"));
		System.out.println(l.size());
		//close browser
		driver.close();
	}

}
