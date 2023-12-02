package roshan;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Test7 
{
	public static void main(String[] args) throws Exception 
	{
		// open firefox mannualy by us using set property method
		System.setProperty("webdriver.gecko.driver","src\\test\\resources\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		FirefoxDriver d = new FirefoxDriver();
		Thread.sleep(3000);
		//close browser
		d.close();

	}

}
