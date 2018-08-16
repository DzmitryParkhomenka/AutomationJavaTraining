package pfpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DraftPage extends AbstractPage{
	private static final String DRAFT_PAGE_URL = "https://mail.google.com/mail/u/0/#drafts";

	@FindBy(xpath = "//span[@class='bog']")
	private WebElement topicDraftNotification;
	
	@FindBy(xpath = "//div[@data-tooltip='Обновить']")
	private WebElement refreshDraftButton;
	
	@FindBy(xpath = "//div[@class='J-J5-Ji btA']")
	private WebElement sendEmailButton;
	
	public DraftPage(WebDriver driver) {
		super(driver);
	}
	
	public DraftPage openDraftURL() {
		driver.get(DRAFT_PAGE_URL);
		return this;
	}
	
	public String getTextFromTopic() {
		waitForElementVisible(topicDraftNotification);
		return topicDraftNotification.getText();
	}
	
	public EmailPopUp clickTopicLink() {
		waitForElementVisible(topicDraftNotification);
		topicDraftNotification.click();
		return new EmailPopUp(driver);
	}
	
	public DraftPage refreshDraftPage() {
		driver.navigate().refresh();
		return this;
	}
	
	public DraftPage clickRefreshButton() {
		waitForElementVisible(refreshDraftButton);
		refreshDraftButton.click();
		return this;
	}
	
	public DraftPage clickSendEmailButton() {
		waitForElementVisible(sendEmailButton);
		sendEmailButton.click();
		return this;
	}
}
