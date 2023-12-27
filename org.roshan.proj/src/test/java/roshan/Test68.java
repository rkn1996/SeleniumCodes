package roshan;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test68 
{
	public static void main(String[] args) throws Exception
	{
		//ALERT AUTOMATION
		//open browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//maximize site
		driver.manage().window().maximize();
		//open site
		driver.get("https://www.javatpoint.com/oprweb/test.jsp?filename=javascript-alert1");
		Thread.sleep(5000);
		//switch to frame
		driver.switchTo().frame("iframewrapper");
		driver.findElement(By.xpath("//input[@value='Click me']")).click();
		Thread.sleep(5000);
		//operate on Alert box
		Alert al=driver.switchTo().alert();
		String x=al.getText();
		System.out.println(x);
		driver.switchTo().alert().dismiss();
		//back to page
		driver.switchTo().defaultContent();
		//close sit
		//driver.close();
	}

}
