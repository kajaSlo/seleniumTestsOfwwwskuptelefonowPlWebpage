package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SellIphone4s8GB {

	WebDriver driver;

	public SellIphone4s8GB(WebDriver driver) {
		this.driver = driver;
	}

	By usedInVeryGoodCondition = By.xpath("/html/body/div[1]/div[4]/div/table/tbody/tr[6]/td/div/form/div[1]/div/div/div[2]/select");
	By clickPrintIcon = By.xpath("/html/body/div[1]/div[4]/div/div[1]/a[1]/img");
	By clickEmailIcon = By.xpath("/html/body/div[1]/div[4]/div/div[1]/a[2]/img");
	By increaseTheQuantity = By.xpath("/html/body/div[1]/div[4]/div/table/tbody/tr[6]/td/div/form/div[2]/input[2]");
	By decreaseTheQuantity = By.xpath("/html/body/div[1]/div[4]/div/table/tbody/tr[6]/td/div/form/div[2]/input[3]");
	By sellButton = By.xpath("/html/body/div[1]/div[4]/div/table/tbody/tr[6]/td/div/form/div[2]/input[4]");

	public void clickPrintIcon() {
		driver.findElement(clickPrintIcon).click();
	}

	public void clickEmailIcon() {
		driver.findElement(clickEmailIcon).click();;
	}

	public void selectUsedCodition() {
		Select dropdownUsedVGCondition = new Select(driver.findElement(usedInVeryGoodCondition));
		dropdownUsedVGCondition.selectByVisibleText("używany bardzo dobry (=200.00 zł)");
	}

	public void increaseTheQuantity() {
		driver.findElement(increaseTheQuantity).click();
	}

	public void decreaseTheQuantity() {
		driver.findElement(decreaseTheQuantity).click();
	}

	public Basket clickSellButton() {
		driver.findElement(sellButton).click();
		return new Basket(driver);
	}
}
