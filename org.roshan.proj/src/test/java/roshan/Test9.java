package roshan;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test9 
{
	public static void main(String[] args) throws Exception 
	{
		// open edge browser using webdriver manager
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		Thread.sleep(3000);
		//close browser
		driver.close();

	}

}
