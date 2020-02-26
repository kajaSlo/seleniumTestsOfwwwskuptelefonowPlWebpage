package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Basket {

	WebDriver driver;

	public Basket(WebDriver driver) {
		this.driver = driver;
	}

	By productHasBeenAddedToABasket = By.xpath("/html/body/div/div[4]/div[1]/div");
	By updateQuantityOfProducts = By.xpath("/html/body/div/div[4]/div[2]/table/tbody/tr[2]/td[4]/form[1]/input[9]");
	By addAPhone = By.xpath("/html/body/div/div[4]/div/div[1]/a[1]");
	By deleteProductFromBasket = By.xpath("/html/body/div/div[4]/div[2]/table/tbody/tr[2]/td[4]/form[2]/input[7]");
	By yourBasketIsEmpty = By.xpath("/html/body/div/div[4]/div");
	By order = By.xpath("/html/body/div/div[4]/div[2]/div[1]/a[2]");

	public void updateQuantityOfProducts() {
		driver.findElement(updateQuantityOfProducts).click();
	}

	public void deleteProductFromABasket() {
		driver.findElement(deleteProductFromBasket).click();
	}

	public MainPage addAPhone() {
		driver.findElement(addAPhone).click();
		return new MainPage(driver);
	}

	public Order makeAnOrder() {
		driver.findElement(order).click();
		return new Order(driver);
	}
}
