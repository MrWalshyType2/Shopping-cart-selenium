package com.example.selenium.pom.shopping_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartAddressPage {

	@FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button")
	private WebElement checkoutBtn;
	
	public ShoppingCartAddressPage() {
		
	}
	
	public void proceedToCheckout() {
		this.checkoutBtn.click();
	}
}
