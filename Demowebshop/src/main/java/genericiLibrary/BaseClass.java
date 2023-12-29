package genericiLibrary;

import javax.xml.stream.XMLReporter;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public static WebDriver driver;
	
	
	@BeforeSuite
	public static beforeSuite() {
		Reporter.log("Connect to database",true);
	}
	@AfterSuite
	public static afterSuite() {
		Reporter.log("Close connections to database",true);
	}
	@BeforeTest
	public static beforeTest() {
		Reporter.log("Before Test",true);
	}
	@AfterTest
	public static afterTest() {
		Reporter.log("After Test",true);
	}
}	

	
	
		

