package Test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base_Calss;
import Pom.Pom1;
import Pom.Pom2;
import Pom.Pom3;
import Utility.Utility_Class;

public class Test_Class extends Base_Calss{
//declare
	Pom1 login1;
	Pom2 login2;
	Pom3 home;
	
	
	@BeforeClass
	public void openBrowser() throws Throwable{
		initilizeBrowser();
		//all object of pom
		login1=new Pom1(driver);
		login2=new Pom2(driver);
		home=new Pom3(driver);
	}
	@BeforeMethod
	public void loginToApp() throws Throwable {
		//enter UN
		login1.enterUN(Utility_Class.getTD(0, 0));
		System.out.println((Utility_Class.getTD(0, 0)));
		
		//enter PWD
		login1.PWD(Utility_Class.getTD(0, 1));
		System.out.println((Utility_Class.getTD(0, 1)));
		
		//click on login btn
		login1.LOGINBTN();
		
		//enter Pin
		login2.enterPIN(Utility_Class.getTD(0, 2));
		System.out.println((Utility_Class.getTD(0, 2)));
		
		//click on continue btn
		login2.clickBtn();
	}
@Test
public void verifyuserID() throws Throwable {
	Reporter.log("running verify userid",true);
	String actID=home.verifyuserID(null);
	String expID=Utility_Class.getTD(0, 0);
	Assert.assertEquals(expID, actID,"both are diff tc is fail");
	}
	@AfterMethod
	public void logoutApp() {
		Reporter.log("logout the app",true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("close the app",true);
		
		
		
		
		
		
	}
}	