package roshan;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test18 
{
	public static void main(String[] args) throws Exception
	{
		//open Browser
		WebDriver driver=new ChromeDriver();
		//open site to be Test
		driver.get("https://www.w3schools.com/");
		Thread.sleep(5000);
		//click on try it yourself
		driver.findElement(By.linkText("Try it Yourself")).click();
		Thread.sleep(5000);
		//get handles of the site
		Set<String> x=driver.getWindowHandles();
		System.out.println(x);
		//close site
		driver.close();

	}

}
