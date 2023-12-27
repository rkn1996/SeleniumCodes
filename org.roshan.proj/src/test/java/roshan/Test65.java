package roshan;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test65 
{
	public static void main(String[] args) throws Exception
	{
		//NESTED SHADOW-DOM ELEMENT AUTOMATION
		//open browser
		RemoteWebDriver driver=new ChromeDriver();
		//open site
		driver.get("chrome://settings/");
		Thread.sleep(3000);
		//target Element is inside a multiple shadow DOM
		WebElement shadowHostElement1=driver.findElement(By.tagName("settings-ui"));
		SearchContext shadowRootElement1=shadowHostElement1.getShadowRoot();
		WebElement shadowHostElement2=shadowRootElement1.findElement(By.id("toolbar"));
		SearchContext shadowRootElement2=shadowHostElement2.getShadowRoot();
		WebElement shadowHostElement3=shadowRootElement2.findElement(By.id("search"));
		SearchContext ShadowRootElement3=shadowHostElement3.getShadowRoot();
		ShadowRootElement3.findElement(By.id("searchInput")).sendKeys("Kalam sir");
		//no separate code for exit from Shadow DOM, directly automate elements in rest of the page

	}

}
