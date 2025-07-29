package com.telituiautomation.test;

import static com.telituiautomation.constants.Browser.*;
import com.telituiautomation.pages.HomePage;

public class LoginTest3 {
	public static void main(String[] args) {
		//WebDriver driver = new ChromeDriver();
		HomePage homePage = new HomePage(EDGE);
		String username = homePage.goToLogInPage().doLoginWith("bis666@code-gmail.com", "password").getUserName();
		System.out.println(username);
	}

}
