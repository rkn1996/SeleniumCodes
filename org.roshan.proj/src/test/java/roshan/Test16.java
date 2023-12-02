package roshan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test16 
{
	public static void main(String[] args) 
	{
		// WebDriver Interface getCurrentUrl() method example
        //Open Browser
		WebDriver driver=new ChromeDriver();
		//launch site
		driver.get("http://www.google.co.in");
		//get url using method of WebDriver Interface
		String x=driver.getCurrentUrl();
		if(x.contains("https")) 
		{
			System.out.println("Site is secured");
		}
		else
		{
			System.out.println("site is not secured");
		}
		System.out.println("Url of site is "+x);
		//close site
		driver.close();
	}

}
