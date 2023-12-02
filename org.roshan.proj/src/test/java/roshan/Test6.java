package roshan;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test6 
{
	public static void main(String[] args) throws Exception 
	{
		// open firefox browser using FirefoxOptions
		FirefoxOptions fo = new FirefoxOptions();
		fo.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver(fo);
		Thread.sleep(3000);
		//close browser
		driver.close();

	}

}
