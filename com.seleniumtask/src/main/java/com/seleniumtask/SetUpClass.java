package com.seleniumtask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SetUpClass {

	public static WebDriver driver;

	static String driverPath = "/home/kaja/Pulpit/praca_licencjacka/git/all_tests/phantomjs-2.1.1-linux-x86_64/bin/phantomjs";

	public void initPhantomJSDriver(String url) {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setJavascriptEnabled(true);
		caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, driverPath);
		driver = new PhantomJSDriver(caps);
		driver.manage().window().maximize();
		driver.get(url);
	}

	public void quitDriver() {
		driver.quit();
	}

	public String verifyTitle() {
		return driver.getTitle();
	}
}
