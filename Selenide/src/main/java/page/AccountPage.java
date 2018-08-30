package page;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

import businessObject.User;

public class AccountPage {
	private static final By EMAIL_FIELD_LOCATOR = By.xpath("//input[@type='email']");
	private static final By PASSWORD_FIELD_LOCATOR = By.xpath("//input[@type='password']");
	private static final By SUBMIT_EMAIL_BUTTON_LOCATOR = By.xpath("//div[@id='identifierNext']");
	private static final By SUBMIT_PASSWORD_BUTTON_LOCATOR = By.xpath("//div[@id='passwordNext']");
	
	public static void setValueToEmailField() {
		$(EMAIL_FIELD_LOCATOR).setValue(User.getLogin());
	}
	
	public static void clickSubmitEmailButton() {
		$(SUBMIT_EMAIL_BUTTON_LOCATOR).click();
	}
	
	public static void setValueToPasswordField() {
		$(PASSWORD_FIELD_LOCATOR).setValue(User.getPassword());
	}
	
	public static void clickSubmitPasswordButton() {
		$(SUBMIT_PASSWORD_BUTTON_LOCATOR).click();
	}
	
	public static void checkPasswordFieldVisible() {
		$(PASSWORD_FIELD_LOCATOR).shouldBe(visible);
	}
}
