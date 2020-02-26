package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Informations {

	WebDriver driver;

	public Informations(WebDriver driver) {
		this.driver = driver;
	}

	By pdf = By.xpath("/html/body/div/div[4]/div/div[1]/div/div/div/span[3]/a/img");
	By print = By.xpath("/html/body/div/div[4]/div/div[1]/div/div/div/span[2]/a/img");
	By email = By.xpath("/html/body/div/div[4]/div/div[1]/div/div/div/span[1]/a/img");
	By pdfWarningQAboutFakes = By.xpath("/html/body/div/div[4]/div/div[2]/div/div/div/div/span[3]/a/img");
	By printWarningQAboutFakes = By.xpath("/html/body/div/div[4]/div/div[2]/div/div/div/div/span[2]/a/img");
	By emailWarningQAboutFakes = By.xpath("/html/body/div/div[4]/div/div[2]/div/div/div/div/span[1]/a/img");
	By moreAboutWarningAboutFakes = By.xpath("/html/body/div/div[4]/div/div[2]/div/div/div/p[5]/a");

	public void clickPdfIcon() {
		driver.findElement(pdf).click();
	}

	public void clickPrintIcon() {
		driver.findElement(print).click();
	}

	public void clickEmailIcon() {
		driver.findElement(email).click();
	}

	public void clickPdfWithWarningAboutFakesIcon() {
		driver.findElement(pdfWarningQAboutFakes).click();
	}

	public void clickPrintWithWarningAboutFakesIcon() {
		driver.findElement(printWarningQAboutFakes).click();
	}

	public void clickEmailWithWarningAboutFakesIcon() {
		driver.findElement(emailWarningQAboutFakes).click();
	}

	public WarningAboutFakes clickMoreIconWhichRedirectsToWarningAboutFakesPage() {
		driver.findElement(moreAboutWarningAboutFakes).click();
		return new WarningAboutFakes(driver);
	}
}