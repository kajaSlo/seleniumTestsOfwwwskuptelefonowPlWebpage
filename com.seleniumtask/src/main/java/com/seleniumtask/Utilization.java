package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Utilization {

	WebDriver driver;

	public Utilization(WebDriver driver) {
		this.driver = driver;
	}

	By backToHomePage = By.xpath("/html/body/div/div/div/div[2]/ul/li/a");

	public MainPage clickBackToHomePageButton() {
		driver.findElement(backToHomePage).click();
		return new MainPage(driver);
	}
}
