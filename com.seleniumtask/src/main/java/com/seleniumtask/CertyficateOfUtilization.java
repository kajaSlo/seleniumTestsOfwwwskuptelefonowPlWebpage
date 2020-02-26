package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CertyficateOfUtilization {

	WebDriver driver;

	public CertyficateOfUtilization(WebDriver driver) {
		this.driver = driver;
	}
	//top bar
	By orderAFreeCourierinTopBar = By.xpath("/html/body/div[1]/div[3]/div/div[1]/div/div/ul/li[2]/a/span");
	By pointsOfReceipt = By.xpath("/html/body/div[1]/div[3]/div/div[1]/div/div/ul/li[3]/a/span"); 
	By NovaGsmGroup = By.xpath("/html/body/div[1]/div[3]/div/div[1]/div/div/ul/li[4]/a/span");
	By buyingPhones = By.xpath("/html/body/div[1]/div[3]/div/div[1]/div/div/ul/li[5]/a/span");
	By contact = By.xpath("/html/body/div[1]/div[3]/div/div[1]/div/div/ul/li[6]/a/span");
	//the rest
	By orderAFreeCourierIcon = By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div[2]/img[1]");
	By brandOwner = By.xpath("/html/body/div[1]/div[3]/div/div[5]/div/div[2]/div/div/p/a[1]/img");
	By askOnTheForum = By.xpath("/html/body/div[1]/div[3]/div/div[5]/div/div[2]/div/div/p/a[2]/img");

	public OrderAFreeCourier clickOrderAFreeCourierIntopBar() {
		driver.findElement(orderAFreeCourierinTopBar).click();
		return new OrderAFreeCourier(driver);
	}

	public PointsOfReceipt clickPointsOfReceipt() {
		driver.findElement(pointsOfReceipt).click();
		return new PointsOfReceipt(driver);
	}

	public NovaGsmGroup clickNovaGsmGroup() {
		driver.findElement(NovaGsmGroup).click();
		return new NovaGsmGroup(driver);
	}

	public MainPage clickBuyingPhonesWhichRedirectsToMainPage() {
		driver.findElement(buyingPhones).click();
		return new MainPage(driver);
	}

	public ContactInCertyficateOfUtilization clickContact() {
		driver.findElement(contact).click();
		return new ContactInCertyficateOfUtilization(driver);
	}

	public OrderAFreeCourier clickOrderAfreeCourierIcon() {
		driver.findElement(orderAFreeCourierIcon).click();
		return new OrderAFreeCourier(driver);
	}

	public MainPage clickBrandOwner() {
		driver.findElement(brandOwner).click();
		return new MainPage(driver);
	}

	public Forum clickAskOnTheForum() {
		driver.findElement(askOnTheForum).click();
		return new Forum(driver);
	}
}
