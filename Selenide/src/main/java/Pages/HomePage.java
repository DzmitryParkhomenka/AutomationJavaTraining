package Pages;

import org.openqa.selenium.By;

public class HomePage {
	private static final String HOME_PAGE_URL = "https://www.google.com";
	private static final By ENTER_EMAIL_BUTTON_LOCATOR = By.xpath("//a[@target='_top']");
	private static final By EMAIL_BUTTON_LOCATOR = By.xpath("(//a[@href='https://mail.google.com/mail/?tab=wm'])[1]");
	
	public static String getHomePageUrl() {
		return HOME_PAGE_URL;
	}
	
	public static By getEnterEmailButtonLocator() {
		return ENTER_EMAIL_BUTTON_LOCATOR;
	}
	
	public static By getEmailButtonLocator() {
		return EMAIL_BUTTON_LOCATOR;
	}
}
