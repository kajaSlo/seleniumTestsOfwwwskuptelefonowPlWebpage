package com.seleniumtask;

import static org.junit.Assert. * ;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestTopBarInTheHomePage extends SetUpClass {

	TopBarInTheHomePage topBar;

	@Before()
	public void testsSetUp() {
		initPhantomJSDriver("http://www.skuptelefonow.pl/");
		topBar = new TopBarInTheHomePage(driver);
	}

	@Test
	public void testRedirectingToPurchasePriceList() {
		topBar.clickPurchasePriceList();

		assertEquals("Przeglądaj", verifyTitle());
	}

	@Test
	public void testRedirectingToHowToSellPage() {
		topBar.clickHowToSell();

		assertEquals("Jak sprzedać telefon?", verifyTitle());
	}

	@Test
	public void testRedirectingToSaveShippingPage() {
		topBar.clickSafeShipping();

		assertEquals("Bezpieczna wysyłka", verifyTitle());
	}

	@Test
	public void testRedirectingToCooperationPage() {
		topBar.clickCooperation();

		assertEquals("Współpraca z naszym serwisem", verifyTitle());
	}

	@Test
	public void testRedirectingToUtilizationPage() {
		topBar.clickUtilization();

		assertEquals("404 - Błąd: 404", verifyTitle());//this page is not implemented yet
	}

	@Test
	public void testRedirectingToFAQPage() {
		topBar.clickFAQ();

		assertEquals("FAQ", verifyTitle());
	}

	@Test
	public void testRedirectingToPartnershipPage() {
		topBar.clickPartnership();

		assertEquals("Zostań naszym partnerem", verifyTitle());
	}

	@Test
	public void testRedirectingToEarnPage() {
		topBar.clickEarn();

		assertEquals("Zarabiaj z nami", verifyTitle());
	}

	@Test
	public void testRedirectingToContactPage() {
		topBar.clickContact();

		assertEquals("Kontakt", verifyTitle());
	}

	@After
	public void closingConnectionWithWebPage() {
		quitDriver();
	}
}
