package pfpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SentPage extends AbstractPage{
	private static final String URL = "https://mail.google.com/mail/u/0/#sent";
	
	@FindBy(xpath = "//span[@class='bog']")
	private WebElement sentEmail;
	
	@FindBy(xpath = "//h2[@class='hP']")
	private WebElement emailChainName;
	
	public SentPage(WebDriver driver) {
		super(driver);
	}
	
	public void openPage() {
		driver.get(URL);
	}
	
	public void refreshDraftPage() {
		driver.navigate().refresh();
	}
	
	public SentPage clickSentEmail() {
		waitForElementVisible(sentEmail);
		sentEmail.click();
		return this;
	}
	
	public String getTextFromEmailChain() {
		waitForElementVisible(emailChainName);
		return emailChainName.getText();
	}
}
