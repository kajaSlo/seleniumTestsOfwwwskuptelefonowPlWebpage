package com.seleniumtask;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewProductsInTheBestPrice {

	WebDriver driver;

	public NewProductsInTheBestPrice(WebDriver driver) {
		this.driver = driver;
	}

	By galaxyA36 = By.xpath("/html/body/div/div[4]/div/div[3]/div[1]/div");
	By galaxyA32017 = By.xpath("/html/body/div/div[4]/div/div[3]/div[2]/div");

	public By getGalaxyA36() {
		return galaxyA36;
	}

	public By getGalaxyA32017() {
		return galaxyA32017;
	}
}
