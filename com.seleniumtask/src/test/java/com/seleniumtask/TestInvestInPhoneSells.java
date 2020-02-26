package com.seleniumtask;

import static org.junit.Assert. * ;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestInvestInPhoneSells extends SetUpClass {

	MainPage mainPage;

	@Before()
	public void SetUp() {
		initPhantomJSDriver("http://www.skuptelefonow.pl/");
		mainPage = new MainPage(driver);
	}

	@Test
	public void testRedirectingTomainPage() {
		InvestInPhoneSellsPageNotImplemented clickInvestInphoneSellsIcon = mainPage.clickInvestInPhoneSells();
		clickInvestInphoneSellsIcon.clickRedirectToMainPageButton();
		
		assertEquals(verifyTitle(), "*NOWOŚCI w najlepszej cenie");
	}

	@After
	public void closingConnectionWithWebPage() {
		quitDriver();
	}
}
