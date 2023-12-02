package roshan;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test37 
{
	public static void main(String[] args) 
	{
		//CRICKBUZZ SITE AUTOMATION
		//goto 1st innings score card in crickbuzz site, and then get the runs of 1st batsman
		//open browser
		ChromeDriver driver=new ChromeDriver();
		//launch site
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/82455/ind-vs-aus-3rd-t20i-australia-tour-of-india-2023");
		//get the runs of 1st batsman
		String temp=driver.findElement(By.xpath("(//div[@id='innings_1']/descendant::div[contains(@class,'cb-col-25 ')]/a)[1]/following::div[2]")).getText();
		int run=Integer.parseInt(temp);
		System.out.println(run);
		//close site
		driver.close();			
	}
}
