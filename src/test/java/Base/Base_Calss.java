package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Calss {
public WebDriver driver;
public void initilizeBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shivtej\\Downloads\\chromedriver_win32 (2)");
	 driver=new ChromeDriver();

	//open app
	driver.get("https://kite.zerodha.com/");
	
	//maximize the app
	driver.manage().window().maximize();
	
	//global wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	
}
}
