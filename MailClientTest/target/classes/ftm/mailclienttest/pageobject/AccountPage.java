package ftm.mailclienttest.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

	public void fillInEmailField(String query) {
		driver.findElement(EMAIL_FIELD_LOCATOR).sendKeys(query);
	}
	
	public void fillInPasswordField(String query) {
		driver.findElement(PASSWORD_FIELD_LOCATOR).sendKeys(query);
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
