package roshan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test36 
{
	public static void main(String args[]) throws Exception
	{
		//CRICKBUZZ SITE AUTOMATION
		//get all batsman name who bat
		//open browser
		ChromeDriver driver=new ChromeDriver();
		//launch site
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/82455/ind-vs-aus-3rd-t20i-australia-tour-of-india-2023");
		Thread.sleep(3000);
		List<WebElement> l=driver.findElements(By.xpath("//div[@id='innings_1']/descendant::div[contains(@class,'cb-col-25 ')]/a"));
		for(WebElement e:l)
		{
			if(e.isDisplayed())
			{
				System.out.println(e.getText());
			}									
		}
		//close site
		driver.close();
		
	}
}
