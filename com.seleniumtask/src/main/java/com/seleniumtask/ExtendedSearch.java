package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ExtendedSearch {

	WebDriver driver;

	public ExtendedSearch(WebDriver driver) {
		this.driver = driver;
	}

	By firstInputField = By.xpath("/html/body/div/div[4]/div/table/tbody/tr/td/form/table/tbody/tr/td/table/tbody/tr/td[1]/input[1]");
	By dropDownAndOrNot = By.xpath("/html/body/div/div[4]/div/table/tbody/tr/td/form/table/tbody/tr/td/table/tbody/tr/td[1]/select[1]");
	By secondInputField = By.xpath("/html/body/div/div[4]/div/table/tbody/tr/td/form/table/tbody/tr/td/table/tbody/tr/td[1]/input[2]");
	By secondDropDown = By.xpath("/html/body/div/div[4]/div/table/tbody/tr/td/form/table/tbody/tr/td/table/tbody/tr/td[1]/select[2]");
	By allIformationsAboutProducts = By.xpath("/html/body/div/div[4]/div/table/tbody/tr/td/form/table/tbody/tr/td/table/tbody/tr/td[1]/select[3]");
	By searchButton = By.xpath("/html/body/div/div[4]/div/table/tbody/tr/td/form/table/tbody/tr/td/table/tbody/tr/td[1]/input[3]");

	public void typeWordsWhichWillBeUsedInSearchingFirstField(String expression) {
		driver.findElement(firstInputField).sendKeys(expression);
	}

	public void typeWordsWhichWillBeUsedInSearchingSecondField(String expression) {
		driver.findElement(secondInputField).sendKeys(expression);
	}

	public void dropDownNot() {
		Select dropDownOR = new Select(driver.findElement(dropDownAndOrNot));
		dropDownOR.selectByValue("and not");
	}

	public void dropDownAnd() {
		Select dropDownAND = new Select(driver.findElement(dropDownAndOrNot));
		dropDownAND.selectByValue("and");
	}

	public void dropDownAllCategories() {
		Select dropDownAllCategories = new Select(driver.findElement(secondDropDown));
		dropDownAllCategories.selectByVisibleText("wszystkie kategorie");
	}

	public void dropDownA3A5A7() {
		Select dropDownA3A5A7 = new Select(driver.findElement(secondDropDown));
		dropDownA3A5A7.selectByVisibleText("A3 / A5 / A7");
	}

	public void dropDownNewProductsInTheBestPrice() {
		Select dropDownNewProductsInTheBestPrice = new Select(driver.findElement(secondDropDown));
		dropDownNewProductsInTheBestPrice.selectByValue("282");
	}

	public void dropDownGalaxyj5j52016() {
		Select dropDownAllCategories = new Select(driver.findElement(secondDropDown));
		dropDownAllCategories.selectByVisibleText("Galaxy J5 / J5 2016");
	}

	public void dropDownAllInformationsAboutProducts() {
		Select dropDownAllInformationsAoutProducts = new Select(driver.findElement(allIformationsAboutProducts));
		dropDownAllInformationsAoutProducts.selectByVisibleText("wszystkie informacje o produktach");
	}

	public SamsungGalaxyJ5 clickSearchButtonJ5() {
		driver.findElement(searchButton).click();
		return new SamsungGalaxyJ5(driver);
	}

	public NewProductsInTheBestPrice clickSearchButtonGalaxyA36A32017() {
		driver.findElement(searchButton).click();
		return new NewProductsInTheBestPrice(driver);
	}

	public SamsungA3A5A7 clickSearchButtonSamsungA3A5A7() {
		driver.findElement(searchButton).click();
		return new SamsungA3A5A7(driver);
	}
}
