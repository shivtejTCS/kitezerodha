package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom3 {
	@FindBy(xpath = "//span[@class='user-id']")private WebElement userID;


	//initialization
	public Pom3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	public String verifyuserID(String expID) {
		String actID=userID.getText();
		return actID;
}
}