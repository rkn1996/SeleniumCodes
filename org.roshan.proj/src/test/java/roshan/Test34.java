package roshan;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test34 {
	public static void main(String args[]) throws Exception
	{
		//FLIPKART SITE AUTOMATION
		//search a product and check count of all product in first page to last page using "next" click in web page
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
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[name()='svg']/parent::button[@type='submit']")).click();
		int tpc=0;
	    while(true)
	    {
	    	List<WebElement> l=driver.findElements(By.xpath("//div[contains(@class,'col-12-12')]//div[@class=\"_4ddWXP\"]"));
	    	int pc=l.size();
	    	tpc=tpc+pc;
	    	try
	    	{
	    		driver.findElement(By.xpath("//span[text()='Next']")).click();
	    		Thread.sleep(3000);
	    	}
	    	catch(Exception ex)
	    	{
	    		break;
	    	}	    		    	
	    }
	    System.out.println("Total product count: "+tpc);
		//close site
		driver.close();
	}
}
