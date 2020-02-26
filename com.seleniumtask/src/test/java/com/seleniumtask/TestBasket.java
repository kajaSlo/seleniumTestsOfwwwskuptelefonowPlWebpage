package com.seleniumtask;

import static org.junit.Assert. * ;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestBasket extends SetUpClass {

	MainPage mainPage;

	@Before
	public void testsSetUp() {
		initPhantomJSDriver("http://www.skuptelefonow.pl/");
		mainPage = new MainPage(driver);
	}

	@Test
	public void testUpdatingQuantityOfProducts() {
		mainPage.searchForAProduct("iphone 4s");
		mainPage.clickSearchButton();
		mainPage.sortByPrice();
		SellIphone4s8GB redirectToSellIphone4s8GB = mainPage.clickSellButtonOnIphone4s8GB();
		Basket redirectTobasket = redirectToSellIphone4s8GB.clickSellButton();
		redirectTobasket.updateQuantityOfProducts();

		assertEquals("Koszyk", verifyTitle());
	}

	@Test
	public void testAddingAPhoneToABasket() {
		mainPage.searchForAProduct("iphone 4s");
		mainPage.clickSearchButton();
		mainPage.sortByPrice();
		SellIphone4s8GB redirectToSellIphone4s8GB = mainPage.clickSellButtonOnIphone4s8GB();
		redirectToSellIphone4s8GB.clickSellButton();

		assertTrue(driver.getPageSource().contains("Produkt został dodany do koszyka."));
	}

	@Test
	public void testAddingNewPhone() {
		mainPage.searchForAProduct("iphone 4s");
		mainPage.clickSearchButton();
		mainPage.sortByPrice();
		SellIphone4s8GB redirectToSellIphone4s8GB = mainPage.clickSellButtonOnIphone4s8GB();
		Basket redirectTobasket = redirectToSellIphone4s8GB.clickSellButton();
		redirectTobasket.addAPhone(); 

		assertEquals("Apple", verifyTitle());
	}

	@Test
	public void testMakingAnOrder() {
		mainPage.searchForAProduct("iphone 4s");
		mainPage.clickSearchButton();
		mainPage.sortByPrice();
		SellIphone4s8GB redirectToSellIphone4s8GB = mainPage.clickSellButtonOnIphone4s8GB();
		Basket redirectTobasket = redirectToSellIphone4s8GB.clickSellButton();
		redirectTobasket.makeAnOrder();

		assertEquals("Najbardziej pożądane - SkupTelefonow.pl", verifyTitle());
	}
	
	@Test
	public void testDeletingFromABasket() {
		mainPage.searchForAProduct("iphone 4s");
		mainPage.clickSearchButton();
		mainPage.sortByPrice();
		SellIphone4s8GB redirectToSellIphone4s8GB = mainPage.clickSellButtonOnIphone4s8GB();
		Basket redirectTobasket = redirectToSellIphone4s8GB.clickSellButton();
		redirectTobasket.deleteProductFromABasket();

		assertTrue(driver.getPageSource().contains("Twój koszyk jest pusty."));
		assertEquals("Koszyk", verifyTitle());
	}

	@After
	public void closingConnectionWithWebPage() {
		quitDriver();
	}
}
