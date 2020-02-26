package com.seleniumtask;

import static org.junit.Assert. * ;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCooperation extends SetUpClass {

	TopBarInTheHomePage topBar;

	@Before()
	public void testsSetUp() {
		initPhantomJSDriver("http://www.skuptelefonow.pl/");
		topBar = new TopBarInTheHomePage(driver);
	}

	@Test
	public void testIfClickingGoAndSeeRedirectsToProperPage() {
		Cooperation redirectToCooperation = topBar.clickCooperation();
		redirectToCooperation.clickGoAndSeeButton();
		
		assertEquals("Oferta dla komisów GSM", verifyTitle());
	}

	@After
	public void closingConnectionWithWebPage() {
		quitDriver();
	}
}
