package roshan;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test22 
{
	public static void main(String[] args) throws Exception
	{
		//collect all elements of a webpage and count no. of "href" tags in that website
		//open browser
		ChromeDriver driver=new ChromeDriver();
		//launch site
		driver.get("https://www.google.com/");
		//maximize window
		driver.manage().window().maximize();
		//collect all element of source page
		List<WebElement> l1=driver.findElements(By.xpath("//*"));
		List<WebElement> l2=new ArrayList<WebElement>();	
		for(WebElement e:l1)
		{
			if(e.getAttribute("href")!=null)
			{
				l2.add(e);
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].style.border='2px red dotted';",e);
				Thread.sleep(3000);
			}
		}
		System.out.println(l1.size());
		System.out.println(l2.size());
		//close site
		driver.close();	
	}

}
