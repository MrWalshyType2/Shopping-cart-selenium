package com.example.selenium.pom.account_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage {

	@FindBy(xpath = "//*[@id=\"search_query_top\"]")
	private WebElement search;

	public MyAccountPage() {
		
	}
	
	public void searchSearchBar(String searchTerm) {
		this.search.sendKeys(searchTerm);
		this.search.submit();
	}
}
