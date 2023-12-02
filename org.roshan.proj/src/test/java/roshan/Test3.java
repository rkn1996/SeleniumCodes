package roshan;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 
{
	public static void main(String[] args) throws Exception 
	{
		// open edge browser
		ChromeOptions co = new ChromeOptions();
		co.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(co);
		Thread.sleep(3000);
		//close site
		driver.close();

	}

}
