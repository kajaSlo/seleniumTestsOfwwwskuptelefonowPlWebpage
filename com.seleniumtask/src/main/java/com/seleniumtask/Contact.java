package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Contact {

	WebDriver driver;

	public Contact(WebDriver driver) {
		this.driver = driver;
	}

	By email = By.xpath("/html/body/center/b/div[2]/div[3]/table/tbody/tr[1]/td[2]/input");
	By topic = By.xpath("/html/body/center/b/div[2]/div[3]/table/tbody/tr[2]/td[2]/input");
	By message = By.xpath("/html/body/center/b/div[2]/div[3]/table/tbody/tr[3]/td/textarea");
	By sendACopy = By.xpath("/html/body/center/b/div[2]/div[3]/table/tbody/tr[4]/td[1]/input");
	By send = By.xpath("/html/body/center/b/div[2]/div[3]/table/tbody/tr[5]/td/input");

	public void fillInEmail() {
		driver.findElement(email).sendKeys("email");
	}

	public void fillInTopic() {
		driver.findElement(topic).sendKeys("topic");
	}

	public void fillInMessage() {
		driver.findElement(message).sendKeys("message");
	}

	public void selectSendingACopyToASender() {
		driver.findElement(sendACopy).click();
	}

	public void clickSendButton() {
		driver.findElement(send).click();
	}
}