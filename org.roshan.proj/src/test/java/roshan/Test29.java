package roshan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test29 
{
	public static void main(String args[]) throws Exception
	{
		//AMAZON SITE AUTOMATION
		//get all product display in page and count total visible product and mark them with red dotted square
		//open browser
		ChromeDriver driver=new ChromeDriver();
		//launch site
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		//search pen drive in search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("pendrive");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@value='Go']")).click();
		List<WebElement> l=driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
		System.out.println("Total Result in first page: "+l.size());
		int vc=0;
		for(WebElement prod:l)
		{
			if(prod.isDisplayed())
			{
				vc++;
				JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("arguments[0].style.border='2px red dotted';",prod);
				Thread.sleep(3000);
			}
		}
		System.out.println("Total visible product is: "+vc);
		////span[@class='a-price-whole']
		Thread.sleep(5000);
		//close site
		//driver.close();
	}  
}
