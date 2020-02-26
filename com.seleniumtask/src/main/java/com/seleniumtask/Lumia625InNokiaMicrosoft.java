package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Lumia625InNokiaMicrosoft {

	WebDriver driver;

	public Lumia625InNokiaMicrosoft(WebDriver driver) {
		this.driver = driver;
	}

	By lumia625 = By.xpath("/html/body/div/div[4]/div/div[3]/div/div");

	public By lumia625Icon() {
		return lumia625;
	}
}
