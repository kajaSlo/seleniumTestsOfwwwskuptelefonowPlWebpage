package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InvestInPhoneSellsPageNotImplemented {

	WebDriver driver;

	public InvestInPhoneSellsPageNotImplemented(WebDriver driver) {
		this.driver = driver;
	}

	By redirectToMainPage = By.xpath("/html/body/div/div/div/div[2]/ul/li/a");

	public MainPage clickRedirectToMainPageButton() {
		driver.findElement(redirectToMainPage).click();
		return new MainPage(driver);
	}
}
