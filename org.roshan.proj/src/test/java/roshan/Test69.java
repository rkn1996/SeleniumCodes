package roshan;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test69 
{
	public static void main(String[] args) throws Exception
	{
		//ALERT AUTOMATION
		//open browser
		RemoteWebDriver driver=new ChromeDriver();
		//maximize site
		driver.manage().window().maximize();
		//open site
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		Thread.sleep(5000);
		//switch to frame
		driver.switchTo().frame("pact");
		//handle shadow dom in page
		WebElement shadowHostElement=driver.findElement(By.id("snacktime"));
		SearchContext shadowRootElement=shadowHostElement.getShadowRoot();
		WebElement targetElement=shadowRootElement.findElement(By.linkText("Testers Food"));
		try
		{
			targetElement.click();
		}
		catch(Exception ex)
		{
			driver.executeScript("arguments[0].click();", targetElement);
		}
		Thread.sleep(5000);
		//switch to 2nd window
		Set<String> x=driver.getWindowHandles();
		List<String> l=new ArrayList<String>(x);
		driver.switchTo().window(l.get(1));		
		//close banner
		try
		{
			driver.findElement(By.xpath("//img[@alt='Close']")).click();
		}
		catch(Exception ex)
		{
			System.out.println("banner not present");
		}
		//close sit
		Thread.sleep(5000);  
		driver.close();
	}

}
