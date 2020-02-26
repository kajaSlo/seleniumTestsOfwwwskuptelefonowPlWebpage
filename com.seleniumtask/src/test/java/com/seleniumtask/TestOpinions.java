package com.seleniumtask;

import static org.junit.Assert. * ;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class TestOpinions extends SetUpClass {

	MainPage mainPage;

	@Before()
	public void testsSetUp() {
		initPhantomJSDriver("http://www.skuptelefonow.pl/");
		mainPage = new MainPage(driver);
	}

	@Test
	public void testLoadingNewCode() {
		Opinions opinions = mainPage.clickButtonWhichRedirectsToOpinions();
		opinions.loadNewCode();
	}

	@Test
	public void testReset() {
		Opinions opinions = mainPage.clickButtonWhichRedirectsToOpinions();
		WebElement element = opinions.enterACode("98RX3A");
		opinions.reset();
		String textInsideInputField = element.getAttribute("value");

		assertEquals("", textInsideInputField);
	}

	@Test
	public void testSendingOpinion() {
		Opinions opinions = mainPage.clickButtonWhichRedirectsToOpinions();
		opinions.enterAName("name");
		opinions.enterEmail("email");
		opinions.enterACode("98RX3A");
		opinions.send();

		assertTrue(driver.getPageSource().contains("The Captcha code you have entered is wrong. Please, try it again"));
	}

	@Test
	public void testRedirectingToMainPage() {
		Opinions opinions = mainPage.clickButtonWhichRedirectsToOpinions();
		opinions.redirectToMainPage();

		assertEquals("*NOWOŚCI w najlepszej cenie", verifyTitle());
	}

	@After
	public void closingConnectionWithWebPage() {
		quitDriver();
	}
}
