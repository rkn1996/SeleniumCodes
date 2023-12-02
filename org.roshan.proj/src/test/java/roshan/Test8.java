package roshan;

import org.openqa.selenium.edge.EdgeDriver;

public class Test8 
{
	public static void main(String[] args) throws Exception 
	{
		//open edge browser
		EdgeDriver driver = new EdgeDriver();
		Thread.sleep(3000);
		//close browser
		driver.close();

	}

}
