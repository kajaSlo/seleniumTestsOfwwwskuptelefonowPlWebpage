package com.seleniumtask;

import static org.junit.Assert. * ;
import java.util.Set;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestInformations extends SetUpClass {

	MainPage mainPage;

	@Before
	public void testsSetUp() {
		initPhantomJSDriver("http://www.skuptelefonow.pl/");
		mainPage = new MainPage(driver);
	}

	@Test
	public void testClickingPdfIcon() {
		Informations informationsPage = mainPage.clickInformations();
		String mainWindow = driver.getWindowHandle();
		informationsPage.clickPdfIcon();
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
		String mainWindow = driver.getWindowHandle();
		informationsPage.clickPrintIcon();
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
		String mainWindow = driver.getWindowHandle();
		informationsPage.clickEmailIcon();
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

	@Test
	public void testClickingPdfWithWarningAboutFakesIcon() {
		Informations informationsPage = mainPage.clickInformations();
		String mainWindow = driver.getWindowHandle();
		informationsPage.clickPdfWithWarningAboutFakesIcon();
		Boolean checkingIfPopUpHasShown = false;
		String pdfWithWarningAboutFakesWindow = driver.getWindowHandle();
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
		handles.remove(pdfWithWarningAboutFakesWindow);
		driver.switchTo().window(mainWindow);

		assertTrue(checkingIfPopUpHasShown);
	}

	@Test
	public void testClickingEmailWithWarningAboutFakesIcon() {
		Informations informationsPage = mainPage.clickInformations();
		String mainWindow = driver.getWindowHandle();
		informationsPage.clickEmailWithWarningAboutFakesIcon();
		Boolean checkingIfPopUpHasShown = false;
		String emailWithWarningAboutFakesWindow = driver.getWindowHandle();
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

		handles.remove(emailWithWarningAboutFakesWindow);
		driver.switchTo().window(mainWindow);

		assertTrue(checkingIfPopUpHasShown);
	}

	@Test
	public void testClickingPrintWithWarningAboutFakesIcon() {
		Informations informationsPage = mainPage.clickInformations();
		String mainWindow = driver.getWindowHandle();
		informationsPage.clickPrintWithWarningAboutFakesIcon();
		Boolean checkingIfPopUpHasShown = false;
		String printWithWarningAboutFakesWindow = driver.getWindowHandle();
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
		handles.remove(printWithWarningAboutFakesWindow);
		driver.switchTo().window(mainWindow);

		assertTrue(checkingIfPopUpHasShown);
	}

	@Test
	public void testRedirectingToWarningAboutFakesPage() {
		Informations informationsPage = mainPage.clickInformations();
		informationsPage.clickMoreIconWhichRedirectsToWarningAboutFakesPage();

		assertEquals("Uwaga na podróbki SkupTelefonow.pl", verifyTitle());
	}

	@After
	public void closingConnectionWithWebPage() {
		quitDriver();
	}
}
