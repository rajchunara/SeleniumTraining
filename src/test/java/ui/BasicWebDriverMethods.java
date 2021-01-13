package ui;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicWebDriverMethods {

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
			
		} else if (browser.equals("edge")) {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		// Open browser
		driver.get("https://www.saucedemo.com/");
		
		//manage() gives Option interface which as other methods
		//Here we just maximize the window
		driver.manage().window().maximize();
		
		//Get current URL
		String currentUrl = driver.getCurrentUrl();
		System.out.println("CurrentURL - "+currentUrl);
		
		
		//Get title of page
		String title = driver.getTitle();
		System.out.println("Title - "+ title);
		
		//Get the code of the page
		String pageSource = driver.getPageSource();
		System.out.println("Pagesource - "+pageSource);
		
		// Find the element and enter username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		// Find password element and enter password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		// Find submit button using Xpath
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		//Find multiple elements using Xpath, It will return list of WebElements
		List<WebElement> webElements =  driver.findElements(By.xpath("//*[@class=\"inventory_list\"]/div"));
		System.out.println(webElements);
		
		//WindowHandles are like Id for every window, using this window handles we can switch windows and do other tasks
		driver.navigate().to("https://www.sugarcrm.com/");
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/section[4]/div/div/div[1]/a")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		//Navigate 
		//driver.navigate().to("http://google.com");
		
		
		
		//quit() will close all windows
		//close() will close single window, if it is last window it will close it
		//driver.close();

	}

}
