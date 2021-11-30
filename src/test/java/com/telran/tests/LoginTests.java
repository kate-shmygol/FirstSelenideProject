package com.telran.tests;

import com.telran.pages.LoginPage;
import org.junit.Before;
import org.junit.Test;

public class LoginTests {

	LoginPage login; // declared

	@Before

	public void setUp() {
		login = new LoginPage(); // initialized
	}

	@Test
	public void loginPositiveTest() {
		login.with("krooos@gm.com", "Krooos12345~");
		login.validLogin();
	}

	@Test
	public void loginNegativeTest() {
		login.with("krooos@gm.com", "Krooos123");
		login.invalidLogin();
	}
}
