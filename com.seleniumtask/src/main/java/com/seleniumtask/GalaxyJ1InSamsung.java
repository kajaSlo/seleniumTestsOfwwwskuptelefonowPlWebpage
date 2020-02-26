package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GalaxyJ1InSamsung {

	WebDriver driver;

	public GalaxyJ1InSamsung(WebDriver driver) {
		this.driver = driver;
	}

	By galaxyJ1 = By.xpath("/html/body/div/div[4]/div/div[3]/div/div");

	public By galaxyJ1Icon() {
		return galaxyJ1;
	}
}