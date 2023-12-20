package roshan;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test55 
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
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_file");
		Thread.sleep(3000);
		//go to frame inside using id or name of frame
		driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("(//input[@type='file'])[1]")).sendKeys("C:\\Users\\rknro\\OneDrive\\Pictures\\asus.jpg");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
        Thread.sleep(3000);
        String x=driver.findElement(By.tagName("h2")).getText();
        String y=x.substring(0, 23);
        System.out.println(y+".");
        //back to page
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
		//driver.close();
        //driver.close();
	}
}
