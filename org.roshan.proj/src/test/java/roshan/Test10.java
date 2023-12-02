package roshan;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test10 
{
	public static void main(String[] args) throws Exception 
	{
		// open edge browser using edge options
		EdgeOptions eo = new EdgeOptions();
		eo.setBinary("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver= new EdgeDriver();
		Thread.sleep(3000);
		//close site
		driver.close();

	}

}
