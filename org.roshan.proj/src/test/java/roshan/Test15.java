package roshan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test15 
{
	public static void main(String[] args) 
	{
		// WebDriver Interface getPageSource() method example
        //Open Browser
		WebDriver driver=new ChromeDriver();
		//Launch Site
		driver.get("http://www.google.co.in");
		//get page source code
		String ps=driver.getPageSource();
		System.out.println("Source Code is "+ps);
		//close Browser
		driver.close();
	}

}
