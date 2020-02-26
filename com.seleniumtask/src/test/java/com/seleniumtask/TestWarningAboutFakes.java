package com.seleniumtask;

import static org.junit.Assert.assertTrue;
import java.util.Iterator;
import java.util.Set;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestWarningAboutFakes extends SetUpClass {

	MainPage mainPage;

	@Before
	public void testsSetUp() {
		initPhantomJSDriver("http://www.skuptelefonow.pl/");
		mainPage = new MainPage(driver);
	}

	@Test
	public void testClickingPdfIcon() {
		Informations informationsPage = mainPage.clickInformations();
		WarningAboutFakes redirectToWarningAboutFakesPage = informationsPage.clickMoreIconWhichRedirectsToWarningAboutFakesPage();
		String mainWindow = driver.getWindowHandle();
		redirectToWarningAboutFakesPage.clickPdfIcon();
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
	public void testClickingPrintIcon() {
		Informations informationsPage = mainPage.clickInformations();
		WarningAboutFakes redirectToWarningAboutFakesPage = informationsPage.clickMoreIconWhichRedirectsToWarningAboutFakesPage();
		String mainWindow = driver.getWindowHandle();
		redirectToWarningAboutFakesPage.clickPrintIcon();
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
	public void testClickingEmailIcon() {
		Informations informationsPage = mainPage.clickInformations();
		WarningAboutFakes redirectToWarningAboutFakesPage = informationsPage.clickMoreIconWhichRedirectsToWarningAboutFakesPage();
		String mainWindow = driver.getWindowHandle();
		redirectToWarningAboutFakesPage.clickEmailIcon();
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