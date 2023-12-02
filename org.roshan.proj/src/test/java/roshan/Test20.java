package roshan;

import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test20 
{
	public static void main(String[] args) throws Exception
	{
		//Open Browser
		//System.setProperty("webdriver.chrome.driver","E:\\Testing_Batch266\\org.roshan.proj\\src\\test\\resources\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        //open site for testing
        driver.get("https://www.google.com");
        Thread.sleep(5000);
        //navigate to(String url) new site
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(5000);
        //navigate to previous site
        driver.navigate().back();
        Thread.sleep(5000);
        //refresh site
        driver.navigate().refresh();
        Thread.sleep(5000);
        //goto forward
        driver.navigate().forward();
        Thread.sleep(5000);
        //by using to(URL obj) method
        URL u=new URL("https://www.amazon.in/");
        driver.navigate().to(u);
        Thread.sleep(5000);
        driver.close();    
	}

}
