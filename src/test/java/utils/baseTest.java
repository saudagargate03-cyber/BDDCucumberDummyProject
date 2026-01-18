package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseTest {

WebDriver driver;	
	public WebDriver openBrowser() {
		
		System.setProperty("Webdriver.chrome.driver", "C:/Users/DELL/automation/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		return driver;
	}
	
}
