package roshan;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test67 
{
	public static void main(String[] args) throws Exception
	{
		//SHADOW-DOM ELEMENT AUTOMATION
		//open browser
		RemoteWebDriver driver=new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//open site
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(3000);
		try
		{
			driver.findElement(By.xpath("//img[@alt='Close']")).click();
		}
		catch(Exception ex)
		{
			System.out.println("No banner");
		}
		Thread.sleep(3000);
		//target Element is inside a single shadow DOM(closed)
		WebElement shadowHostElement=driver.findElement(By.id("userPass"));
		shadowHostElement.click();
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.sendKeys(Keys.TAB,"kalam").perform();		
		//no separate code for exit from Shadow DOM, directly automate elements in rest of the page

	}

}
