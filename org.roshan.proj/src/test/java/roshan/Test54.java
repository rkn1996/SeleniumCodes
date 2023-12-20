package roshan;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test54 
{
	public static void main(String[] args) throws Exception
	{
		//HANDLING FRAME IN PAGE USING FRAME INDEX
		//open browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//open site
		driver.get("https://the-internet.herokuapp.com/iframe");
		Thread.sleep(3000);
		//go to frame inside using index of frame
		driver.switchTo().frame(0); //using frame index
		String x=driver.findElement(By.tagName("p")).getText();
		System.out.println(x);
		driver.switchTo().defaultContent();				
		//close site
		//driver.close();
	}
}
