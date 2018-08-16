package ftm.mailclienttest.pages;

import org.openqa.selenium.By;

import ftm.mailclienttest.screenshoter.Screenshoter;

public class RightPanel extends AbstractPage{
	private static final By SENT_BUTTON_LOCATOR = By.xpath("//a[@href='https://mail.google.com/mail/u/0/#sent']");
	private static final By DRAFTS_BUTTON_LOCATOR = By.xpath("//a[@href='https://mail.google.com/mail/u/0/#drafts']");
	private static final By WRITE_EMAIL_BUTTON_LOCATOR = By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']");
	
	public RightPanel() {
		super();
	}
	
	public SentPage clickSentButton() {
		waitForElementVisible(SENT_BUTTON_LOCATOR);
		highlightElement(SENT_BUTTON_LOCATOR);
		Screenshoter.takeScreenshot();
		driver.findElement(SENT_BUTTON_LOCATOR).click();
		return new SentPage();
	}
	
	public DraftPage clickDraftsButton() {
		waitForElementVisible(DRAFTS_BUTTON_LOCATOR);
		highlightElement(DRAFTS_BUTTON_LOCATOR);
		Screenshoter.takeScreenshot();
		driver.findElement(DRAFTS_BUTTON_LOCATOR).click();
		return new DraftPage();
	}
	
	public EmailPopUp clickWriteEmailButton() {
		waitForElementVisible(WRITE_EMAIL_BUTTON_LOCATOR);
		highlightElement(WRITE_EMAIL_BUTTON_LOCATOR);
		Screenshoter.takeScreenshot();
		driver.findElement(WRITE_EMAIL_BUTTON_LOCATOR).click();
		return new EmailPopUp();
	}
	
	public String getDraftsLocatorText() {
		return driver.findElement(DRAFTS_BUTTON_LOCATOR).getText();
	}
}
