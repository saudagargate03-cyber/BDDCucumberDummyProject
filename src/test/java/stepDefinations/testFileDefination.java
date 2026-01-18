package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.baseTest;

public class testFileDefination {
	public baseTest BaseTest;

	public testFileDefination(WebDriver driver) {
		this.BaseTest.openBrowser();
		
	}

	@Given("I landed on login page")
	public void i_landed_on_login_page() {

	}

	@When("I logged into application")
	public void i_logged_into_application() {

	}

	@When("Search for {string} in searchbox")
	public void search_for_in_searchbox(String Name) throws InterruptedException {
		BaseTest.openBrowser().findElement(By.xpath("//input[@type=\"search\"]")).sendKeys(Name);
		BaseTest.openBrowser().findElement(By.xpath("//button[@class=\"search-button\"]")).click();
		
		Thread.sleep(3000);

	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
		
		BaseTest.openBrowser().close();
		
	}

}
