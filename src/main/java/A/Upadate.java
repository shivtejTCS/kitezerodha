package A;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upadate {
public static void main(String[] args) {
	WebDriver driver= WebDriverManager.chromedriver().create();
	driver.get("https://www.google.co.in/");
}
}
