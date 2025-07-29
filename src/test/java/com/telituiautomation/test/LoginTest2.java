package com.telituiautomation.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.telituiautomation.constants.Browser;
import com.telituiautomation.pages.HomePage;
import com.telituiautomation.pages.LoginPage;

public class LoginTest2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		HomePage homePage = new HomePage(Browser.CHROME);
		LoginPage loginPage = homePage.goToLogInPage();
		loginPage.doLoginWith("bis666@code-gmail.com", "password");

	}

}
