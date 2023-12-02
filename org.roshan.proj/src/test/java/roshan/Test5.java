package roshan;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test5 
{
	public static void main(String[] args) throws Exception 
	{
		// open firefox browser using webdrivermanger
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		//close browser
		driver.close();
	}

}
