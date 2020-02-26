package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PhonesPricing {

	WebDriver driver;

	public PhonesPricing(WebDriver driver) {
		this.driver = driver;
	}

	By pdf = By.xpath("/html/body/div/div[4]/div/p[4]/span[3]/a/img");
	By print = By.xpath("/html/body/div/div[4]/div/p[4]/span[2]/a/img");
	By email = By.xpath("/html/body/div/div[4]/div/p[4]/span[1]/a/img");

	public void clickPdfIcon() {
		driver.findElement(pdf).click();
	}

	public void clickPrintIcon() {
		driver.findElement(print).click();
	}

	public void clickEmailIcon() {
		driver.findElement(email).click();
	}
}
