package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	

	
	//Preconditions annotations -- starting with @Before
	@BeforeSuite //1
	public void setUp() {
		System.out.println("setup system property for chrome");
	}
	
	@BeforeTest //2
	public void login() {
		System.out.println("Login method");		
	}	
	
	@BeforeClass//3
	public void launchBrowser() {
		System.out.println("launch chrome browser");
	}
	
	@BeforeMethod //4
	public void enterURL() {
		System.out.println("Enter URL");
	}	

	//Test cases -- starting with @Test
	@Test //5
	public void googleTitleTest() {
		System.out.println("Google title test");		
	}
	
	
	//Post conditions -- starting with @After
	@AfterMethod //6
	public void logOut() {
		System.out.println("Logout from App");
	}
	
	@AfterClass //7
	public void closeBrowser() {
		System.out.println("Close browser");
	}

	
	
	@AfterTest //8
	public void deleteAllCookies() {
		System.out.println("Delete all cookies");
	}
	

	@AfterSuite  //9
	public void generateTestReport() {
		System.out.println("Generate Test Report");
	}
	
//	Output
//	setup system property for chrome
//	Login method
//	launch chrome browser
//	Enter URL
//	Google title test
//	Logout from App
//	Close browser
//	Delete all cookies
//	Generate test report
}
