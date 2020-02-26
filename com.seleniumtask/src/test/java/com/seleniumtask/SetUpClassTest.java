package com.seleniumtask;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class SetUpClassTest extends SetUpClass {

	@Before()
	public void testsSetUp() {
		initPhantomJSDriver("http://www.skuptelefonow.pl/");
	}

	@Test
	public void testSetUpClass() {
		assertEquals(verifyTitle(), "*NOWOŚCI w najlepszej cenie");
	}

	@After
	public void closingConnectionWithWebPage() {
		quitDriver();
	}
}