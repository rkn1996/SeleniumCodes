package roshan;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test12 
{
	public static void main(String[] args) throws Exception 
	{
		//open chrome browser using set property method
		System.setProperty("webdriver.chrome.driver.","src\\test\\resources\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		//close site
		driver.close();

	}

}
