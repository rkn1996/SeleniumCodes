package roshan;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 
{
	public static void main(String[] args) throws Exception 
	{
		//open chrome browser using webdriver manager
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		//close site
		driver.close();
	}

}
