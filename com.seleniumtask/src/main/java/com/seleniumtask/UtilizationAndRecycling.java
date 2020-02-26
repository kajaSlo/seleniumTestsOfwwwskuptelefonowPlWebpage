package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UtilizationAndRecycling {

	WebDriver driver;

	public UtilizationAndRecycling(WebDriver driver) {
		this.driver = driver;
	}

	By orderAFreeCourier = By.xpath("/html/body/div/div[4]/div/p[1]/a/img");
	By certyficate = By.xpath("/html/body/div/div[4]/div/p[10]/span/span/strong/span/span/a/img");
	By pdf = By.xpath("/html/body/div/div[4]/div/p[17]/span[3]/a/img");
	By print = By.xpath("/html/body/div/div[4]/div/p[17]/span[2]/a/img");
	By email = By.xpath("/html/body/div/div[4]/div/p[17]/span[1]/a/img");

	public OrderAFreeCourier clickOrderAFreeCourier() {
		driver.findElement(orderAFreeCourier).click();
		return new OrderAFreeCourier(driver);
	}

	public CertyficateOfUtilization clickCertyficate() {
		driver.findElement(certyficate).click();
		return new CertyficateOfUtilization(driver);
	}

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