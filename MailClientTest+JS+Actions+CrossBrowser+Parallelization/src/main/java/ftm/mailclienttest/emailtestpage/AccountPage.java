package ftm.mailclienttest.emailtestpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ftm.mailclienttest.abstractpage.AbstractPage;
import ftm.mailclienttest.businessobject.User;
import ftm.mailclienttest.tool.Screenshoter;

public class AccountPage extends AbstractPage{
	private static final String ACCOUNT_PAGE_URL = "https://accounts.google.com";
	private static final By EMAIL_FIELD_LOCATOR = By.xpath("//input[@type='email']");
	private static final By PASSWORD_FIELD_LOCATOR = By.xpath("//input[@type='password']");
	private static final By SUBMIT_EMAIL_BUTTON_LOCATOR = By.xpath("//div[@id='identifierNext']");
	private static final By SUBMIT_PASSWORD_BUTTON_LOCATOR = By.xpath("//div[@id='passwordNext']");
	
	public AccountPage(WebDriver driver) {
		super(driver);
	}
	
	public void openPage() {
		driver.get(ACCOUNT_PAGE_URL);
	}
	
	public String getTextFromPasswordField() {
		return driver.findElement(PASSWORD_FIELD_LOCATOR).getText();
	}

	public void fillInEmailField(User user) {
		highlightElement(EMAIL_FIELD_LOCATOR);
		Screenshoter.takeScreenshot(driver);
		driver.findElement(EMAIL_FIELD_LOCATOR).sendKeys(user.getLogin());
		Screenshoter.takeScreenshot(driver);
		unHighlightElement(EMAIL_FIELD_LOCATOR);
	}
	
	public void fillInPasswordField(User user) {
		highlightElement(PASSWORD_FIELD_LOCATOR);
		Screenshoter.takeScreenshot(driver);
		driver.findElement(PASSWORD_FIELD_LOCATOR).sendKeys(user.getPassword());
		Screenshoter.takeScreenshot(driver);
		unHighlightElement(PASSWORD_FIELD_LOCATOR);
	}
	
	public void clickSubmitEmailButton() {
		waitForElementVisible(SUBMIT_EMAIL_BUTTON_LOCATOR);
		driver.findElement(SUBMIT_EMAIL_BUTTON_LOCATOR).click();
		waitForElementVisible(PASSWORD_FIELD_LOCATOR);
	}
	
	public void clickSubmitPasswordButton(HomePage homePage) {
		waitForElementVisible(SUBMIT_PASSWORD_BUTTON_LOCATOR);
		driver.findElement(SUBMIT_PASSWORD_BUTTON_LOCATOR).click();
		waitForElementVisible(homePage.getEmailLoggedIcon());
	}
}
