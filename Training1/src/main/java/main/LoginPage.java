package main;

import org.openqa.selenium.By;

public class LoginPage extends AbstractPage{
	private static final By LOGIN_FIELD_LOCATOR = By.xpath("//input[@type='email']");
	private static final By PASSWORD_FIELD_LOCATOR = By.xpath("//input[@type='password']");
	private static final String URL = "https://www.google.com/";
	private static final By EMAIL_BUTTON = By.xpath("//a[@class='gb_we gb_Aa gb_Fb']");
	private static final By LOGGED_EMAIL_ICON = By.xpath("//a[@class='gb_b gb_eb gb_R']");
	private static final By SUBMIT_EMAIL_BUTTON_LOCATOR = By.xpath("//div[@id='identifierNext']");
	private static final By SUBMIT_PASSWORD_BUTTON_LOCATOR = By.xpath("//div[@id='passwordNext']");
	
	public void fillInLoginField() {
		waitForElementToBeVisible(LOGIN_FIELD_LOCATOR);
		driver.findElement(LOGIN_FIELD_LOCATOR).sendKeys(User.getLogin());
	}
	
	public void fillInPasswordfield() {
		waitForElementToBeVisible(PASSWORD_FIELD_LOCATOR);
		driver.findElement(PASSWORD_FIELD_LOCATOR).sendKeys(User.getPassword());
	}
	
	public void openGooglePage() {
		driver.get(URL);
	}
	
	public void clickEmailButton() {
		waitForElementToBeVisible(EMAIL_BUTTON);
		driver.findElement(EMAIL_BUTTON).click();
		waitForElementToBeVisible(LOGIN_FIELD_LOCATOR);
	}
	
	public String getTextFromIconElement() {
		waitForElementToBeVisible(LOGGED_EMAIL_ICON);
		return driver.findElement(LOGGED_EMAIL_ICON).getAttribute("title");
	}
	
	public void clickSubmitEmailButton() {
		waitForElementToBeVisible(SUBMIT_EMAIL_BUTTON_LOCATOR);
		driver.findElement(SUBMIT_EMAIL_BUTTON_LOCATOR).click();
	}
	
	public void clickSubmitPasswordButton() {
		waitForElementToBeVisible(SUBMIT_PASSWORD_BUTTON_LOCATOR);
		driver.findElement(SUBMIT_PASSWORD_BUTTON_LOCATOR).click();
	}
}
