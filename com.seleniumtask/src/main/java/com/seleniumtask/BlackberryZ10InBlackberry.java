package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BlackberryZ10InBlackberry {

	WebDriver driver;

	public BlackberryZ10InBlackberry(WebDriver driver) {
		this.driver = driver;
	}

	By blackberryZ10 = By.xpath("/html/body/div/div[4]/div/div[3]/div/div");

	public By blackberryZ10Icon() {
		return blackberryZ10;
	}
}