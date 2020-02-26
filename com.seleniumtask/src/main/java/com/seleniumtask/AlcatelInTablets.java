package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlcatelInTablets {

	WebDriver driver;

	public AlcatelInTablets(WebDriver driver) {
		this.driver = driver;
	}

	By alcatelOneTouchEVO7 = By.xpath("/html/body/div/div[4]/div/div[3]/div/div");

	public By alcatelOneTouchEV07Icon() {
		return alcatelOneTouchEVO7;
	}
}