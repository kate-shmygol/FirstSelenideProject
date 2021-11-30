package com.telran.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
	private By emailLokator = By.cssSelector("[placeholder='Email']");
	private By passwordLokator = By.cssSelector("[placeholder='Password']");
	private By loginButtonLokator = By.xpath("//button[contains(., 'Login')]");
	private By signOutTabLokator = By.xpath("//button[contains(.,'Sign Out')]");
	private By loginFailedTextLokator = By.cssSelector(".login_login__3EHKB > div");

	public LoginPage() {
		open("https://contacts-app.tobbymarshall815.vercel.app/login");
	}

	public void with(String email, String password) {
		$(emailLokator).val(email);
		$(passwordLokator).val(password);
		$(loginButtonLokator).click();
	}

	public void validLogin() {
		$(signOutTabLokator).shouldBe(Condition.visible); // in Selenide - Assert
	}

	public void invalidLogin() {
		confirm(); // in Selenide - click Ok on Alert message
		$(loginFailedTextLokator).shouldBe(Condition.visible);
	}
}
