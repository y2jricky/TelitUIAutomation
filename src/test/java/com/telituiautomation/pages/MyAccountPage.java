package com.telituiautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.telituiautomation.utilities.BrowserUtility;

public final class MyAccountPage extends BrowserUtility {

	private static final By MY_ACCOUNT_USERNAME_LOCATOR = By.xpath("//a[@title=\"View my customer account\"]/span");

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	public String getUserName() {
		return getVisibleText(MY_ACCOUNT_USERNAME_LOCATOR);

	}

}
