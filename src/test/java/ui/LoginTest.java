package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static String browser = "edge";

	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Setup driver based on browser
		if (browser.equals("Firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browser.equals("chrome")) {

			// Setup the chrome driver
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();
		} else if( browser.equals("edge")) {
			
			WebDriverManager.edgedriver().setup();
			
			driver = new EdgeDriver();
		}

		// Open browser
		driver.get("https://www.saucedemo.com/");

		// Find the element and enter username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		// Find password element and enter password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		// Find submit button using Xpath
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

		// Close the browser
		driver.close();

	}

}
