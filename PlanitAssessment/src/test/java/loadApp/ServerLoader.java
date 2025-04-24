package loadApp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;


public class ServerLoader 
{
	
	public static WebDriver driver=null;
	@BeforeTest
	public WebDriver launch_app() 
	{
		 driver = new ChromeDriver();
	      driver.get("http://jupiter.cloud.planittesting.com/"); // Navigate to Planitt Website
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return driver;
	}

	

}
