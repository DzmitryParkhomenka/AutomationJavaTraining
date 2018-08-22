package ftm.mailclienttest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ftm.mailclienttest.tools.Screenshoter;

public class SentPage extends AbstractPage{
	private static final String URL = "https://mail.google.com/mail/u/0/#sent";
	private static final By SENT_EMAIL_LOCATOR = By.xpath("//span[@class='bog']");
	private static final By EMAIL_CHAIN_NAME_LOCATOR = By.xpath("//h2[@class='hP']");
	
	
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
		waitForElementPresent(SENT_EMAIL_LOCATOR);
		highlightElement(SENT_EMAIL_LOCATOR);
		Screenshoter.takeScreenshot(driver);
		driver.findElement(SENT_EMAIL_LOCATOR).click();
	}
	
	public String getTextFromEmailChain() {
		waitForElementVisible(EMAIL_CHAIN_NAME_LOCATOR);
		highlightElement(EMAIL_CHAIN_NAME_LOCATOR);
		Screenshoter.takeScreenshot(driver);
		return driver.findElement(EMAIL_CHAIN_NAME_LOCATOR).getText();
	}
}
