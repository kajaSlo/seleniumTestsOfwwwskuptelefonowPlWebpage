package com.seleniumtask;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Opinions {

	WebDriver driver;

	public Opinions(WebDriver driver) {
		this.driver = driver;
	}

	By name = By.xpath("/html/body/div/div[4]/div[3]/div[1]/form/table/tbody/tr[1]/td[2]/input");
	By email = By.xpath("/html/body/div/div[4]/div[3]/div[1]/form/table/tbody/tr[2]/td[2]/input");
	By opinion = By.xpath("/html/body/div/div[4]/div[3]/div[1]/form/table/tbody/tr[4]/td[2]/span/table/tbody/tr[2]/td/iframe");
	By inputFieldToWriteDownACode = By.xpath("/html/body/div/div[4]/div[3]/div[1]/form/table/tbody/tr[4]/td[3]/input");
	By loadNewCode = By.xpath("/html/body/div/div[4]/div[3]/div[1]/form/table/tbody/tr[4]/td[4]/a/img");
	By send = By.xpath("/html/body/div/div[4]/div[3]/div[1]/form/table/tbody/tr[5]/td[2]/input[1]");
	By reset = By.xpath("/html/body/div/div[4]/div[3]/div[1]/form/table/tbody/tr[5]/td[2]/input[2]");
	By mainPage = By.xpath("/html/body/div/div[1]/a/img");

	public WebElement enterAName(String inputName) {
		WebElement element = driver.findElement(name);
		element.sendKeys(inputName);
		return element;
	}

	public WebElement enterEmail(String inputEmail) {
	    WebElement element = driver.findElement(email);
		element.sendKeys(inputEmail);
		return element;
	}

	public WebElement enterACode(String inputCode) {
		WebElement element = driver.findElement(inputFieldToWriteDownACode);
		element.sendKeys(inputCode);
		return element;
	}

	public WebElement enterAnOpinion(String inputOpinion) {
		WebElement element = driver.findElement(opinion);
		element.sendKeys(inputOpinion);
		return element;
	}

	public void loadNewCode() {
		driver.findElement(loadNewCode).click();
	}

	public void send() {
		driver.findElement(send).click();
	}

	public void reset() {
		driver.findElement(reset).click();
	}

	public void redirectToMainPage() {
		driver.findElement(mainPage).click();
	}
}

