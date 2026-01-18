package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.baseTest;

public class testFileDefination {
	
	WebDriver driver;
	@Given("I landed on login page")
	public void i_landed_on_login_page() {

			
			System.setProperty("Webdriver.chrome.driver", "C:/Users/DELL/automation/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			driver.manage().window().maximize();
			
	}

	@When("I logged into application")
	public void i_logged_into_application() {

	}

	@When("Search for {string} in searchbox")
	public void search_for_in_searchbox(String Name) throws InterruptedException {
		driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys(Name);
		driver.findElement(By.xpath("//button[@class=\"search-button\"]")).click();
		
		Thread.sleep(3000);

	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
		
		driver.close();
		
	}

}
