package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NovaGsmGroup {

	WebDriver driver;

	public NovaGsmGroup(WebDriver driver) {
		this.driver = driver;
	}

	By brandOwner = By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div[1]/div/div/div/div/div/div/div[1]/p[1]/a/img");
	By askOnTheForum = By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div[1]/div/div/div/div/div/div/div[1]/p[2]/a/img");

	public MainPage clickBrandOwner() {
		driver.findElement(brandOwner).click();
		return new MainPage(driver);
	}

	public Forum clickAskOnTheForum() {
		diver.findElement(askOnTheForum).click();
		return new Forum(driver);
	}
}
