package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MotoGInMotorolaLenovo {

	WebDriver driver;

	public MotoGInMotorolaLenovo(WebDriver driver) {
		this.driver = driver;
	}

	By motoGInMotorolaLenovo = By.xpath("/html/body/div/div[4]/div/div[3]/div/div");
	public By motoGInMotorolaLenovoIcon() {
		return motoGInMotorolaLenovo;
	}
}
