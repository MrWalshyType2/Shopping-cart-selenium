package com.example.selenium.pom.shopping_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartSummaryPage {

	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
	private WebElement checkoutBtn;
	
	public ShoppingCartSummaryPage() {
		
	}
	
	public void proceedToCheckout() {
		this.checkoutBtn.click();
	}
}
