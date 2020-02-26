package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactInCertyficateOfUtilization {

	WebDriver driver;

	public ContactInCertyficateOfUtilization(WebDriver driver) {
		this.driver = driver;
	}

	By name = By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div[1]/div/div/div/div/div/div/div/form/fieldset/dl/dd[1]/input");
	By email = By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div[1]/div/div/div/div/div/div/div/form/fieldset/dl/dd[2]/input");
	By topic = By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div[1]/div/div/div/div/div/div/div/form/fieldset/dl/dd[3]/input");
	By message = By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div[1]/div/div/div/div/div/div/div/form/fieldset/dl/dd[4]/textarea");
	By sendACopyToyou = By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div[1]/div/div/div/div/div/div/div/form/fieldset/dl/dd[5]/input");
	By sendALetter = By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div[1]/div/div/div/div/div/div/div/form/fieldset/dl/dd[6]/button");

	public void fillInName(String yourName) {
		driver.findElement(name).sendKeys(yourName);
	}

	public void fillInEmail(String mail) {
		driver.findElement(email).sendKeys(mail);
	}

	public void fillInTopic(String messageTopic) {
		driver.findElement(topic).sendKeys(messageTopic);
	}

	public void fillInMessage(String yourMessage) {
		driver.findElement(message).sendKeys(yourMessage);
	}

	public void clicksendACopyToYou() {
		driver.findElement(sendACopyToyou).click();
	}

	public void clickSendAletter() {
		driver.findElement(sendALetter).click();
	}
}
