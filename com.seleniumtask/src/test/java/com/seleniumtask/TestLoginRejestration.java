package com.seleniumtask;

import static org.junit.Assert. * ;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestLoginRejestration extends SetUpClass {

	TopBarInTheHomePage topBar;
	LoginRejestration loginRejestration;
	RejestrationInLoginRejestration rejestrationInLoginRejestration;
	Contact contactInLoginRejestration;
	RegulationsInLoginRejestration regulationsInLoginRejestration;

	@Before()
	public void SetUp() {
		initPhantomJSDriver("http://www.skuptelefonow.pl/");
		topBar = new TopBarInTheHomePage(driver);
	}

	@Test
	public void testRedirectingToRegulationsPage() {
		Earn redirectToEarn = topBar.clickEarn();
		LoginRejestration redirectToLoginRejestration = redirectToEarn.clickLoginRejestrationButton();
		regulationsInLoginRejestration = redirectToLoginRejestration.clickRegulations();

		assertEquals("Program Partnerski dla SkupTelefonow.pl", verifyTitle());
		assertTrue(driver.getPageSource().contains("Regulamin"));
	}

	@Test
	public void testRedirectingToContactPage() {
		Earn redirectToEarn = topBar.clickEarn();
		LoginRejestration redirectToLoginRejestration = redirectToEarn.clickLoginRejestrationButton();
		contactInLoginRejestration = redirectToLoginRejestration.clickContact();

		assertEquals("Program Partnerski dla SkupTelefonow.pl", verifyTitle());
		assertTrue(driver.getPageSource().contains("Kontakt"));
	}

	@Test
	public void testSendingInquiry() {
		Earn redirectToEarn = topBar.clickEarn();
		LoginRejestration redirectToLoginRejestration = redirectToEarn.clickLoginRejestrationButton();
		redirectToLoginRejestration.fillInTextIntoLoginInputField("login");
		redirectToLoginRejestration.fillInTextIntoPasswordInputField("password");
		redirectToLoginRejestration.clickSendInquiry();

		assertTrue(driver.getPageSource().contains("Podany login i/lub hasło jest nieprawidłowe!"));
	}

	@Test
	public void testRedirectingToRejestrationPage() {
		Earn redirectToEarn = topBar.clickEarn();
		LoginRejestration redirectToLoginRejestration = redirectToEarn.clickLoginRejestrationButton();
		rejestrationInLoginRejestration = redirectToLoginRejestration.clickRejestration();

		assertTrue(driver.getPageSource().contains("Rejestracja nowego konta."));
	}

	@After
	public void closingConnectionWithWebPage() {
		quitDriver();
	}
}
