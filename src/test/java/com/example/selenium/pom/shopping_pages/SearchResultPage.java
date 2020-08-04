package com.example.selenium.pom.shopping_pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage {

	@FindBy(xpath = "//*[@id=\"center_column\"]/ul")
	WebElement productList;
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	WebElement checkoutButton;
	
	public SearchResultPage() {
		
	}
	
	public void addToCart(String item) {
		List<WebElement> products = productList.findElements(By.className("product-container"));
		
		for (WebElement element : products) {
			if (element.findElement(By.className("product-name")).getText().strip().equals(item)) {
				element.findElement(By.className("ajax_add_to_cart_button")).click();
			}
		}
		System.out.println("Could not find product to add.");
	}
	
	public void proceedToCheckout() {
		checkoutButton.click();
	}
}
