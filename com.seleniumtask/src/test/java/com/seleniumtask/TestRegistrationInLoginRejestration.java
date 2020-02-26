package com.seleniumtask;

import static org.junit.Assert. * ;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestRegistrationInLoginRejestration extends SetUpClass {

	TopBarInTheHomePage topBar;

	@Before()
	public void SetUp() {
		initPhantomJSDriver("http://www.skuptelefonow.pl/");
		topBar = new TopBarInTheHomePage(driver);
	}

	@Test
	public void testRegisteringAnAccountWrongCredentials() {
		Earn redirectToEarn = topBar.clickEarn();
		LoginRejestration redirectToLoginRejestration = redirectToEarn.clickLoginRejestrationButton();
		RejestrationInLoginRejestration redirectToRejestrationInLoginRejestration = redirectToLoginRejestration.clickRejestration();
		redirectToRejestrationInLoginRejestration.fillInLogin("login");
		redirectToRejestrationInLoginRejestration.fillInPassword("password");
		redirectToRejestrationInLoginRejestration.fillInConfirmPassword("password");
		redirectToRejestrationInLoginRejestration.fillInEmail("email");
		redirectToRejestrationInLoginRejestration.fillInConfirmEmail("email");
		redirectToRejestrationInLoginRejestration.fillInPhoneNumber("123456789");
		redirectToRejestrationInLoginRejestration.fillInName("name");
		redirectToRejestrationInLoginRejestration.fillInSurname("surname");
		redirectToRejestrationInLoginRejestration.selectProvince();
		redirectToRejestrationInLoginRejestration.fillInPostalCode("12-345");
		redirectToRejestrationInLoginRejestration.fillInTown("Kentburry");
		redirectToRejestrationInLoginRejestration.fillInStreet("RoemaryGardens");
		redirectToRejestrationInLoginRejestration.fillInHouseNumber("5");
		redirectToRejestrationInLoginRejestration.fillInApartmentNumber("6");
		redirectToRejestrationInLoginRejestration.fillInBankNumber("0000000000000000000000");
		redirectToRejestrationInLoginRejestration.fillInBankName("bank");
		redirectToRejestrationInLoginRejestration.clickAcceptanceOfTheRegulations();
		redirectToRejestrationInLoginRejestration.clickacceptanceOfProcessingPersonalData();
		redirectToRejestrationInLoginRejestration.clickrejestrationButton();

		assertTrue(driver.getPageSource().contains("Nieprawidłowy email!"));
	}

	@After
	public void closingConnectionWithWebPage() {
		quitDriver();
	}
}