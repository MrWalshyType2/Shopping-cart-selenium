package com.example.selenium.cuke;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.example.selenium.pom.HomePagePortal;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FindItemCheckoutCukeTest {
	
	WebDriver driver;
	
	HomePagePortal website;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\morga\\OneDrive\\Documents\\QA\\TheDemoSite\\src\\test\\resources\\drivers\\chromedriver84.exe");
		driver = new ChromeDriver();
		this.website = PageFactory.initElements(driver, HomePagePortal.class);
	}

	@Given("^I can access the fashion website$")
	public void i_can_access_the_fashion_website() {
		String url = "http://automationpractice.com/index.php";
		driver.get("http://automationpractice.com/index.php");
		
		assertEquals(url, driver.getCurrentUrl());
	}

	@Given("^I have login credentials of email: \"([^\"]*)\", password: \"([^\"]*)\"$")
	public void i_have_login_credentials_of_email_password(String arg1, String arg2) {

	}

	@When("^I search for item \"([^\"]*)\"$")
	public void i_search_for_item(String arg1) {

	}

	@When("^I add item \"([^\"]*)\" to my basket$")
	public void i_add_item_to_my_basket(String arg1) {

	}

	@When("^I can go to checkout$")
	public void i_can_go_to_checkout() {

	}

	@Then("^I should see the item \"([^\"]*)\" in my basket$")
	public void i_should_see_the_item_in_my_basket(String arg1) {

	}

	@Then("^I can order the item \"([^\"]*)\" in my basket$")
	public void i_can_order_the_item_in_my_basket(String arg1) {

	}

	@Then("^I should see a successful order result of \"([^\"]*)\"$")
	public void i_should_see_a_successful_order_result_of(String arg1) {

	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
