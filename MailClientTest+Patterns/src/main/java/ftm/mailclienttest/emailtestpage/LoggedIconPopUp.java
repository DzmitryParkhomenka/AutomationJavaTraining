package ftm.mailclienttest.emailtestpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ftm.mailclienttest.abstractpage.AbstractPage;

public class LoggedIconPopUp extends AbstractPage{
	private static final By EXIT_BUTTON_LOCTOR = By.xpath("//*[@id='gb_71']");
	private static final By EMAIL_LOGGED_ICON_INSIDE_EMAIL_LOCATOR = By.xpath("//*[@id='gb']/div[2]/div[3]/div/div[2]/div/a");
	
	public LoggedIconPopUp(WebDriver driver) {
		super(driver);
	}
	
	public LoggedIconPopUp clickIconInsideEmail() {
		waitForElementVisible(EMAIL_LOGGED_ICON_INSIDE_EMAIL_LOCATOR);
		driver.findElement(EMAIL_LOGGED_ICON_INSIDE_EMAIL_LOCATOR).click();
		return this;
	}
	
	public AccountPage clickExitButton() {
		waitForElementVisible(EXIT_BUTTON_LOCTOR);
		driver.findElement(EXIT_BUTTON_LOCTOR).click();
		return new AccountPage(driver);
	}
}
