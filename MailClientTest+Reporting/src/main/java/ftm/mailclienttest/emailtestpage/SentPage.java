package ftm.mailclienttest.emailtestpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ftm.mailclienttest.abstractpage.AbstractPage;

public class SentPage extends AbstractPage{
	private static final String URL = "https://mail.google.com/mail/u/0/#sent";
	private static final By SENT_EMAIL_LOCATOR = By.xpath("(//span[@class='bog'])[1]");
	private static final By EMAIL_CHAIN_NAME_LOCATOR = By.xpath("(//*[@class='bog'])[1]/span");
	
	
	public SentPage(WebDriver driver) {
		super(driver);
	}
	
	public void openPage() {
		driver.get(URL);
	}
	
	public void refreshDraftPage() {
		driver.navigate().refresh();
	}
	
	public void clickSentEmail() {
		waitForURLToBeExpected(URL);
		driver.findElement(SENT_EMAIL_LOCATOR).click();
	}
	
	public String getTextFromEmailChain() {
		waitForElementVisible(EMAIL_CHAIN_NAME_LOCATOR);
		return driver.findElement(EMAIL_CHAIN_NAME_LOCATOR).getText();
	}
}
