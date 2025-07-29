package com.telituiautomation.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.telituiautomation.constants.Browser;

public abstract class BrowserUtility {
	private WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public BrowserUtility(WebDriver driver) {
		super();
		this.driver = driver;// Initialize the Instance variable driver
	}
	
	public BrowserUtility (String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else {
			System.err.print("Please enter the correct browser name");
		}
	}
	
	public BrowserUtility (Browser browserName) {
		if(browserName==Browser.CHROME) {
			driver = new ChromeDriver();
		}
		else if(browserName==Browser.EDGE) {
			driver = new EdgeDriver();
		}
		else {
			System.err.print("Please enter the correct browser name");
		}
	}

	public void goToWebsite(String url) {
		driver.get(url);
	}

	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void clickOn(By locator) {
		WebElement element = driver.findElement(locator);
		element.click();
	}

	public void enterText(By locator, String value) {
		WebElement element = driver.findElement(locator);
		element.sendKeys(value);
	}

	public String getVisibleText(By locator) {
		WebElement element = driver.findElement(locator);
		return element.getText();
	}

}
