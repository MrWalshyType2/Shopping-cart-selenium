package com.example.selenium.pom.shopping_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartShippingPage {

	@FindBy(xpath = "//*[@id=\"form\"]/p/button")
	private WebElement checkoutBtn;
	
	@FindBy(xpath = "//*[@id=\"cgv\"]")
	private WebElement tosBtn;
	
	public ShoppingCartShippingPage() {
		
	}
	
	public void proceedToCheckout() {
		this.tosBtn.click();
		this.checkoutBtn.click();
	}
}
