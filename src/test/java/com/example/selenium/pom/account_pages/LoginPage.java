package com.example.selenium.pom.account_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(xpath = "//*[@id=\"email_create\"]")
	private WebElement emailCreateField;
	
	@FindBy(xpath = "//*[@id=\"SubmitCreate\"]")
	private WebElement submitCreateBtn;
	
	@FindBy(xpath = "//*[@id=\"email\"]")
	private WebElement emailLoginField;
	
	@FindBy(xpath = "//*[@id=\"passwd\"]")
	private WebElement passwordLoginField;
	
	@FindBy(xpath = "//*[@id=\"SubmitLogin\"]")
	private WebElement signInBtn;
	
	public LoginPage() {
		
	}
	
	public void createAccount(String email) {
		this.emailCreateField.sendKeys(email);
		this.submitCreateBtn.click();
	}
	
	public void login(String email, String password) {
		this.emailLoginField.sendKeys(email);
		this.passwordLoginField.sendKeys(password);
		this.signInBtn.click();
	}
}
