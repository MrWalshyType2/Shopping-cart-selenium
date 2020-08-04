package com.example.selenium.pom;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FindItemCheckoutTest {
	
	WebDriver driver;
	
	HomePagePortal website;

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\morga\\OneDrive\\Documents\\QA\\TheDemoSite\\src\\test\\resources\\drivers\\chromedriver84.exe");
		driver = new ChromeDriver();
		this.website = PageFactory.initElements(driver, HomePagePortal.class);
	}
	
	@Test
	public void orderTest() throws InterruptedException {
		driver.get("http://automationpractice.com/index.php");
		
		this.website.navLoginPage();
		
		Thread.sleep(4000);
		
		try {
			this.website.loginPage.createAccount("bobbyo@mailme.com");
			Thread.sleep(4000);
			this.website.addUserPage.createUser("Bob", "Fred", "password", "123 somewhere", "Somewhere", "00000", "0988094839", "Fred");
		} catch (Exception e) {
			System.out.println(e.toString());
			this.website.loginPage.login("bobbyo@mailme.com", "password");
		}
		
		this.website.myAccountPage.searchSearchBar("Blouse");
		
		try {
			this.website.searchResultPage.addToCart("Blouse");
			Thread.sleep(4000);
			this.website.searchResultPage.proceedToCheckout();
			this.website.shoppingCartSummary.proceedToCheckout();
			this.website.shoppingCartAddress.proceedToCheckout();
			this.website.shoppingCartShipping.proceedToCheckout();
			this.website.shoppingCartPaymentSelection.payByWire();
			this.website.shoppingCartPaymentConfirmation.confirmOrder();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		Thread.sleep(4000);
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
