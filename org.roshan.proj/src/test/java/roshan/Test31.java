package roshan;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test31 
{
	public static void main(String args[]) throws Exception
	{
		//AMAZON SITE TESTING
		//check all product price in web page till next button working and count total visible product price
		//Take input from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter product name to test");
		String pn=sc.nextLine();
		sc.close();
		//open browser
		ChromeDriver driver=new ChromeDriver();
		//launch site
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		//search pen drive in search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(pn);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@value='Go']")).click();
		int trc=0;
		while(true) //infinite loop
		{
		  	//collect total result count
			List<WebElement> l=driver.findElements(By.xpath("//div[@data-component-type='s-search-result']/descendant::span[@class='a-price-whole']"));
			int ptc=l.size();
			trc=trc+ptc; //add to total result count
			//click on "next" link to goto next page if exist 
		    try 
			{
				driver.findElement(By.linkText("Next")).click();
				Thread.sleep(3000);
			}
			catch(Exception ex)
			{
				break; //terminate from loop when next link disabled
			}
		}
		System.out.println("count of all product price in all page is: "+trc);
		//close browser
		//driver.close();
	}  
}
