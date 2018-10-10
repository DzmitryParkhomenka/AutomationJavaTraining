package page;

import org.openqa.selenium.By;

import bo.User;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
	private static final By LOGIN_FIELD = By.xpath("//input[@type='email']");
	private static final By PASSWORD_FIELD = By.xpath("//input[@placeholder='password']");
	private static final By NEXT_BUTTON = By.xpath("//input[@class='btn btn-block btn-primary']");
	private static final By SUBMIT_BUTTON = By.xpath("//span[@id='submitButton']");
	private static final By NO_BUTTON = By.xpath("//input[@id='idBtn_Back']");

	public static void inputEmailIntoField() {
		if ($(LOGIN_FIELD).is(visible)) {
			$(LOGIN_FIELD).sendKeys(User.getEmail());
		}
	}

	public static void inputPasswordIntoField() {
		if ($(PASSWORD_FIELD).is(visible)) {
			$(PASSWORD_FIELD).sendKeys(User.getPassword());
		}
	}

	public static void clickNextButton() {
		if ($(NEXT_BUTTON).is(visible)) {
			$(NEXT_BUTTON).click();
		}
	}

	public static void clickSubmitButton() {
		if ($(SUBMIT_BUTTON).is(visible)) {
			$(SUBMIT_BUTTON).click();
		}
	}

	public static void clickNoButton() {
		if ($(NO_BUTTON).is(visible)) {
			$(NO_BUTTON).click();
		}
	}
}
