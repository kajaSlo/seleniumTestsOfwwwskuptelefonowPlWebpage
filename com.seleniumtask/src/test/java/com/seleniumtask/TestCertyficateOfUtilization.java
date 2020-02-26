package com.seleniumtask;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestCertyficateOfUtilization extends SetUpClass {

	MainPage mainPage;

	@Before
	public void testsSetUp() {
		initPhantomJSDriver("http://www.skuptelefonow.pl/");
		mainPage = new MainPage(driver);
	}

	@Test
	public void testRedirectingToOrderAFreeCourierInTopBar() {
		UtilizationAndRecycling utilizationAndRecyclingPage = mainPage.clickUtilizationAndRecycling();
		CertyficateOfUtilization redirectToHomePage = utilizationAndRecyclingPage.clickCertyficate();
		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}
		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		redirectToHomePage.clickOrderAFreeCourierIntopBar();

		assertEquals("Zamów bezpłatnego kuriera", verifyTitle());
	}

	@Test
	public void testRedirectingToPointsOfReceipt() {
		UtilizationAndRecycling utilizationAndRecyclingPage = mainPage.clickUtilizationAndRecycling();
		CertyficateOfUtilization redirectToHomePage = utilizationAndRecyclingPage.clickCertyficate();
		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}

		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		redirectToHomePage.clickPointsOfReceipt();

		assertEquals("Punkty odbioru", verifyTitle());
	}

	@Test
	public void testRedirectingToNovaGsmGroup() {
		UtilizationAndRecycling utilizationAndRecyclingPage = mainPage.clickUtilizationAndRecycling();
		CertyficateOfUtilization redirectToHomePage = utilizationAndRecyclingPage.clickCertyficate();
		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}

		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		redirectToHomePage.clickNovaGsmGroup();

		assertEquals("Grupa NovaGsm", verifyTitle());
	}

	@Test
	public void testClickingBuyingPhones() {
		UtilizationAndRecycling utilizationAndRecyclingPage = mainPage.clickUtilizationAndRecycling();
		CertyficateOfUtilization redirectToHomePage = utilizationAndRecyclingPage.clickCertyficate();

		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}

		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		redirectToHomePage.clickBuyingPhonesWhichRedirectsToMainPage();

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
	public void testRedirectingToContact() {
		UtilizationAndRecycling utilizationAndRecyclingPage = mainPage.clickUtilizationAndRecycling();
		CertyficateOfUtilization redirectToHomePage = utilizationAndRecyclingPage.clickCertyficate();
		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}

		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		redirectToHomePage.clickContact();

		assertEquals("Kontakt", verifyTitle());
	}

	@Test
	public void testClickingOrderAFreeCourierIcon() {
		UtilizationAndRecycling utilizationAndRecyclingPage = mainPage.clickUtilizationAndRecycling();
		CertyficateOfUtilization redirectToHomePage = utilizationAndRecyclingPage.clickCertyficate();
		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}

		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		redirectToHomePage.clickOrderAfreeCourierIcon();

		assertEquals("Zamów bezpłatnego kuriera", verifyTitle());
	}

	@Test
	public void testClickingBrandOwner() {
		UtilizationAndRecycling utilizationAndRecyclingPage = mainPage.clickUtilizationAndRecycling();
		CertyficateOfUtilization redirectToHomePage = utilizationAndRecyclingPage.clickCertyficate();
		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}

		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		redirectToHomePage.clickBrandOwner();

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
	public void testRedirectingToForumPage() {
		UtilizationAndRecycling utilizationAndRecyclingPage = mainPage.clickUtilizationAndRecycling();
		CertyficateOfUtilization redirectToHomePage = utilizationAndRecyclingPage.clickCertyficate();
		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}

		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		redirectToHomePage.clickAskOnTheForum();

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
