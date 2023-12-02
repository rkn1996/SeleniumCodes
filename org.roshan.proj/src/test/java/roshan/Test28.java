package roshan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test28 
{
	public static void main(String args[])
	{
		//AMAZON SITE AUTOMATION
		//get all image tag i.e <img> and display @alt attribute text
		//open browser
		ChromeDriver driver=new ChromeDriver();
		//launch site
		driver.get("https://www.amazon.in/");
		//search pen drive in search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("pendrive");
		driver.findElement(By.xpath("//*[@value='Go']")).click();
		List<WebElement> l=driver.findElements(By.xpath("//img[contains(@alt,'Drive')]"));
		for(WebElement img:l)
		{
			System.out.println(img.getAttribute("alt"));
		}
		////span[@class='a-price-whole']
		//close site
		driver.close();
	}  
}
