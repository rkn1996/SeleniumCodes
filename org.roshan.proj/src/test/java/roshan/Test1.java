package roshan;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
	public static void main(String[] args) throws Exception 
	{
		// open Chrome browser
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		//close browser
		driver.close();
	}

}
