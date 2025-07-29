package com.telituiautomation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.telituiautomation.utilities.BrowserUtility;

public class LoginTest {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		BrowserUtility browserutility = new BrowserUtility(driver);
		
		browserutility.goToWebsite("http://www.automationpractice.pl/index.php");
		browserutility.maximizeWindow();
		
		By signInLinkLocator = By.xpath("//a[contains(text(),\"Sign in\")]");
		browserutility.clickOn(signInLinkLocator);

		
		By emailAddressTextBoxLocator = By.id("email");
		browserutility.enterText(emailAddressTextBoxLocator, "sadasdsadsa");
		
		By passwordTextBoxLocator = By.id("passwd");
		browserutility.enterText(passwordTextBoxLocator, "sadasdsadsa");
		
		
		By signInButtonLocator = By.id("SubmitLogin");
		browserutility.clickOn(signInButtonLocator);
	}

}
