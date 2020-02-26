package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Earn {

	WebDriver driver;

	public Earn(WebDriver driver) {
		this.driver = driver;
	}

	By loginRejestration = By.xpath("/html/body/div/div[4]/div/p[1]/span[1]/a[1]/span");
	By programSkupTelefonowPl = By.xpath("/html/body/div/div[4]/div/p[1]/span[1]/a[2]/span/strong");
	By createAnAccount = By.xpath("/html/body/div/div[4]/div/p[4]/a/span/span");
	By loginRejestrationProgramSkupTelenowPl = By.xpath("/html/body/div/div[4]/div/p[13]/span/span/strong/a");

	By pdf = By.xpath("/html/body/div/div[4]/div/p[32]/span[3]/a/img");
	By print = By.xpath("/html/body/div/div[4]/div/p[32]/span[2]/a/img");
	By email = By.xpath("/html/body/div/div[4]/div/p[32]/span[1]/a/img");

	public LoginRejestration clickLoginRejestrationButton() {
		driver.findElement(loginRejestration).click();
		return new LoginRejestration(driver);
	}

	public LoginRejestration clickProgramSkupTelefonowPl() {
		driver.findElement(programSkupTelefonowPl).click();
		return new LoginRejestration(driver);
	}

	public LoginRejestration clickCreateAnAccount() {
		driver.findElement(createAnAccount).click();
		return new LoginRejestration(driver);
	}

	public LoginRejestration clickLoginRejestrationProgramSkupTelefonowPl() {
		driver.findElement(loginRejestrationProgramSkupTelenowPl).click();
		return new LoginRejestration(driver);
	}

	public void clickPdfButton() {
		driver.findElement(pdf).click();
	}

	public void clickPrintButton() {
		driver.findElement(print).click();
	}

	public void clickEmailButton() {
		driver.findElement(email).click();
	}
}
