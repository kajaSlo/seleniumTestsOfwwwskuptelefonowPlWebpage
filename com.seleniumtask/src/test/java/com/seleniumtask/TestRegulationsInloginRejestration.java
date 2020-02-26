package com.seleniumtask;

import static org.junit.Assert. * ;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestRegulationsInloginRejestration extends SetUpClass {

	TopBarInTheHomePage topBar;

	@Before
	public void testsSetUp() {
		initPhantomJSDriver("http://www.skuptelefonow.pl/");
		topBar = new TopBarInTheHomePage(driver);
	}

	@Test
	public void testClickingRegulationsButton() {
		Earn redirectToEarn = topBar.clickEarn();
		LoginRejestration redirectToLoginRejestration = redirectToEarn.clickLoginRejestrationButton();
		RegulationsInLoginRejestration redirectToRegulationsInLoginRejestration = redirectToLoginRejestration.clickRegulations();
		redirectToRegulationsInLoginRejestration.clickRegulations();

		assertEquals("Program Partnerski dla SkupTelefonow.pl", verifyTitle());
		assertTrue(driver.getPageSource().contains("Regulamin"));
	}

	@Test
	public void testRedirectingToContactPage() {
		Earn redirectToEarn = topBar.clickEarn();
		LoginRejestration redirectToLoginRejestration = redirectToEarn.clickLoginRejestrationButton();
		RegulationsInLoginRejestration redirectToRegulationsInLoginRejestration = redirectToLoginRejestration.clickRegulations();
		redirectToRegulationsInLoginRejestration.clickContact();

		assertEquals("Program Partnerski dla SkupTelefonow.pl", verifyTitle());
		assertTrue(driver.getPageSource().contains("Kontakt"));
	}

	@After
	public void closingConnectionWithWebPage() {
		quitDriver();
	}
}
