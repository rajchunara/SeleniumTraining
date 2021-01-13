package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//li[@data-cy = 'account']")).click();
		driver.findElement(By.xpath("//span[text()=\"From\"]")).click();
		WebElement findInput  = driver.findElement(By.xpath("//input[@data-cy=\"fromCity\"]"));
//		findInput.click();
		findInput.sendKeys("Sydney");
		findInput.sendKeys(Keys.ARROW_DOWN);
		findInput.sendKeys(Keys.ENTER);
		
		
		
		
		

	}

}
