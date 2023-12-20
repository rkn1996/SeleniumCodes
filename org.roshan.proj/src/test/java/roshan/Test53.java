package roshan;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test53 
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
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		Thread.sleep(3000);
		//go to frame inside using id or name of frame
		driver.switchTo().frame("iframeResult"); //frame id or name
		driver.findElement(By.xpath("//input[@id='fname']")).clear();
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Abdul");
		driver.findElement(By.xpath("//input[@id='lname']")).clear();
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("Kalam Sir");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//back to page
		driver.switchTo().defaultContent();
		//close site
		//driver.close();
	}
}
