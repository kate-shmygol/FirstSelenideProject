package com.telran.tests;

import com.telran.pages.LoginPage;
import org.junit.Before;
import org.junit.Test;

public class LoginTests {

	LoginPage login; // declared class 'LoginPage', connected LoginTests' with 'LoginPage'

	@Before

	public void setUp() {
		login = new LoginPage(); // initialized class 'LoginPage'
	}

	@Test
	public void loginPositiveTest() {
		login.with("krooos@gm.com", "Krooos12345~"); // in every test refer to class 'LoginPage'
		login.validLogin();
	}

	@Test
	public void loginNegativeTest() {
		login.with("krooos@gm.com", "Krooos123");
		login.invalidLogin();
	}
}
