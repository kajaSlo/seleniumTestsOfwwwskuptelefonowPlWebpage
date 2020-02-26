package com.seleniumtask;

import static org.junit.Assert. * ;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestUtilizationClass extends SetUpClass {

	TopBarInTheHomePage topBar;

	@Before()
	public void testsSetUp() {
		initPhantomJSDriver("http://www.skuptelefonow.pl/");
		topBar = new TopBarInTheHomePage(driver);
	}

	@Test
	public void testFindingIfButtonGoToMainMageIn404PageWorksCorrectly() {
		Utilization shouldReturn404Page = topBar.clickUtilization();
		shouldReturn404Page.clickBackToHomePageButton();
		
		assertEquals("*NOWOŚCI w najlepszej cenie", verifyTitle());
	}

	@After
	public void closingConnectionWithWebPage() {
		quitDriver();
	}
}
