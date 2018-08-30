package ftm.mailclienttest.emailtestpage;

import org.openqa.selenium.By;
import ftm.mailclienttest.abstractpage.AbstractPage;

public class LeftPanel extends AbstractPage{
	private static final By SENT_BUTTON_LOCATOR = By.xpath("//a[@href='https://mail.google.com/mail/u/0/#sent']");
	private static final By DRAFTS_BUTTON_LOCATOR = By.xpath("//a[@href='https://mail.google.com/mail/u/0/#drafts']");
	private static final By WRITE_EMAIL_BUTTON_LOCATOR = By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']");
	
	public LeftPanel() {
		super();
	}
	
	public SentPage clickSentButton() {
		waitForElementVisible(SENT_BUTTON_LOCATOR);
		driver.findElement(SENT_BUTTON_LOCATOR).click();
		return new SentPage();
	}
	
	public DraftPage clickDraftsButton() {
		waitForElementVisible(DRAFTS_BUTTON_LOCATOR);
		driver.findElement(DRAFTS_BUTTON_LOCATOR).click();
		return new DraftPage();
	}
	
	public EmailPopUp clickWriteEmailButton() {
		waitForElementVisible(WRITE_EMAIL_BUTTON_LOCATOR);
		driver.findElement(WRITE_EMAIL_BUTTON_LOCATOR).click();
		return new EmailPopUp();
	}
	
	public String getDraftsLocatorText() {
		waitForElementVisible(DRAFTS_BUTTON_LOCATOR);
		return driver.findElement(DRAFTS_BUTTON_LOCATOR).getText();
	}
}
