package com.seleniumtask;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IphonesSEInIphones {

	WebDriver driver;

	public IphonesSEInIphones(WebDriver driver) {
		this.driver = driver;
	}

	By iphoneSE16GB = By.xpath("/html/body/div/div[4]/div/div[3]/div[1]");
	By iphoneSE64GB = By.xpath("/html/body/div/div[4]/div/div[3]/div[2]/div");

	public List <By> iphonesSEIcons() {
		List <By> iphonesSE = new ArrayList <>();
		iphonesSE.add(iphoneSE16GB);
		iphonesSE.add(iphoneSE64GB);
		return iphonesSE;
	}
}
