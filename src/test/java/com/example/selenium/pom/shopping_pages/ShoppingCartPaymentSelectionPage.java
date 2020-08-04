package com.example.selenium.pom.shopping_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPaymentSelectionPage {

	@FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	private WebElement payByWire;
	
	public ShoppingCartPaymentSelectionPage() {
		
	}
	
	public void payByWire() {
		payByWire.click();
	}
}
