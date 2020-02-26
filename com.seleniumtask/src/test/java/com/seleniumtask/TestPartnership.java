package com.seleniumtask;

import static org.junit.Assert.assertTrue;
import java.util.Set;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestPartnership extends SetUpClass {

	TopBarInTheHomePage topBar;

	@Before()
	public void testsSetUp() {
		initPhantomJSDriver("http://www.skuptelefonow.pl/");
		topBar = new TopBarInTheHomePage(driver);
	}

	@Test
	public void testClickingPdfIcon() {
		Partnership redirectToPartnership = topBar.clickPartnership();
		String mainWindow = driver.getWindowHandle();
		redirectToPartnership.clickPdfIcon();
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
		Partnership redirectToPartnership = topBar.clickPartnership();
		String mainWindow = driver.getWindowHandle();
		redirectToPartnership.clickPrintIcon();
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
	public void testClickingSendAnEmailIcon() {
		Partnership redirectToPartnership = topBar.clickPartnership();
		String mainWindow = driver.getWindowHandle();
		redirectToPartnership.clickSendAnEmailIcon();
		Boolean checkingIfPopUpHasShown = false;
		String sendAnEmailWindow = driver.getWindowHandle();
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

		handles.remove(sendAnEmailWindow);
		driver.switchTo().window(mainWindow);

		assertTrue(checkingIfPopUpHasShown);
	}

	@After
	public void closingConnectionWithWebPage() {
		quitDriver();
	}
}