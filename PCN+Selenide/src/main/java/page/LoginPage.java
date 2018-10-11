package page;

import org.openqa.selenium.By;
import com.codeborne.selenide.ex.ElementNotFound;
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
		try {
			$(LOGIN_FIELD).shouldBe(visible).sendKeys(User.getEmail());
		} catch (ElementNotFound e) {

		}
		clickNextButton();
	}

	public static void inputPasswordIntoField() {
		try {
			$(PASSWORD_FIELD).shouldBe(visible).sendKeys(User.getPassword());
		} catch (ElementNotFound e) {
			
		}
		clickSubmitButton();
	}

	public static void clickNextButton() {
		try {
			$(NEXT_BUTTON).shouldBe(visible).click();
		} catch (ElementNotFound e) {

		}
	}

	public static void clickSubmitButton() {
		try {
			$(SUBMIT_BUTTON).shouldBe(visible).click();
		} catch (ElementNotFound e) {

		}
	}

	public static void clickNoButton() {
		try {
			$(NO_BUTTON).shouldBe(visible).click();
		} catch (ElementNotFound e) {

		}
	}
}
