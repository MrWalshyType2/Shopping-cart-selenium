package com.example.selenium.pom.account_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddUserPage {

	@FindBy(xpath = "//*[@id=\"id_gender1\"]")
	private WebElement maleRadioBtn;
	
	@FindBy(xpath = "//*[@id=\"customer_firstname\"]")
	private WebElement forenameField;
	
	@FindBy(xpath = "//*[@id=\"customer_lastname\"]")
	private WebElement surnameField;
	
	@FindBy(xpath = "//*[@id=\"passwd\"]")
	private WebElement passwordField;

	@FindBy(xpath = "//*[@id=\"days\"]")
	private WebElement dobDaysDropdown;
	
	@FindBy(xpath = "//*[@id=\"months\"]")
	private WebElement dobMonthsDropdown;
	
	@FindBy(xpath = "//*[@id=\"years\"]")
	private WebElement dobYearsDropdown;
	
	@FindBy(xpath = "//*[@id=\"firstname\"]")
	private WebElement firstNameAddress;
	
	@FindBy(xpath = "//*[@id=\"lastname\"]")
	private WebElement surnameAddress;
	
	@FindBy(xpath = "//*[@id=\"address1\"]")
	private WebElement address;
	
	@FindBy(xpath = "//*[@id=\"city\"]")
	private WebElement city;
	
	@FindBy(xpath = "//*[@id=\"id_state\"]")
	private WebElement stateDropdown;
	
	@FindBy(xpath = "//*[@id=\"postcode\"]")
	private WebElement zipCode;
	
	@FindBy(xpath = "//*[@id=\"phone_mobile\"]")
	private WebElement mobilePhone;
	
	@FindBy(xpath = "//*[@id=\"alias\"]")
	private WebElement alias;
	
	@FindBy(xpath = "//*[@id=\"submitAccount\"]/span")
	private WebElement registerBtn;

	public AddUserPage() {
//		WebDriver driver
//		Select dobday = new Select(driver.findElement(By.xpath("")));
	}
	
	public void createUser(String forename, String surname, String password, String address, String city, String zipCode,
			String mobileNumber, String alias) {
		this.maleRadioBtn.click();
		this.forenameField.sendKeys(forename);
		this.surnameField.sendKeys(surname);
		this.passwordField.sendKeys(password);
		new Select(this.dobDaysDropdown).selectByValue("5");
		new Select(this.dobMonthsDropdown).selectByValue("12");
		new Select(this.dobYearsDropdown).selectByValue("2000");
		this.firstNameAddress.sendKeys(forename);
		this.surnameAddress.sendKeys(surname);
		this.address.sendKeys(address);
		this.city.sendKeys(city);
		new Select(this.stateDropdown).selectByValue("1");
		this.zipCode.sendKeys(zipCode);
		this.mobilePhone.sendKeys(mobileNumber);
		
		registerBtn.click();
	}
}
