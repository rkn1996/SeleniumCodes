package roshan;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test33 {
	public static void main(String args[]) throws Exception
	{
		//FLIPKART SITE AUTOMATION
		//search a product and check all product in first page in web page and mark them with blue dotted color
		//Take input from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter product name to search");
		String product=sc.nextLine();
		//open any browser (chrome, firefox, edge)
		System.out.println("Enter Browser name(chrome,firefox,edge)");
		String browsernm=sc.nextLine();
		sc.close();
		//browser cross testing
		WebDriver driver=null;
		if(browsernm.equalsIgnoreCase("chrome"))
		{			
		    driver=new ChromeDriver();
		}
		else if(browsernm.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browsernm.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("Enter correct browser name(chrome,firefox or edge)");
		}
		//maximize the browser
		driver.manage().window().maximize();
		//open site
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		//close window poop-off
		driver.findElement(By.xpath("//span[@role='button']")).click();
		//search item
		driver.findElement(By.name("q")).sendKeys(product);
		driver.findElement(By.xpath("//*[name()='svg']/parent::button[@type='submit']")).click();
		List<WebElement> l=driver.findElements(By.xpath("//div[@class='_13oc-S']"));
		System.out.println("Total row of product in first page: "+l.size());
		List<WebElement> l2=driver.findElements(By.xpath("//div[@class='_4ddWXP']"));
		System.out.println("Total no. of product in first page: "+l2.size());
	    for(WebElement e:l2)
	    {
	    	if(e.isDisplayed())
	    	{
	    		JavascriptExecutor js=(JavascriptExecutor)driver;
	    		js.executeScript("arguments[0].style.border='2px blue dotted';", e);
	    		Thread.sleep(1000);
	    	}
	    }
		//close site
	    Thread.sleep(3000);
		driver.close();
	}
}
