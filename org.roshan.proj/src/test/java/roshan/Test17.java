package roshan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test17 
{
	public static void main(String[] args) 
	{
		//getWindowHandles() method of WebDriver Interface
		//open browser
		WebDriver driver=new ChromeDriver();
		//launch site
		driver.get("https://www.google.com");
		//get windowHandles of the tab
		String x=driver.getWindowHandle();
		System.out.println(x);
		//close site
		driver.close();

	}

}
