package roshan;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test21 
{
	public static void main(String[] args) throws Exception
	{
		//open Browser
		ChromeDriver driver=new ChromeDriver();
		//launch site
		driver.get("https://my.aidaform.com/signup");
		//maximize window
		driver.manage().window().maximize();
		//fill sign-up form
		driver.findElement(By.xpath("//*[@name='nickname']")).sendKeys("kalam");
		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys("kalam12@kalam.com");
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("kalam@123");
		Thread.sleep(5000);
		driver.findElement(By.name("confirm")).sendKeys("kalam@123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[name()='svg'])[4]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Create My Free Account']")).click();
		String x=driver.findElement(By.xpath("//form[@class='-mt-12']/child::div[3]/child::div[2]/child::div[2]")).getText();
		System.out.println(x);
		//close site
		Thread.sleep(5000);
		driver.close();

	}

}
