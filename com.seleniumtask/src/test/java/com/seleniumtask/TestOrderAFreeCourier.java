package com.seleniumtask;

import static org.junit.Assert. * ;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TestOrderAFreeCourier extends SetUpClass {

	MainPage mainPage;

	@Before
	public void testsSetUp() {
		initPhantomJSDriver("http://www.skuptelefonow.pl/");
		mainPage = new MainPage(driver);
	}

	@Test
	public void testOrderingAFreeCourier() {
		UtilizationAndRecycling utilizationAndRecyclingPage = mainPage.clickUtilizationAndRecycling();
		CertyficateOfUtilization redirectToHomePage = utilizationAndRecyclingPage.clickCertyficate();

		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}
		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		OrderAFreeCourier courier = redirectToHomePage.clickOrderAFreeCourierIntopBar();
		try {
			driver.switchTo().frame(driver.findElement(By.id("blockrandom")));
			courier.fillInAddressInputField("address");
			courier.fillInNameAndSurnameInputField("nameAndSurname");
			courier.fillInEmailInputField("email");
			courier.fillInPhoneInputField("0000");
			courier.clickPrefferedhourOfContact1014();
			courier.clickIOrderAFreeCourier();
		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		assertTrue(driver.getPageSource().contains("Błędny email"));
	}

	@Test
	public void testClickingUtilizationOfPhonesIconWhichRedirectsTohomePage() {
		UtilizationAndRecycling utilizationAndRecyclingPage = mainPage.clickUtilizationAndRecycling();
		CertyficateOfUtilization redirectToHomePage = utilizationAndRecyclingPage.clickCertyficate();

		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}
		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}
		OrderAFreeCourier courier = redirectToHomePage.clickOrderAFreeCourierIntopBar();
		courier.clickUtilizationOfPhonesIcon();

		assertEquals("Home", verifyTitle());
	}

	@Test
	public void testClickingHomeInTopBar() {
		UtilizationAndRecycling utilizationAndRecyclingPage = mainPage.clickUtilizationAndRecycling();
		CertyficateOfUtilization redirectToHomePage = utilizationAndRecyclingPage.clickCertyficate();

		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}
		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		OrderAFreeCourier courier = redirectToHomePage.clickOrderAFreeCourierIntopBar();
		courier.clickHomeInTopBar();

		assertEquals("Home", verifyTitle());
	}

	@After
	public void closingConnectionWithWebPage() {
		quitDriver();
	}
}