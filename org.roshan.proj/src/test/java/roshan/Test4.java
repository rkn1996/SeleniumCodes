package roshan;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Test4 
{
	public static void main(String[] args) throws Exception 
	{
		// open firefox browser
		FirefoxDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		//close browser
		driver.close();
	}

}
