package ftm.mailclient.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends AbstractPage{
	private static final String ACCOUNT_PAGE_URL = "https://accounts.google.com";
	
	@FindBy(xpath = "//input[@type='email']")
	private WebElement emailField;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwordField;
	
	@FindBy(xpath = "//div[@id='identifierNext']")
	private WebElement submitEmailButton;
	
	@FindBy(xpath = "//div[@id='passwordNext']")
	private WebElement submitPasswordButton;
	
	public AccountPage(WebDriver driver) {
		super(driver);
	}
	
	public void openPage() {
		driver.get(ACCOUNT_PAGE_URL);
	}
	
	public String getTextFromPasswordField() {
		return passwordField.getText();
	}

	public AccountPage fillInEmailField(String query) {
		emailField.sendKeys(query);
		return this;
	}
	
	public AccountPage fillInPasswordField(String query) {
		passwordField.sendKeys(query);
		return this;
	}
	
	public AccountPage clickSubmitEmailButton() {
		waitForElementVisible(submitEmailButton);
		submitEmailButton.click();
		waitForElementVisible(passwordField);
		return this;
	}
	
	public AccountPage clickSubmitPasswordButton(HomePage homePage) {
		waitForElementVisible(submitPasswordButton);
		submitPasswordButton.click();
		waitForElementVisible(homePage.getEmailLoggedIcon());
		return this;
	}
}
