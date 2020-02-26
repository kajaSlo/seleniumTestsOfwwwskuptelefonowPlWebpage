package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegulationsInLoginRejestration { 
	WebDriver driver;

	public RegulationsInLoginRejestration(WebDriver driver) {
		this.driver = driver;
	}

	By regulations = By.xpath("/html/body/center/b/div[1]/a[1]");
	By contact = By.xpath("/html/body/center/b/div[1]/a[2]");

	public void clickRegulations() {
		driver.findElement(regulations).click();
	}

	public Contact clickContact() {
		driver.findElement(contact).click();
		return new Contact(driver);
	}
}
