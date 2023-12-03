package crickbuzz;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ctest4 
{
	public static void main(String[] args) throws Exception 
	{
		//CRICKBUZZ SITE AUTOMATION
		//goto any innings score card in crickbuz site, and then get the not out batsman name and run scored.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter innings 1 or 2");
		int i=sc.nextInt();
		if(i>2)
		{
			System.out.println("Invalid innings no.");
			System.exit(0);
		}	
		/*System.out.println("Enter player number 1 to 11");
		int pn=sc.nextInt();*/
		//open browser
		ChromeDriver driver=new ChromeDriver();
		//launch site
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/82455/ind-vs-aus-3rd-t20i-australia-tour-of-india-2023");
		//get the run of not out batsman
		try
		{
			List<WebElement> nobl=driver.findElements(By.xpath("//div[@id='innings_"+i+"']//*[text()='not out']"));
			for (WebElement nob:nobl)
			{
				String nobn=nob.findElement(By.xpath("preceding::div[1]")).getText();
				String nobr=nob.findElement(By.xpath("following::div[1]")).getText();
				System.out.println(nobn+" did "+nobr+" runs");
			}
		}
		catch(Exception ex)
		{
			System.out.println("check xpath again something wrong");
		}		
		//close site
		driver.close();
		sc.close();
	}

}
