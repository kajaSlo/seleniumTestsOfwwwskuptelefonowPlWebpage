package com.seleniumtask;

import static org.junit.Assert. * ;
import java.util.Set;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TestEarn extends SetUpClass {

	TopBarInTheHomePage topBar;

	@Before()
	public void testsSetUp() {
		initPhantomJSDriver("http://www.skuptelefonow.pl/");
		topBar = new TopBarInTheHomePage(driver);
	}

	@Test
	public void testIfLoginRejestrationButtonRedirectsProperly() {
		Earn redirectToEarn = topBar.clickEarn();
		redirectToEarn.clickLoginRejestrationButton();

		assertEquals("Program Partnerski dla SkupTelefonow.pl", verifyTitle());
	}

	@Test
	public void testIfProgramSkupTelefonowPlButtonRedirectsProperly() {
		Earn redirectToEarn = topBar.clickEarn();
		redirectToEarn.clickProgramSkupTelefonowPl();

		assertEquals("Program Partnerski dla SkupTelefonow.pl", verifyTitle());
	}

	@Test
	public void testIfCreateAnAccountButtonRedirectsProperly() {
		Earn redirectToEarn = topBar.clickEarn();
		redirectToEarn.clickCreateAnAccount();

		assertEquals("Program Partnerski dla SkupTelefonow.pl", verifyTitle());
	}

	@Test
	public void testIfLoginRejestrationProgramSkupTelegonowPlButtonRedirectsProperly() {
		Earn redirectToEarn = topBar.clickEarn();
		redirectToEarn.clickLoginRejestrationProgramSkupTelefonowPl();

		assertEquals("Program Partnerski dla SkupTelefonow.pl", verifyTitle());
	}

	@Test
	public void testClickingPdfButton() {
		Earn redirectToEarn = topBar.clickEarn();
		String mainWindow = driver.getWindowHandle();
		redirectToEarn.clickPdfButton();
		Boolean checkingIfPopUpHasShown = false;
		String pdfWindow = driver.getWindowHandle();

		Set <String> handles = driver.getWindowHandles();

		try {
			for (String handle: handles) {
				if (!handle.equals(mainWindow)) {
					checkingIfPopUpHasShown = true;
				}
			}
		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		handles.remove(pdfWindow);
		driver.switchTo().window(mainWindow);

		assertTrue(checkingIfPopUpHasShown);
	}

	@Test
	public void testClickingPrintButton() {
		Earn redirectToEarn = topBar.clickEarn();
		String mainWindow = driver.getWindowHandle();
		redirectToEarn.clickPrintButton();
		Boolean checkingIfPopUpHasShown = false;
		String printWindow = driver.getWindowHandle();

		Set <String> handles = driver.getWindowHandles();

		try {
			for (String handle: handles) {
				if (!handle.equals(mainWindow)) {
					checkingIfPopUpHasShown = true;
				}
			}
		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		handles.remove(printWindow);
		driver.switchTo().window(mainWindow);

		assertTrue(checkingIfPopUpHasShown);
	}

	@Test
	public void testClickingEmailButton() {

		Earn redirectToEarn = topBar.clickEarn();
		String mainWindow = driver.getWindowHandle();
		redirectToEarn.clickEmailButton();
		Boolean checkingIfPopUpHasShown = false;
		String emailWindow = driver.getWindowHandle();

		Set <String> handles = driver.getWindowHandles();

		try {
			for (String handle: handles) {
				if (!handle.equals(mainWindow)) {
					checkingIfPopUpHasShown = true;
				}
			}
		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		handles.remove(emailWindow);
		driver.switchTo().window(mainWindow);

		assertTrue(checkingIfPopUpHasShown);
	}

	@After
	public void closingConnectionWithWebPage() {
		quitDriver();
	}
}