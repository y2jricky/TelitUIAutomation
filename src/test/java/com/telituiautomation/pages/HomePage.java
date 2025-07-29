package com.telituiautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.telituiautomation.constants.Browser;
import com.telituiautomation.utilities.BrowserUtility;

public final class HomePage extends BrowserUtility {
	private static final By SIGNIN_LINK_LOCATOR = By.xpath("//a[contains(text(),\"Sign in\")]");

	// This page will follow POM design pattern

	// Here we will store locators from home page. final variables as values won't
	// change
	// If the variable is final, then it should be Static

	public HomePage(Browser browserName) {
		super(browserName);
		goToWebsite("http://www.automationpractice.pl/index.php");
		maximizeWindow();
	}

	public LoginPage goToLogInPage() {
		clickOn(SIGNIN_LINK_LOCATOR);
		LoginPage loginPage = new LoginPage(getDriver());
		return loginPage;

	}

}
