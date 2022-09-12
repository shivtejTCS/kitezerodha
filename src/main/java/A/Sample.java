package A;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
public static void main(String[] args) {
	WebDriverManager.chromiumdriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
}
}
