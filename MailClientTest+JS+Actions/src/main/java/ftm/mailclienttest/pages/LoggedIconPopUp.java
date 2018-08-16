package ftm.mailclienttest.pages;

import org.openqa.selenium.By;

import ftm.mailclienttest.screenshoter.Screenshoter;

public class LoggedIconPopUp extends AbstractPage{
	private static final By EXIT_BUTTON_LOCTOR = By.xpath("//*[@id='gb_71']");
	private static final By EMAIL_LOGGED_ICON_INSIDE_EMAIL_LOCATOR = By.xpath("//*[@id='gb']/div[1]/div[1]/div/div[5]/div[1]/a");
	
	public LoggedIconPopUp() {
		super();
	}
	
	public void clickIconInsideEmail() {
		waitForElementVisible(EMAIL_LOGGED_ICON_INSIDE_EMAIL_LOCATOR);
		highlightElement(EMAIL_LOGGED_ICON_INSIDE_EMAIL_LOCATOR);
		Screenshoter.takeScreenshot();
		driver.findElement(EMAIL_LOGGED_ICON_INSIDE_EMAIL_LOCATOR).click();
	}
	
	public void clickExitButton() {
		waitForElementVisible(EXIT_BUTTON_LOCTOR);
		highlightElement(EXIT_BUTTON_LOCTOR);
		Screenshoter.takeScreenshot();
		driver.findElement(EXIT_BUTTON_LOCTOR).click();
	}
}
