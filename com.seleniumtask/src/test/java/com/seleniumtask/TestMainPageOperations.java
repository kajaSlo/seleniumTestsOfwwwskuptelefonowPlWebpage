package com.seleniumtask;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestMainPageOperations extends SetUpClass {

	MainPage mainPage;

	List <WebElement> iphones4s;

	@Before()
	public void testsSetUp() {
		initPhantomJSDriver("http://www.skuptelefonow.pl/");
		mainPage = new MainPage(driver);
	}

	@Test
	public void testSwitchingPages() {
		Boolean checkingIfSwitchingPagesWorksFine = false;
		try {
			mainPage.getNextPage();
			mainPage.getPreviousPage();
			mainPage.getEndPage();
			mainPage.getStartPage();
			mainPage.dropDown90ElementsOnPage();
			mainPage.dropDownByRecentlyAddedProducts();
			checkingIfSwitchingPagesWorksFine = true;
		} catch(Exception e) {
			System.out.println("Something went wrong while switching pages");
		}

		assertTrue(checkingIfSwitchingPagesWorksFine);
	}

	@Test
	public void testSearchingInvalidText() {
		mainPage.searchForAProduct("ssung");
		mainPage.clickSearchButton();

		assertTrue(driver.getPageSource().contains("Nie znaleziono elementów spełniających podane kryteria wyszukiwania."));
	}

	@Test
	public void testSearchingValidText() {
		mainPage.searchForAProduct("iphone 4s");
		mainPage.clickSearchButton();

		assertTrue(driver.findElements(mainPage.getIphone4s8GB()).size() > 0);
		assertTrue(driver.findElements(mainPage.getIphone4s16GB()).size() > 0);
		assertTrue(driver.findElements(mainPage.getIphone4s32GB()).size() > 0);
		assertTrue(driver.findElements(mainPage.getIphone4s64GB()).size() > 0);
	}

	private static boolean compare(List < WebElement > firstToCompare, List < WebElement > secondToCompare) {
		ArrayList < WebElement > tmpList = new ArrayList < >(firstToCompare);
		for (Object o: secondToCompare) {
			if (!tmpList.remove(o)) {
				return false;
			}
		}
		return tmpList.isEmpty();
	}

	@Test
	public void testSortingIphones4sByAscendingPrice() {
		mainPage.searchForAProduct("iphone 4s");
		mainPage.clickSearchButton();
		mainPage.sortByPrice();

		String a = mainPage.listOfIphone4sProducts().get(0).getText();

		Map <Integer,WebElement> phonesSortedByPrice = new TreeMap <>();
		List < WebElement > listOfPhonesSortedByprice = new ArrayList <>();
		//getting a substring od each element which is its price and sorting it to check if elements on the page were sorted properly by price
		for (int i = 0; i < mainPage.listOfIphone4sProducts().size(); ++i) {
			if (mainPage.listOfIphone4sProducts().get(i).getText().length() == 92) {
				phonesSortedByPrice.put(Integer.parseInt(mainPage.listOfIphone4sProducts().get(i).getText().substring(a.length() - 78, a.length() - 75)), mainPage.listOfIphone4sProducts().get(i));

			} else {
				phonesSortedByPrice.put(Integer.parseInt(mainPage.listOfIphone4sProducts().get(i).getText().substring(a.length() - 77, a.length() - 74)), mainPage.listOfIphone4sProducts().get(i));
			}
		}

		Iterator entries = phonesSortedByPrice.entrySet().iterator();
		while (entries.hasNext()) {
			Map.Entry entry = (Map.Entry) entries.next();
			Integer key = (Integer) entry.getKey();
			WebElement value = (WebElement) entry.getValue();
			listOfPhonesSortedByprice.add((WebElement) entry.getValue());
		}

		assertTrue(compare(mainPage.listOfIphone4sSortedAscendingByPrice(), listOfPhonesSortedByprice));
	}

	@Test
	public void testIfSellButtonRedirectsProperly() {
		mainPage.searchForAProduct("iphone 4s");
		mainPage.clickSearchButton();
		mainPage.sortByPrice();
		mainPage.clickSellButtonOnIphone4s8GB();

		assertEquals("Cena skupu iPhone 4S 8GB", verifyTitle());
	}

	@Test
	public void testIfExtendedSearchButtonRedirectsToExtendedSearchPage() {
		mainPage.clickButtonWhichRedirectsToExtendedSearch();

		assertEquals("Wyszukiwanie rozszerzone", driver.getTitle());
	}

	@Test
	public void testCickingPrintButton() {
		String mainWindow = driver.getWindowHandle();
		mainPage.clickPrintButton();
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
	public void testRedirectingToOpinionsPage() {
		mainPage.clickButtonWhichRedirectsToOpinions();

		assertEquals("Opinie", verifyTitle());
	}

	@Test
	public void testChoosingPodlaskieProvinceFromAMap() {
		mainPage.selectPodlaskieProvince();

		assertEquals("Podlaskie", verifyTitle());
		assertTrue(driver.getPageSource().contains("Dodaj swój salon do naszego katalogu!"));
	}

	@Test
	public void testChoosingKujawskoPomorskieProvinceFromAMap() {
		mainPage.selectKujawskoPomorskieProvince();

		assertEquals("Kujawsko-pomorskie", verifyTitle());
		assertTrue(driver.getPageSource().contains("adres: ul. Dworcowa 28 - obok Komputronika"));
	}

	@Test
	public void testRedirectionToBasketFromMainPage() {
		mainPage.selectBasketDirectlyFromMainPage();

		assertEquals("Koszyk", verifyTitle());
	}

	@Test
	public void testClickingCertyficationOfUtilizationIcon() {
		mainPage.clickCertyficationOfutilizationIcon();

		assertEquals("http://utylizacjatelefonow.pl/", driver.getCurrentUrl());
		assertTrue(driver.getPageSource().contains("utylizacja telefonów"));
	}

	@Test
	public void testClickingInvestInPhoneSellsicon() {
		mainPage.clickInvestInPhoneSells();

		assertEquals("404 - Błąd: 404", verifyTitle());
	}

	@Test
	public void testClickingPartnershipProgram() {
		mainPage.clickPartnershipProgram();

		assertEquals("Program Partnerski dla SkupTelefonow.pl", verifyTitle());
	}

	@Test
	public void testRedirectingToInformations() {
		mainPage.clickInformations();

		assertEquals("Wiadomości", verifyTitle());
	}

	@Test
	public void testRediretingToAboutUs() {
		mainPage.clickAboutUs();

		assertEquals("O nas", verifyTitle());
	}

	@Test
	public void testRedirectingToTrustedUs() {
		mainPage.clickTrustedUs();

		assertEquals("Zaufali nam", verifyTitle());
	}

	@Test
	public void testClickingPurchasePhonesFromCompanies() {
		mainPage.clickPurchasePhonesFromCompanies();

		assertEquals("Skup telefonów od firm", verifyTitle());
	}

	@Test
	public void testClickingPurchasePhonesFromPrivatePeople() {
		mainPage.clickPurchasePhonesFromPrivatePeople();

		assertEquals("Skup od osób prywatnych", verifyTitle());
	}

	@Test
	public void testClickingPhonesPricing() {
		mainPage.clickPhonespricing();

		assertEquals("Wycena telefonów", verifyTitle());
	}

	@Test
	public void testClickingUtilizationAndRecycling() {
		mainPage.clickUtilizationAndRecycling();

		assertEquals("Utylizacja i Recykling Telefonów", verifyTitle());
	}

	@Test
	public void testClickingPartnershipProgramInTheBottomOfThepage() {
		mainPage.clickPartnershipProgramOnTheBottomOfThePage();

		assertEquals("Program Partnerski dla SkupTelefonow.pl", verifyTitle());
	}

	@Test
	public void testClickingOpinionsOnTheBottomOfThePage() {
		mainPage.clickOpinionsOnTheBottomOgThePage();

		assertEquals("Opinie", verifyTitle());
	}

	@Test
	public void testClickingInvestOnTheBottomOfThePage() {
		mainPage.clickInvestOnTheBottomOfThePage();

		assertEquals("Inwestuj w SkupTelefonow.pl", verifyTitle());
	}

	@Test
	public void testClickingRegulations() {
		mainPage.clickRegulations();

		assertEquals("Regulamin", verifyTitle());
	}

	@After
	public void closingConnectionWithWebPage() {
		quitDriver();
	}
}