package com.seleniumtask;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestExtendedSearch extends SetUpClass {

	MainPage mainPage;

	@Before()
	public void testsSetUp() {
		initPhantomJSDriver("http://www.skuptelefonow.pl/");
		mainPage = new MainPage(driver);
	}

	@Test
	public void testExtendedSearchShouldReturnOneResultOnPage() {
		ExtendedSearch redirectToExtendedSearch = mainPage.clickButtonWhichRedirectsToExtendedSearch();
		redirectToExtendedSearch.typeWordsWhichWillBeUsedInSearchingFirstField("samsung galaxy j5");
		redirectToExtendedSearch.dropDownNot();
		redirectToExtendedSearch.typeWordsWhichWillBeUsedInSearchingSecondField("samsung galaxy j5 2016");
		redirectToExtendedSearch.dropDownAllCategories();
		redirectToExtendedSearch.dropDownAllInformationsAboutProducts();
		redirectToExtendedSearch.clickSearchButtonJ5();

		assertEquals("Cena skupu Samsung Galaxy J5", verifyTitle());
	}

	@Test
	public void testExtendedSearchShouldReturnTwoResultsOnPage() {
		ExtendedSearch redirectToExtendedSearch = mainPage.clickButtonWhichRedirectsToExtendedSearch();
		redirectToExtendedSearch.typeWordsWhichWillBeUsedInSearchingFirstField("samsung");
		redirectToExtendedSearch.dropDownAnd();
		redirectToExtendedSearch.typeWordsWhichWillBeUsedInSearchingSecondField("galaxy a3");
		redirectToExtendedSearch.dropDownNewProductsInTheBestPrice();
		redirectToExtendedSearch.dropDownAllInformationsAboutProducts();
		NewProductsInTheBestPrice newProducts = redirectToExtendedSearch.clickSearchButtonGalaxyA36A32017();

		assertEquals("*NOWOŚCI w najlepszej cenie", verifyTitle());
		assertTrue(driver.findElements(newProducts.getGalaxyA36()).size() > 0);
		assertTrue(driver.findElements(newProducts.getGalaxyA32017()).size() > 0);
	}

	@Test
	public void testChossingWrongCategoryShouldNotFindAnyPhones() {
		ExtendedSearch redirectToExtendedSearch = mainPage.clickButtonWhichRedirectsToExtendedSearch();
		redirectToExtendedSearch.typeWordsWhichWillBeUsedInSearchingFirstField("samsung");
		redirectToExtendedSearch.dropDownAnd();
		redirectToExtendedSearch.typeWordsWhichWillBeUsedInSearchingSecondField("j5");
		redirectToExtendedSearch.dropDownA3A5A7();
		redirectToExtendedSearch.dropDownAllInformationsAboutProducts();
		redirectToExtendedSearch.clickSearchButtonSamsungA3A5A7();

		assertEquals("A3 / A5 / A7", verifyTitle());
		assertTrue(driver.getPageSource().contains("Nie znaleziono elementów spełniających podane kryteria wyszukiwania."));
	}

	@After
	public void closingConnectionWithWebPage() {
		quitDriver();
	}
}
