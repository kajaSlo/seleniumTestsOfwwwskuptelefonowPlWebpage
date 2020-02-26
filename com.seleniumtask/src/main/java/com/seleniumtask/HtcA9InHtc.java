package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HtcA9InHtc {

	WebDriver driver;

	public HtcA9InHtc(WebDriver driver) {
		this.driver = driver;
	}

	By htcA9 = By.xpath("/html/body/div/div[4]/div/div[3]/div/div");

	public By htcA9Icon() {
		return htcA9;
	}
}
