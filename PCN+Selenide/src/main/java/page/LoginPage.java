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
		$(LOGIN_FIELD).shouldBe(visible).sendKeys(User.getEmail());
	}

	public static void inputPasswordIntoField() {
		$(PASSWORD_FIELD).shouldBe(visible).sendKeys(User.getPassword());
	}
	
	public static void clickNextButton() {
		$(NEXT_BUTTON).shouldBe(visible).click();
	}
	
	public static void clickSubmitButton() {
		$(SUBMIT_BUTTON).shouldBe(visible).click();
	}
	
	public static void clickNoButton() {
		$(NO_BUTTON).shouldBe(visible).click();
	}
}
