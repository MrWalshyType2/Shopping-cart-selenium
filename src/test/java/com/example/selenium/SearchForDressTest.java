package com.example.selenium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchForDressTest {

	WebDriver driver;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\morga\\OneDrive\\Documents\\QA\\TheDemoSite\\src\\test\\resources\\drivers\\chromedriver84.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void findDressTest() throws InterruptedException {
		String url = "http://automationpractice.com/index.php";
		driver.get(url);
		
		// Get search bar and button
		WebElement searchBar = driver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
		WebElement searchBtn = driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button"));
	
		String term = "Blouse";
		searchBar.sendKeys(term);
		searchBtn.click();
		
		Thread.sleep(1000);
		
		// Get search result of Blouse
		List<WebElement> searchResults = driver.findElements(By.xpath("//*[@id=\"center_column\"]/ul"));
		String result = "";
		
		for (WebElement element : searchResults) {
			if (element.findElement(By.className("product-name")).getText().strip().equals(term)) {
				result = element.findElement(By.className("product-name")).getText().strip();
			}
		}
		
		assertEquals(term, result);
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
