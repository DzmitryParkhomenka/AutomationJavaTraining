package ftm.mailclienttest.emailtestpage;

import org.openqa.selenium.By;
import ftm.mailclienttest.abstractpage.AbstractPage;
import ftm.mailclienttest.businessobject.User;

public class AccountPage extends AbstractPage{
	private static final String ACCOUNT_PAGE_URL = "https://accounts.google.com";
	private static final By EMAIL_FIELD_LOCATOR = By.xpath("//input[@type='email']");
	private static final By PASSWORD_FIELD_LOCATOR = By.xpath("//input[@type='password']");
	private static final By SUBMIT_EMAIL_BUTTON_LOCATOR = By.xpath("//div[@id='identifierNext']");
	private static final By SUBMIT_PASSWORD_BUTTON_LOCATOR = By.xpath("//div[@id='passwordNext']");
	
	public AccountPage() {
		super();
	}
	
	public void openPage() {
		driver.get(ACCOUNT_PAGE_URL);
	}
	
	public String getTextFromPasswordField() {
		return driver.findElement(PASSWORD_FIELD_LOCATOR).getText();
	}

	public void fillInEmailField(User user) {
		driver.findElement(EMAIL_FIELD_LOCATOR).sendKeys(user.getLogin());
	}
	
	public void fillInPasswordField(User user) {
		driver.findElement(PASSWORD_FIELD_LOCATOR).sendKeys(user.getPassword());
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
