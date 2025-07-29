package com.telituiautomation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();//Launch the browser
		
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign in")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Sign")).click();
	}

}
