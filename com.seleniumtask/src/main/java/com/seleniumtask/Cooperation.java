package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cooperation {

	WebDriver driver;

	public Cooperation(WebDriver driver) {
		this.driver = driver;
	}

	By goAndSee = By.xpath("/html/body/div/div[4]/div/p[2]/a/span/strong");

	public GoAndSee clickGoAndSeeButton() {
		driver.findElement(goAndSee).click();
		return new GoAndSee(driver);
	}
}
