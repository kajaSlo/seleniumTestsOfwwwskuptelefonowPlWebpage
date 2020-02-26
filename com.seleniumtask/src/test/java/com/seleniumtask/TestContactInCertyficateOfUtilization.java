package com.seleniumtask;

import static org.junit.Assert. * ;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TestContactInCertyficateOfUtilization extends SetUpClass {

	MainPage mainPage;

	@Before
	public void testsSetUp() {
		initPhantomJSDriver("http://www.skuptelefonow.pl/");
		mainPage = new MainPage(driver);
	}

	@Test
	public void testFillingOutContactForm() {
		UtilizationAndRecycling utilizationAndRecyclingPage = mainPage.clickUtilizationAndRecycling();
		CertyficateOfUtilization redirectToHomePage = utilizationAndRecyclingPage.clickCertyficate();
		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}
		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		ContactInCertyficateOfUtilization contact = redirectToHomePage.clickContact();

		contact.fillInName("name");
		contact.fillInEmail("email");
		contact.fillInTopic("topic");
		contact.fillInMessage("message");
		contact.clicksendACopyToYou();
		contact.clickSendAletter();

		assertTrue(driver.getPageSource().contains("Wyślij list. Wymagane jest wypełnienie wszystkich pól oznaczonych gwiazdką *"));
	}

	@After
	public void closingConnectionWithWebPage() {
		quitDriver();
	}
}
