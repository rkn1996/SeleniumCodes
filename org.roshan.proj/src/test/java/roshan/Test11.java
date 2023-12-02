package roshan;

import org.openqa.selenium.edge.EdgeDriver;

public class Test11 
{
	public static void main(String[] args) throws Exception 
	{
		// open edge browser using setProperty method
		System.setProperty("webdriver.edge.driver.","src\\test\\resources\\edgedriver_win32\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		Thread.sleep(3000);
		//close site
		driver.close();

	}

}
