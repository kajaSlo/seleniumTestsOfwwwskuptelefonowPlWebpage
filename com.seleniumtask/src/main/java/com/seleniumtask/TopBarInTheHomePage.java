package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopBarInTheHomePage {

	WebDriver driver;

	public TopBarInTheHomePage(WebDriver driver) {
		this.driver = driver;
	}

	By purchasePriceList = By.xpath("/html/body/div/div[2]/ul/li[1]/a");
	By howToSell = By.xpath("/html/body/div/div[2]/ul/li[2]/a/span");
	By safeShipping = By.xpath("/html/body/div/div[2]/ul/li[3]/a");
	By cooperation = By.xpath("/html/body/div/div[2]/ul/li[4]/a");
	By utilization = By.xpath("/html/body/div/div[2]/ul/li[5]/a");
	By FAQ = By.xpath("/html/body/div/div[2]/ul/li[6]/a");
	By partnership = By.xpath("/html/body/div/div[2]/ul/li[7]/a");
	By earn = By.xpath("/html/body/div/div[2]/ul/li[8]/a");
	By contact = By.xpath("/html/body/div/div[2]/ul/li[9]/a");

	public Browse clickPurchasePriceList() {
		driver.findElement(purchasePriceList).click();
		return new Browse(driver);
	}

	public HowToSell clickHowToSell() {
		driver.findElement(howToSell).click();
		return new HowToSell(driver);
	}

	public SafeShipping clickSafeShipping() {
		driver.findElement(safeShipping).click();
		return new SafeShipping(driver);
	}

	public Cooperation clickCooperation() {
		driver.findElement(cooperation).click();
		return new Cooperation(driver);
	}

	public Utilization clickUtilization() {
		driver.findElement(utilization).click();
		return new Utilization(driver);
	}

	public FAQ clickFAQ() {
		driver.findElement(FAQ).click();
		return new FAQ(driver);
	}

	public Partnership clickPartnership() {
		driver.findElement(partnership).click();
		return new Partnership(driver);
	}

	public Earn clickEarn() {
		driver.findElement(earn).click();
		return new Earn(driver);
	}

	public ContactInTopBar clickContact() {
		driver.findElement(contact).click();
		return new ContactInTopBar(driver);
	}
}
