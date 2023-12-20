package roshan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test56 
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
		//switch to frame using wrong index or wrong id/name or wrong element
		WebElement e=driver.findElement(By.id("menuOverlay"));
		driver.switchTo().frame(e); 
		//"NoSuchFrameException" for wrong index/id/name/xpath
		//driver.close();
        //driver.close();
	}
}
