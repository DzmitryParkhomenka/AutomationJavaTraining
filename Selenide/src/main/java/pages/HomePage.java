package pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import org.openqa.selenium.By;

public class HomePage {
	private static final String HOME_PAGE_URL = "https://www.google.com";
	private static final By ENTER_EMAIL_BUTTON_LOCATOR = By.xpath("//a[@target='_top']");
	private static final By EMAIL_BUTTON_LOCATOR = By.xpath("(//a[@href='https://mail.google.com/mail/?tab=wm'])[1]");
		
	public static void openUrl() {
		open(HOME_PAGE_URL);
	}
	
	public static void clickEnterEmailButton() {
		$(ENTER_EMAIL_BUTTON_LOCATOR).click();
	}
	
	public static void clickEmailButton() {
		$(EMAIL_BUTTON_LOCATOR).click();
	}
}
