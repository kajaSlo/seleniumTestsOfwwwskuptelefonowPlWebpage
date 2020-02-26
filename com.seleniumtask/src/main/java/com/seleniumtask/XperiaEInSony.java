package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XperiaEInSony {

	WebDriver driver;

	public XperiaEInSony(WebDriver driver) {
		this.driver = driver;
	}

	By xperiaE = By.xpath("/html/body/div/div[4]/div/div[3]/div/div");

	public By xperiaEIcon() {
		return xperiaE;
	}
}