package roshan;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test13 
{
	public static void main(String[] args) throws Exception 
	{
		// cross browser testing
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Browser Name");
		String bn=sc.nextLine();
		sc.close();
		WebDriver driver=null;
		if(bn.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(bn.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(bn.equalsIgnoreCase("edge"))
	    {
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Check browser name");
		    System.exit(0);
		}
		Thread.sleep(3000);
		//close site
		driver.close();

	}

}
