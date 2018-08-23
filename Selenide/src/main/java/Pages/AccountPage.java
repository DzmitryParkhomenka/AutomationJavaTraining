package Pages;

import org.openqa.selenium.By;

public class AccountPage {
	private static final By EMAIL_FIELD_LOCATOR = By.xpath("//input[@type='email']");
	private static final By PASSWORD_FIELD_LOCATOR = By.xpath("//input[@type='password']");
	private static final By SUBMIT_EMAIL_BUTTON_LOCATOR = By.xpath("//div[@id='identifierNext']");
	private static final By SUBMIT_PASSWORD_BUTTON_LOCATOR = By.xpath("//div[@id='passwordNext']");

	public static By getEmailFieldLocator() {
		return EMAIL_FIELD_LOCATOR;
	}
	
	public static By getPasswordFieldLocator() {
		return PASSWORD_FIELD_LOCATOR;
	}
	
	public static By getSubmitEmailButtonLocator() {
		return SUBMIT_EMAIL_BUTTON_LOCATOR;
	}
	
	public static By getSubmitPasswordButtonLocator() {
		return SUBMIT_PASSWORD_BUTTON_LOCATOR;
	}
}
