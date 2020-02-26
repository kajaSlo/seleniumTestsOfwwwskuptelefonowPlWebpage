package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Partnership {

	WebDriver driver;

	public Partnership(WebDriver driver) {
		this.driver = driver;
	}

	By pdf = By.xpath("/html/body/div/div[4]/div/p[168]/span[3]/a/img");
	By print = By.xpath("/html/body/div/div[4]/div/p[168]/span[2]/a/img");
	By sendAnEmail = By.xpath("/html/body/div/div[4]/div/p[168]/span[1]/a/img");

	public void clickPdfIcon() {
		driver.findElement(pdf).click();
	}

	public void clickPrintIcon() {
		driver.findElement(print).click();
	}

	public void clickSendAnEmailIcon() {
		driver.findElement(sendAnEmail).click();
	}
}
