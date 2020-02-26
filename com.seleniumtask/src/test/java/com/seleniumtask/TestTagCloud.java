package com.seleniumtask;

import static org.junit.Assert. * ;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class TestTagCloud extends SetUpClass {

	TagCloud tagCloud;

	@Before()
	public void testsSetUp() {
		initPhantomJSDriver("http://www.skuptelefonow.pl/");
		tagCloud = new TagCloud(driver);
	}

	@Test
	public void testHowToSellAPhoneInSkupTelefonowpl() {
		tagCloud.clickHowToSellAPhoneINSkupTelefonowpl();

		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}
		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		assertTrue(driver.getPageSource().contains("Znaleziono pozycji: 0."));
		assertEquals("Szukaj", verifyTitle());
	}

	@Test
	public void testNovaGsm() {
		tagCloud.clickNovagsm();

		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}

		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		assertTrue(driver.getPageSource().contains("Znaleziono pozycji: 16."));
		assertEquals("Szukaj", verifyTitle());
	}

	@Test
	public void testAboutUs() {
		tagCloud.clickAboutUs();

		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}
		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		assertTrue(driver.getPageSource().contains("Znaleziono pozycji: 50."));
		assertEquals("Szukaj", verifyTitle());
	}

	@Test
	public void testOffertForGsmShops() {
		tagCloud.clickOffertForGsmShops();

		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}
		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		assertTrue(driver.getPageSource().contains("Znaleziono pozycji: 0."));
		assertEquals("Szukaj", verifyTitle());
	}

	@Test
	public void testFranchiseOffer() {
		tagCloud.clickFranchiseOffer();

		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}
		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		assertTrue(driver.getPageSource().contains("Znaleziono pozycji: 0."));
		assertEquals("Szukaj", verifyTitle());
	}

	@Test
	public void testPlus() {
		tagCloud.clickPlus();

		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}

		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		assertTrue(driver.getPageSource().contains("Znaleziono pozycji: 5."));
		assertEquals("Szukaj", verifyTitle());
	}

	@Test
	public void testPartnershipProgram() {
		tagCloud.clickPartnershipProgram();

		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}
		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		assertTrue(driver.getPageSource().contains("Znaleziono pozycji: 4."));
		assertEquals("Szukaj", verifyTitle());
	}

	@Test
	public void testCommissionProgram() {
		tagCloud.clickCommissionProgram();

		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}
		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		assertTrue(driver.getPageSource().contains("Znaleziono pozycji: 2."));
		assertEquals("Szukaj", verifyTitle());
	}

	@Test
	public void testQuestionsAndAnswers() {
		tagCloud.clickQuestionsAndAnswers();

		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}
		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		assertTrue(driver.getPageSource().contains("Znaleziono pozycji: 0."));
		assertEquals("Szukaj", verifyTitle());
	}

	@Test
	public void testPurchaseFromIndividuals() {
		tagCloud.clickPurchaseFromindividuals();

		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}
		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		assertTrue(driver.getPageSource().contains("Znaleziono pozycji: 0."));
		assertEquals("Szukaj", verifyTitle());
	}

	@Test
	public void testPurchaseFromCompanies() {
		tagCloud.clickPurchaseFromCompanies();

		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}

		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		assertTrue(driver.getPageSource().contains("Znaleziono pozycji: 0."));
		assertEquals("Szukaj", verifyTitle());
	}

	@Test
	public void testTmobile() {
		tagCloud.clickTmobile();

		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}

		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		assertTrue(driver.getPageSource().contains("Znaleziono pozycji: 1."));
		assertEquals("Szukaj", verifyTitle());
	}

	@Test
	public void testPhonesPricing() {
		tagCloud.clickPhonesPricing();

		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}
		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		assertTrue(driver.getPageSource().contains("Znaleziono pozycji: 50."));
		assertEquals("Szukaj", verifyTitle());
	}

	@Test
	public void testCellPhonesPricing() {
		tagCloud.clickCellPhonesPricing();

		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}
		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		assertTrue(driver.getPageSource().contains("Znaleziono pozycji: 0."));
		assertEquals("Szukaj", verifyTitle());
	}

	@Test
	public void testSwappingPhones() {
		tagCloud.clickSwappingPhones();

		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}
		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		assertTrue(driver.getPageSource().contains("Znaleziono pozycji: 50."));
		assertEquals("Szukaj", verifyTitle());
	}

	@Test
	public void testSwappingCellPhones() {
		tagCloud.clickSwappingCellPhones();

		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}
		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		assertTrue(driver.getPageSource().contains("Znaleziono pozycji: 0."));
		assertEquals("Szukaj", verifyTitle());
	}

	@Test
	public void testWhoTrustedUs() {
		tagCloud.clickWhoTrustedUs();

		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}
		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		assertTrue(driver.getPageSource().contains("Znaleziono pozycji: 39."));
		assertEquals("Szukaj", verifyTitle());
	}

	@Test
	public void testGdynia() {
		tagCloud.clickGdynia();

		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}
		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		assertTrue(driver.getPageSource().contains("Znaleziono pozycji: 14."));
		assertEquals("Szukaj", verifyTitle());
	}

	@Test
	public void testPriceOfPhones() {
		tagCloud.clickPriceOfPhones();

		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}
		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		assertTrue(driver.getPageSource().contains("Znaleziono pozycji: 50."));
		assertEquals("Szukaj", verifyTitle());
	}

	@Test
	public void testContact() {
		tagCloud.clickContact();

		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}
		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		assertTrue(driver.getPageSource().contains("Znaleziono pozycji: 0."));
		assertEquals("Szukaj", verifyTitle());
	}

	@Test
	public void testRecyclingAndUtilization() {

		tagCloud.clickRecyclingAndUtilization();

		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}
		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		assertTrue(driver.getPageSource().contains("Znaleziono pozycji: 0."));
		assertEquals("Szukaj", verifyTitle());
	}

	@Test
	public void testRegulations() {
		tagCloud.clickRegulations();

		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}
		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		assertTrue(driver.getPageSource().contains("Znaleziono pozycji: 2."));
		assertEquals("Szukaj", verifyTitle());
	}

	@Test
	public void testPurchasePhones() {

		tagCloud.clickPurchasePhones();

		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}
		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		assertTrue(driver.getPageSource().contains("Znaleziono pozycji: 50."));
		assertEquals("Szukaj", verifyTitle());
	}

	@Test
	public void testPurchasePhonesFranchise() {

		tagCloud.clickPurchasePhonesFranchise();

		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}
		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		assertTrue(driver.getPageSource().contains("Znaleziono pozycji: 0."));
		assertEquals("Szukaj", verifyTitle());
	}

	@Test
	public void testPhones() {
		tagCloud.clickPhones();

		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}
		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		assertTrue(driver.getPageSource().contains("Znaleziono pozycji: 50."));
		assertEquals("Szukaj", verifyTitle());
	}

	@Test
	public void testPhonesFromOrange() {
		tagCloud.clickPhonesFromOrange();

		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}
		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		assertTrue(driver.getPageSource().contains("Znaleziono pozycji: 50."));
		assertEquals("Szukaj", verifyTitle());
	}

	@Test
	public void testTermsOfTheContract() {
		tagCloud.clickTermsOfTheContract();

		try {
			for (String windowHandle: driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle);
			}
		} catch(Exception e) {
			System.out.println("Unable to open a new window");
		}

		assertTrue(driver.getPageSource().contains("Znaleziono pozycji: 0."));
		assertEquals("Szukaj", verifyTitle());
	}

	@After
	public void closingConnectionWithWebPage() {
		quitDriver();
	}
}