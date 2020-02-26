package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginRejestration {

	WebDriver driver;

	public LoginRejestration(WebDriver driver) {
		this.driver = driver;
	}

	By regulations = By.xpath("/html/body/center/b/div[1]/a[1]");
	By contact = By.xpath("/html/body/center/b/div[1]/a[2]");
	By sendInquiry = By.xpath("/html/body/center/b/div[2]/div/table/tbody/tr[3]/td/input");
	By login = By.xpath("/html/body/center/b/div[2]/div/table/tbody/tr[1]/td[2]/input");
	By password = By.xpath("/html/body/center/b/div[2]/div/table/tbody/tr[2]/td[2]/input");
	By rejestration = By.xpath("/html/body/center/b/div[2]/div/a/button");

	public RegulationsInLoginRejestration clickRegulations() {
		driver.findElement(regulations).click();
		return new RegulationsInLoginRejestration(driver);
	}

	public Contact clickContact() {
		driver.findElement(contact).click();
		return new Contact(driver);
	}

	public void clickSendInquiry() {
		driver.findElement(sendInquiry).click();
	}

	public void fillInTextIntoLoginInputField(String inputLogin) {
		driver.findElement(login).sendKeys(inputLogin);
	}

	public void fillInTextIntoPasswordInputField(String inputPassword) {
		driver.findElement(password).sendKeys(inputPassword);
	}

	public RejestrationInLoginRejestration clickRejestration() {
		driver.findElement(rejestration).click();
		return new RejestrationInLoginRejestration(driver);
	}
}
