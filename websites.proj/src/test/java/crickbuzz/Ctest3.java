package crickbuzz;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ctest3 
{
	public static void main(String[] args) throws Exception 
	{
		//CRICKBUZZ SITE AUTOMATION
		//goto any innings score card in crickbuz site, and then get the runs and ball faced of any batsman.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter innings 1 or 2");
		int i=sc.nextInt();
		if(i>2)
		{
			System.out.println("Invalid innings no.");
			System.exit(0);
		}	
		System.out.println("Enter player number 1 to 11");
		int pn=sc.nextInt();
		//open browser
		ChromeDriver driver=new ChromeDriver();
		//launch site
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/82455/ind-vs-aus-3rd-t20i-australia-tour-of-india-2023");
		//get the run of any batsman
		try
		{
			String temp = driver.findElement(By.xpath("(//div[@id='innings_"+i+"']/descendant::div[contains(@class,'cb-col-25 ')]/a)["+pn+"]/following::div[2]")).getText();
			int run=Integer.parseInt(temp);
			String temp2=driver.findElement(By.xpath("(//div[@id='innings_"+i+"']/descendant::div[contains(@class,'cb-col-25')]/a)["+pn+"]/following::div[3]")).getText();
			int ball=Integer.parseInt(temp2);
			System.out.println("Player no."+pn+" score "+run+" runs and balls played "+ball);
		}
		catch(Exception ex)
		{
			System.out.println("Entered Player no. did not bat.");
		}		
		//close site
		driver.close();
		sc.close();
	}

}
