package ftm.mailclienttest.emailtestpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ftm.mailclienttest.abstractpage.AbstractPage;
import ftm.mailclienttest.tool.Screenshoter;

public class LoggedIconPopUp extends AbstractPage{
	private static final By EXIT_BUTTON_LOCTOR = By.xpath("//*[@id='gb_71']");
	private static final By EMAIL_LOGGED_ICON_INSIDE_EMAIL_LOCATOR = By.xpath("//*[@id='gb']/div[2]/div[3]/div/div[2]/div/a");
	
	public LoggedIconPopUp(WebDriver driver) {
		super(driver);
	}
	
	public void clickIconInsideEmail() {
		waitForElementVisible(EMAIL_LOGGED_ICON_INSIDE_EMAIL_LOCATOR);
		highlightElement(EMAIL_LOGGED_ICON_INSIDE_EMAIL_LOCATOR);
		Screenshoter.takeScreenshot(driver);
		driver.findElement(EMAIL_LOGGED_ICON_INSIDE_EMAIL_LOCATOR).click();
	}
	
	public void clickExitButton() {
		waitForElementVisible(EXIT_BUTTON_LOCTOR);
		highlightElement(EXIT_BUTTON_LOCTOR);
		Screenshoter.takeScreenshot(driver);
		driver.findElement(EXIT_BUTTON_LOCTOR).click();
	}
}
