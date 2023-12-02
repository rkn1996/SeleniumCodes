package roshan;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test19 
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
		List<String> ls=new ArrayList<String>(x);
		ls.add("apple");
		ls.add("mango");
		ls.add("cherry");
		driver.switchTo().window(ls.get(1));
		for(int i=0;i<ls.size();i++)
		{
			System.out.println(ls.get(i));
		}
		//close site
		driver.close();

	}

}
