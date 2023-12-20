package roshan;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test58 
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
		//switch to frame using index
		driver.switchTo().frame(1); //to to 2nd frame
		driver.findElement(By.name("fname")).clear();
		driver.findElement(By.name("fname")).sendKeys("Roshan");
		driver.findElement(By.name("lname")).clear();
		driver.findElement(By.name("lname")).sendKeys("Nayak");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.switchTo().defaultContent(); //back to page
		//driver.close();
        //driver.close();
	}
}
