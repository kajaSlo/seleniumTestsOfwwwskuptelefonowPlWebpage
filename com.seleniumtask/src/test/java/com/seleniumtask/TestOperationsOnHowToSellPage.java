package com.seleniumtask;

import static org.junit.Assert.assertEquals;
import java.util.Iterator;
import java.util.Set;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestOperationsOnHowToSellPage extends SetUpClass {

	TopBarInTheHomePage topBar;

	@Before()
	public void testsSetUp() {
		initPhantomJSDriver("http://www.skuptelefonow.pl/");
		topBar = new TopBarInTheHomePage(driver);
	}

	@Test
	public void testClickingSafeShippingLinkInHowToSellPage() {
		HowToSell rediectToHowToSell = topBar.clickHowToSell();
		rediectToHowToSell.clickSafeShippingLinkInPurchasePriceList();
		Set <String> handles = driver.getWindowHandles();
		Iterator <String> iter = handles.iterator();

		while (iter.hasNext()) {
			String howToSellPage = iter.next();
			String safeShippingPage = iter.next();
			driver.switchTo().window(safeShippingPage);
		}

		assertEquals("Bezpieczna wysyłka", verifyTitle());
	}

	@Test
	public void testClickingHowWillIMakeSureThatIWillGetMoneyForAPhoneLinkInHowToSellPage() {
		HowToSell rediectToHowToSell = topBar.clickHowToSell();
		rediectToHowToSell.clickHowWillIMakeSureThatIWillGetMoneyForAPhone(); 

		assertEquals("Bezpieczna wysyłka", verifyTitle());
	}

	@Test
	public void testClickingGetAcquaintedWithRegulationsLinkInHowToSellPage() {
		HowToSell rediectToHowToSell = topBar.clickHowToSell();
		rediectToHowToSell.clickGetAcquaintedWithRegulations();
		
		assertEquals("Regulamin", verifyTitle());
	}

	@After
	public void closingConnectionWithWebPage() {
		quitDriver();
	}
}
