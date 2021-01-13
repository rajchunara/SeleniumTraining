package testNG;

import org.testng.annotations.Test;

public class TestNgFeatures {

	
	@Test
	public void loginTest() {
		System.out.println("login test");
	}
	
	
	//This test depends on loginTest
	@Test(dependsOnMethods="loginTest")
	public void homePageTest() {
		System.out.println("home page test");
	}
	
	@Test
	public void searchPageTest() {
		System.out.println("search page test");
	}
}
