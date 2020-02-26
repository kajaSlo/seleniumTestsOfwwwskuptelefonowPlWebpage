package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlcatelIdolMiniInAlcatel {

    WebDriver driver;

    public AlcatelIdolMiniInAlcatel(WebDriver driver) {
        this.driver = driver;
    }

    By alcatelIdolMini = By.xpath("/html/body/div/div[4]/div/div[3]/div/div");

    public By alcatelIdolMiniIcon() {
        return alcatelIdolMini;
    }
}