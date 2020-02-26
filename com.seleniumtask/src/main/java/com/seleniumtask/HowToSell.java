package com.seleniumtask;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HowToSell {

	WebDriver driver;

	public HowToSell(WebDriver driver) {
		this.driver = driver;
	}

	By safeShippingInPurchasePriceList = By.xpath("/html/body/div/div[4]/div/p[6]/strong/a");
	By howWillIMakeSureThatIWillGetMoneyForAPhone = By.xpath("/html/body/div/div[4]/div/p[11]/strong/a");
	By getAcquaintedWithRegulations = By.xpath("/html/body/div/div[4]/div/p[17]/strong/a");

	public SafeShipping clickSafeShippingLinkInPurchasePriceList() {
		driver.findElement(safeShippingInPurchasePriceList).click();
		return new SafeShipping(driver);
	}

	public SafeShipping clickHowWillIMakeSureThatIWillGetMoneyForAPhone() {
		driver.findElement(howWillIMakeSureThatIWillGetMoneyForAPhone).click();
		return new SafeShipping(driver);
	}

	public Regulations clickGetAcquaintedWithRegulations() {
		driver.findElement(getAcquaintedWithRegulations).click();
		return new Regulations(driver);
	}
}
