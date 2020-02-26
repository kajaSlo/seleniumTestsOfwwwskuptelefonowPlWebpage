package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SamsungA3A5A7 {

	WebDriver driver;

	public SamsungA3A5A7(WebDriver driver) {
		this.driver = driver;
	}

	By nothingHasBeenFound = By.xpath("/html/body/div/div[4]/div");

	public String getPageResources() {
		return driver.findElement(nothingHasBeenFound).getText();
	}
}
