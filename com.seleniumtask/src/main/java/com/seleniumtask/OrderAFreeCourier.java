package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderAFreeCourier {

	WebDriver driver;

	public OrderAFreeCourier(WebDriver driver) {
		this.driver = driver;
	}

	By addressInputField = By.xpath("/html/body/div/div[2]/form/div/input[1]");
	By nameAndSurnameInputField = By.xpath("/html/body/div/div[2]/form/div/input[2]");
	By phoneNumberInputField = By.xpath("/html/body/div/div[2]/form/div/input[3]");
	By emailInputField = By.xpath("/html/body/div/div[2]/form/div/input[4]");
	By preferredHourOfContact1014InputField = By.xpath("/html/body/div/div[2]/form/div/input[6]");
	By IOrderAFreeCourier = By.xpath("/html/body/div/div[2]/form/div/input[9]");
	By utilizationOfPhonesIcon = By.xpath("/html/body/div[1]/div[2]/h1/a/img");
	By homeInTopBar = By.xpath("/html/body/div[1]/div[3]/div/div[1]/div/div/ul/li[1]/a/span");

	public void fillInAddressInputField(String address) {
		driver.findElement(addressInputField).sendKeys(address);
	}

	public void fillInNameAndSurnameInputField(String NameAndSurname) {
		driver.findElement(nameAndSurnameInputField).sendKeys(NameAndSurname);
	}

	public void fillInPhoneInputField(String phoneNumber) {
		driver.findElement(phoneNumberInputField).sendKeys(phoneNumber);
	}

	public void fillInEmailInputField(String mail) {
		driver.findElement(emailInputField).sendKeys(mail);
	}

	public void clickPrefferedhourOfContact1014() {
		driver.findElement(preferredHourOfContact1014InputField).click();
	}

	public void clickIOrderAFreeCourier() {
		driver.findElement(IOrderAFreeCourier).click();
	}

	public CertyficateOfUtilization clickUtilizationOfPhonesIcon() {
		driver.findElement(utilizationOfPhonesIcon).click();
		return new CertyficateOfUtilization(driver);
	}

	public CertyficateOfUtilization clickHomeInTopBar() {
		driver.findElement(homeInTopBar).click();
		return new CertyficateOfUtilization(driver);
	}
}