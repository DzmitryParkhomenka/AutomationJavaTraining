package pages;

import org.openqa.selenium.By;

public class LoggedIconPopUp {
	private static final By EXIT_BUTTON_LOCTOR = By.xpath("//*[@id='gb_71']");
	private static final By EMAIL_LOGGED_ICON_INSIDE_EMAIL_LOCATOR = By.xpath("//*[@id='gb']/div[2]/div[3]/div/div[2]/div/a");

	public static By getExitButtonLocator() {
		return EXIT_BUTTON_LOCTOR;
	}
	
	public static By getEmailLoggedLocator() {
		return EMAIL_LOGGED_ICON_INSIDE_EMAIL_LOCATOR;
	}
}
