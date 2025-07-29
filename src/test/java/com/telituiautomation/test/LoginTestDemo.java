package com.telituiautomation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();// Launch the browser

		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		
		By signInLinkLocator = By.xpath("//a[contains(text(),\"Sign in\")]");
		WebElement signInLinkWebElement =  driver.findElement(signInLinkLocator);
		signInLinkWebElement.click();
		
		By emailAddressTextBoxLocator = By.id("email");
		WebElement emailAddressTextBoxWebElement =  driver.findElement(emailAddressTextBoxLocator);
		emailAddressTextBoxWebElement.sendKeys("text@gmail.com");
		
		By passwordTextBoxLocator = By.id("passwd");
		WebElement passwordTextBoxWebElement =  driver.findElement(passwordTextBoxLocator);
		passwordTextBoxWebElement.sendKeys("sdggsdg");
		
		
		By signInButtonLocator = By.id("SubmitLogin");
		WebElement signInButtonWebElement =  driver.findElement(signInButtonLocator);
		signInButtonWebElement.click();
	}

}
