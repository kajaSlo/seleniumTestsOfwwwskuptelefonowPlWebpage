package com.seleniumtask;

import static org.junit.Assert. * ;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

public class TestChoosingPhonesInMainPage extends SetUpClass {

	ChoosePhoneFromListInMainPage choosePhones;

	@Before()
	public void testsSetUp() {
		initPhantomJSDriver("http://www.skuptelefonow.pl/");
		choosePhones = new ChoosePhoneFromListInMainPage(driver);
	}

	@Test
	public void testSearchingForNewProducts() {
		choosePhones.searchForNewProductsInTheBestPrice();

		assertEquals("*NOWOŚCI w najlepszej cenie", verifyTitle());
	}

	@Test
	public void testSearchingForAlcatelIntablets() {
		AlcatelInTablets shouldReturnAlcatelOneTouchEVO7 = choosePhones.searchForAlcatelInTablets();

		assertEquals("Alcatel", verifyTitle());
		assertTrue(driver.findElements(shouldReturnAlcatelOneTouchEVO7.alcatelOneTouchEV07Icon()).size() > 0);
	}

	@Test
	public void testSearchingForAlcatelIdolMiniInAlcatel() {
		AlcatelIdolMiniInAlcatel shouldReturnAlcatelIdolMini = choosePhones.searchForAlcateIdolMiniInAlcatel();

		assertEquals("Idol Mini", verifyTitle());
		assertTrue(driver.findElements(shouldReturnAlcatelIdolMini.alcatelIdolMiniIcon()).size() > 0);
	}

	@Test
	public void testSerachingForAppleSEPhonesInApple() {
		IphonesSEInIphones shouldReturnAppleSEPhones = choosePhones.searchForAppleSEInApple();

		assertEquals("SE 16GB / SE 64GB", verifyTitle());
		assertTrue(driver.findElements(shouldReturnAppleSEPhones.iphonesSEIcons().get(0)).size() > 0);
		assertTrue(driver.findElements(shouldReturnAppleSEPhones.iphonesSEIcons().get(1)).size() > 0);
	}

	@Test
	public void testSearchingForBlackberryZ10InBlackberry() {
		BlackberryZ10InBlackberry shouldrReturnZ10InBlackberry = choosePhones.searchForBackBerryZ10InBlackBerry();

		assertEquals("Z10", verifyTitle());
		assertTrue(driver.findElements(shouldrReturnZ10InBlackberry.blackberryZ10Icon()).size() > 0);
	}

	@Test
	public void testSearchingForHtcA9InHtc() {
		HtcA9InHtc shouldReturnHtcA9InHtc = choosePhones.searchForHtcA9InHtc();

		assertEquals("A9", verifyTitle());
		assertTrue(driver.findElements(shouldReturnHtcA9InHtc.htcA9Icon()).size() > 0);
	}

	@Test
	public void testSerachingForAscendP6InHuawei() {
		AscendP6InHuawei shouldReturnAscendP6InHuawei = choosePhones.searchForAscendP6InHuawei();

		assertEquals("Ascend P6", verifyTitle());
		assertTrue(driver.findElements(shouldReturnAscendP6InHuawei.ascendP6Icon()).size() > 0);
	}

	@Test
	public void testSerchingForLGG5InLG() {
		LGG5InLG shouldReturnLGG5inLG = choosePhones.searchForLGG5InLG();

		assertEquals("G5", verifyTitle());
		assertTrue(driver.findElements(shouldReturnLGG5inLG.LGG5InLGIcon()).size() > 0);
	}

	@Test
	public void testSearchingForMotoGInMotorolaLenovo() {
		MotoGInMotorolaLenovo shouldReturnMotoGInMotorolaLenovo = choosePhones.searchForMotoGInMotorolaLenovo();

		assertEquals("Moto G", verifyTitle());
		assertTrue(driver.findElements(shouldReturnMotoGInMotorolaLenovo.motoGInMotorolaLenovoIcon()).size() > 0);
	}

	@Test
	public void testSearchingForLumia625InNokiaMicrosoft() {
		Lumia625InNokiaMicrosoft shouldReturnLumia625InNokiaMicrosoft = choosePhones.searchForLumia625InNokiaMicrosoft();

		assertEquals("Lumia 625", verifyTitle());
		assertTrue(driver.findElements(shouldReturnLumia625InNokiaMicrosoft.lumia625Icon()).size() > 0);
	}

	@Test
	public void testSearchingForSamsungGalaxyJ1InSamsung() {
		GalaxyJ1InSamsung shouldReturnGalaxyJ1InSamsung = choosePhones.searchForGalaxyJ1InSamsung();

		assertEquals("Galaxy J1", verifyTitle());
		assertTrue(driver.findElements(shouldReturnGalaxyJ1InSamsung.galaxyJ1Icon()).size() > 0);
	}

	@Test
	public void testSearchingForSonyXperiaEInSony() {
		XperiaEInSony shouldReturnSonyXperiaE = choosePhones.searchForXperiaEInSony();
		
		assertEquals("Xperia E", verifyTitle());
		assertTrue(driver.findElements(shouldReturnSonyXperiaE.xperiaEIcon()).size() > 0);
	}

	@After
	public void closingConnectionWithWebPage() {
		quitDriver();
	}
}
