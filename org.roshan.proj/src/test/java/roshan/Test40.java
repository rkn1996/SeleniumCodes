package roshan;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test40 
{
	public static void main(String[] args) 
	{
		//CRICKBUZZ SITE AUTOMATION
		//goto any innings score card in crickbuz site, and then get the did not bat batsman name.
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
		String url="https://www.cricbuzz.com/live-cricket-scorecard/82455/ind-vs-aus-3rd-t20i-australia-tour-of-india-2023";
		//open browser
		ChromeDriver driver=new ChromeDriver();
		//launch site
		driver.get(url);
		//get the run of not out batsman
		try
		{
			List<WebElement> nobl=driver.findElements(By.xpath("//div[@id='innings_"+i+"']//div[contains(text(),' Did not Bat ')]/following::div[1]/a"));
			for(WebElement nob:nobl)
			{
				if(nob.isDisplayed())
				{
					System.out.println(nob.getText());
				}
			}
		}
		catch(Exception ex)
		{
			System.out.println("check xpath something wrong");
		}		
		//close site
		driver.close();
		sc.close();
	}

}
