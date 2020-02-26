package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AscendP6InHuawei {

	WebDriver driver;

	public AscendP6InHuawei(WebDriver driver) {
		this.driver = driver;
	}

	By ascendP6 = By.xpath("/html/body/div/div[4]/div/div[3]/div/div");

	public By ascendP6Icon() {
		return ascendP6;
	}
}