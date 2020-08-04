package com.example.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.example.selenium.pom.account_pages.AddUserPage;
import com.example.selenium.pom.account_pages.LoginPage;
import com.example.selenium.pom.account_pages.MyAccountPage;
import com.example.selenium.pom.shopping_pages.SearchResultPage;
import com.example.selenium.pom.shopping_pages.ShoppingCartAddressPage;
import com.example.selenium.pom.shopping_pages.ShoppingCartPaymentConfirmationPage;
import com.example.selenium.pom.shopping_pages.ShoppingCartPaymentSelectionPage;
import com.example.selenium.pom.shopping_pages.ShoppingCartShippingPage;
import com.example.selenium.pom.shopping_pages.ShoppingCartSummaryPage;

// Page (POM)
public class HomePagePortal {

	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	private WebElement navLogin;
	
	public AddUserPage addUserPage;
	
	public LoginPage loginPage;
	
	public MyAccountPage myAccountPage;
	
	public SearchResultPage searchResultPage;
	
	public ShoppingCartAddressPage shoppingCartAddress;
	
	public ShoppingCartShippingPage shoppingCartShipping;
	
	public ShoppingCartSummaryPage shoppingCartSummary;
	
	public ShoppingCartPaymentSelectionPage shoppingCartPaymentSelection;
	
	public ShoppingCartPaymentConfirmationPage shoppingCartPaymentConfirmation;
	
	public HomePagePortal(WebDriver driver) {
		this.addUserPage = PageFactory.initElements(driver, AddUserPage.class);
		this.loginPage = PageFactory.initElements(driver, LoginPage.class);
		this.myAccountPage = PageFactory.initElements(driver, MyAccountPage.class);
		this.searchResultPage = PageFactory.initElements(driver, SearchResultPage.class);
		this.shoppingCartAddress = PageFactory.initElements(driver, ShoppingCartAddressPage.class);
		this.shoppingCartShipping = PageFactory.initElements(driver, ShoppingCartShippingPage.class);
		this.shoppingCartSummary = PageFactory.initElements(driver, ShoppingCartSummaryPage.class);
		this.shoppingCartPaymentSelection = PageFactory.initElements(driver, ShoppingCartPaymentSelectionPage.class);
		this.shoppingCartPaymentConfirmation = PageFactory.initElements(driver, ShoppingCartPaymentConfirmationPage.class);
	}
	
	public void navLoginPage() {
		navLogin.click();
	}
}
