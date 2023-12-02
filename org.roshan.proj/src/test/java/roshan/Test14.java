package roshan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test14 
{
	public static void main(String[] args) throws Exception
	{
		// WebDriver Interface get()and getTitle() method example:
		//open Browser
		WebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.google.co.in");
		//wait for 5sec
		Thread.sleep(5000);
		//get title of the page
		String x=driver.getTitle();
		System.out.println("Title of the page is "+x);
		//close browser
		driver.close();
	}

}
