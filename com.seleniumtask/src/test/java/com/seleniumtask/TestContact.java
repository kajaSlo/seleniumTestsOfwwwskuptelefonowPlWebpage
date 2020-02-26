package com.seleniumtask;

import static org.junit.Assert. * ;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestContact extends SetUpClass {

	TopBarInTheHomePage topBar;

	@Before()
	public void SetUp() {
		initPhantomJSDriver("http://www.skuptelefonow.pl/");
		topBar = new TopBarInTheHomePage(driver);
	}

	@Test
	public void testingSendingMessage() {
		Earn redirectToEarn = topBar.clickEarn();
		LoginRejestration redirectTologinRejestration = redirectToEarn.clickLoginRejestrationButton();
		Contact redirectToContact = redirectTologinRejestration.clickContact();
		redirectToContact.fillInEmail();
		redirectToContact.fillInTopic();
		redirectToContact.fillInMessage();
		redirectToContact.selectSendingACopyToASender();
		redirectToContact.clickSendButton();

		assertTrue(driver.getPageSource().contains("Podany email jest nieprawidłowy!"));
	}

	@After
	public void closingConnectionWithWebPage() {
		quitDriver();
	}
}
