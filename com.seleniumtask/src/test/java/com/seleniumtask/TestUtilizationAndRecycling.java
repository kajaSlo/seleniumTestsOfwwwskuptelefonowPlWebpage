package com.seleniumtask;

import static org.junit.Assert. * ;
import java.util.Set;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestUtilizationAndRecycling extends SetUpClass {

	MainPage mainPage;

	@Before
	public void testsSetUp() {
		initPhantomJSDriver("http://www.skuptelefonow.pl/");
		mainPage = new MainPage(driver);

	}

	@Test
	public void testClickingPdfIcon() {
		UtilizationAndRecycling utilizationAndRecyclingPage = mainPage.clickUtilizationAndRecycling();
		String mainWindow = driver.getWindowHandle();
		utilizationAndRecyclingPage.clickPdfIcon();
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
		UtilizationAndRecycling utilizationAndRecyclingPage = mainPage.clickUtilizationAndRecycling();
		String mainWindow = driver.getWindowHandle();
		utilizationAndRecyclingPage.clickPrintIcon();
		Boolean checkingIfPopUpHasShown = false;
		String printWindow = driver.getWindowHandle();
		Set < String > handles = driver.getWindowHandles();

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
		UtilizationAndRecycling utilizationAndRecyclingPage = mainPage.clickUtilizationAndRecycling();
		String mainWindow = driver.getWindowHandle();
		utilizationAndRecyclingPage.clickEmailIcon();
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
	public void testRedirectingTorderAFreeCourierPage() {
		UtilizationAndRecycling utilizationAndRecyclingPage = mainPage.clickUtilizationAndRecycling();
		utilizationAndRecyclingPage.clickOrderAFreeCourier();

		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}
		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		assertEquals("Zamów bezpłatnego kuriera", verifyTitle());
	}

	@Test
	public void testRedirectingToCertyficateOfutilizationPage() {
		UtilizationAndRecycling utilizationAndRecyclingPage = mainPage.clickUtilizationAndRecycling();
		utilizationAndRecyclingPage.clickCertyficate();

		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}
		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		assertEquals("Home", verifyTitle());
	}

	@After
	public void closingConnectionWithWebPage() {
		quitDriver();
	}
}