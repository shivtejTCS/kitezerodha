package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {
	//Declaration
			@FindBy(xpath = "//input[@id='userid']")private WebElement UN;
			@FindBy(xpath = "//input[@id='password']")private WebElement PWD;
			@FindBy(xpath = "//button[text()='Login ']")private WebElement LOGINBTN;

			
			//utilization
			public  Pom1(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}
			//utilization
			public void enterUN(String username) {
				UN.sendKeys(username);
			}
			public void PWD(String password) {
				PWD.sendKeys(password);
			}
			public void LOGINBTN() {
				LOGINBTN.click();
}
}