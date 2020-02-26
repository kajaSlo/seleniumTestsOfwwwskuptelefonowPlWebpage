package com.seleniumtask;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.Set;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestSellingAproduct extends SetUpClass {

	MainPage mainPage;

	@Before
	public void testsSetUp() {
		initPhantomJSDriver("http://www.skuptelefonow.pl/");
		mainPage = new MainPage(driver);
	}

	@Test
	public void testClickingPrintWindow() {
		mainPage.searchForAProduct("iphone 4s");
		mainPage.clickSearchButton();
		mainPage.sortByPrice();
		SellIphone4s8GB redirectToSellIphone4s8GB = mainPage.clickSellButtonOnIphone4s8GB();
		String mainWindow = driver.getWindowHandle();
		redirectToSellIphone4s8GB.clickPrintIcon();
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
		mainPage.searchForAProduct("iphone 4s");
		mainPage.clickSearchButton();
		mainPage.sortByPrice();
		SellIphone4s8GB redirectToSellIphone4s8GB = mainPage.clickSellButtonOnIphone4s8GB();
		String mainWindow = driver.getWindowHandle();
		redirectToSellIphone4s8GB.clickEmailIcon();
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
	public void testSelectingUsedCondition() {
		Boolean checkingIfSelectingUsedConditionWorksFine = false;
		try {
			mainPage.searchForAProduct("iphone 4s");
			mainPage.clickSearchButton();
			mainPage.sortByPrice();
			SellIphone4s8GB redirectToSellIphone4s8GB = mainPage.clickSellButtonOnIphone4s8GB();
			redirectToSellIphone4s8GB.selectUsedCodition();
			checkingIfSelectingUsedConditionWorksFine = true;
		} catch(Exception e) {
			System.out.println("Something went wrong while selecting used condition");
		}

		assertTrue(checkingIfSelectingUsedConditionWorksFine);
	}

	@Test
	public void testIncreasingAndDecreasingQuantity() {
		Boolean checkingIfIncresingAndDecresingQuantityWorksFine = false;
		try {
			mainPage.searchForAProduct("iphone 4s");
			mainPage.clickSearchButton();
			mainPage.sortByPrice();
			SellIphone4s8GB redirectToSellIphone4s8GB = mainPage.clickSellButtonOnIphone4s8GB();
			redirectToSellIphone4s8GB.increaseTheQuantity();
			redirectToSellIphone4s8GB.decreaseTheQuantity();
			checkingIfIncresingAndDecresingQuantityWorksFine = true;
		} catch(Exception e) {
			System.out.println("Something went wrong while increasing and decreasing quantity");
		}
		assertTrue(checkingIfIncresingAndDecresingQuantityWorksFine);
	}

	@Test
	public void testClickingSellButton() {
		mainPage.searchForAProduct("iphone 4s");
		mainPage.clickSearchButton();
		mainPage.sortByPrice();
		SellIphone4s8GB redirectToSellIphone4s8GB = mainPage.clickSellButtonOnIphone4s8GB();
		redirectToSellIphone4s8GB.clickSellButton();

		assertEquals("Koszyk", driver.getTitle());
		assertTrue(driver.getPageSource().contains("Produkt został dodany do koszyka."));
	}

	@After
	public void closingConnectionWithWebPage() {
		quitDriver();
	}
}