package roshan;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test57 
{
	public static void main(String[] args) throws Exception
	{
		//HANDLING FRAME IN PAGE
		//open browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//open site
		driver.get("http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm");
		Thread.sleep(3000);
		//Click on "Background" link
		driver.switchTo().frame(0); //1st frame in page
		driver.findElement(By.partialLinkText("Background")).click();
		driver.switchTo().defaultContent(); //back to page
		Thread.sleep(3000);
		//Click on Close button
		driver.switchTo().frame(1); //2nd frame in page
		driver.findElement(By.partialLinkText("update")).click();
		driver.switchTo().defaultContent(); //back to page
		Thread.sleep(3000);
		//Click on "TRY CODING" link
		driver.switchTo().frame(2); //3rd frame in page
		driver.findElement(By.xpath("(//a[normalize-space()='TRY CODING'])[1]")).click();
		driver.switchTo().defaultContent(); //back to page
		Thread.sleep(3000);
		//driver.close();
        //driver.close();
	}
}
