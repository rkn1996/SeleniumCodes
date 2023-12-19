package roshan;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test45 
{
	public static void main(String[] args) 
	{
		//collect image type elements when they are *pseudo elements*.
		//open browser
		ChromeDriver driver=new ChromeDriver();
		//launch site
		driver.get("https://my.aidaform.com/signup");
		//get the input tag elements
		List<WebElement> l1=driver.findElements(By.xpath("//*"));
		List<WebElement> l2=new ArrayList<WebElement>();
		for(WebElement e:l1)
		{
			if(e.getCssValue("background-image").contains("url")) 
			{
				l2.add(e);
			}
		}
		System.out.println(l2.size());
		//close site
		driver.close();
	}
}
