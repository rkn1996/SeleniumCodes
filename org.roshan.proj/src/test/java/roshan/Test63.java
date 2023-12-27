package roshan;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test63 
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
		driver.get("https://chercher.tech/practice/frames");
		Thread.sleep(3000);
		//go to frame
		driver.switchTo().frame(0); //1st frame in page
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Roshan Kumar");
		Thread.sleep(5000);
		driver.switchTo().frame(0); //1st inner frame in 1st frame in page
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(5000);
		driver.switchTo().parentFrame(); //back to outer frame(1st frame in page)
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		Thread.sleep(5000);
		driver.switchTo().defaultContent(); //back to page directly from frame 2
		//driver.close();
        //driver.close();
	}
}
