package com.seleniumtask;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestNovaGsmGroup extends SetUpClass {

	MainPage mainPage;

	@Before
	public void testsSetUp() {
		initPhantomJSDriver("http://www.skuptelefonow.pl/");
		mainPage = new MainPage(driver);
	}

	@Test
	public void testChoosingBrandOwner() {
		UtilizationAndRecycling utilizationAndRecyclingPage = mainPage.clickUtilizationAndRecycling();
		CertyficateOfUtilization redirectToHomePage = utilizationAndRecyclingPage.clickCertyficate();

		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}

		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		NovaGsmGroup novaGsm = redirectToHomePage.clickNovaGsmGroup();
		novaGsm.clickBrandOwner();

		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}
		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		assertEquals("*NOWOŚCI w najlepszej cenie", verifyTitle());
	}

	@Test
	public void testChosingAskOnTheForum() {
		UtilizationAndRecycling utilizationAndRecyclingPage = mainPage.clickUtilizationAndRecycling();
		CertyficateOfUtilization redirectToHomePage = utilizationAndRecyclingPage.clickCertyficate();
		
		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}
		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		NovaGsmGroup novaGsm = redirectToHomePage.clickNovaGsmGroup();
		novaGsm.clickAskOnTheForum();

		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}

		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		assertEquals("Strona główna forum • Forum Telefonów", verifyTitle());
	}

	@After
	public void closingConnectionWithWebPage() {
		quitDriver();
	}
}