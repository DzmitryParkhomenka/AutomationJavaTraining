package pfpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RightPanel extends AbstractPage{
	
	@FindBy(xpath = "//a[@href='https://mail.google.com/mail/u/0/#sent']")
	private WebElement sentButton; 
	
	@FindBy(xpath = "//a[@href='https://mail.google.com/mail/u/0/#drafts']")
	private WebElement draftsButton;
	
	@FindBy(xpath = "//div[@class='T-I J-J5-Ji T-I-KE L3']")
	private WebElement writeEmailButton;
	
	public RightPanel(WebDriver driver) {
		super(driver);
	}
	
	public SentPage clickSentButton() {
		waitForElementVisible(sentButton);
		sentButton.click();
		return new SentPage(driver);
	}
	
	public DraftPage clickDraftsButton() {
		waitForElementVisible(draftsButton);
		draftsButton.click();
		return new DraftPage(driver);
	}
	
	public EmailPopUp clickWriteEmailButton() {
		waitForElementVisible(writeEmailButton);
		writeEmailButton.click();
		return new EmailPopUp(driver);
	}
	
	public String getDraftsLocatorText() {
		return draftsButton.getText();
	}
}
