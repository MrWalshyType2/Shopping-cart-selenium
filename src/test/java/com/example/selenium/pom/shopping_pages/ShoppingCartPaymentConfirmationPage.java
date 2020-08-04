package com.example.selenium.pom.shopping_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPaymentConfirmationPage {

	@FindBy(xpath = "//*[@id=\"cart_navigation\"]/button")
	private WebElement confirmOrder;
	
	public ShoppingCartPaymentConfirmationPage() {
		
	}
	
	public void confirmOrder() {
		this.confirmOrder.click();
	}
}
