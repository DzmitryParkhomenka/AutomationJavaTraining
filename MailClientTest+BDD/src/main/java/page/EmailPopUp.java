package page;

import org.openqa.selenium.By;
import abstractpage.AbstractPage;

public class EmailPopUp extends AbstractPage{
	private static final By TO_FIELD_LOCATOR = By.xpath("//textarea[@name='to']");
	private static final By SUBJECT_FIELD_LOCATOR = By.xpath("//input[@name='subjectbox']");
	private static final By TEXTBOX_FIELD_LOCATOR = By.xpath("//div[@role='textbox']");
	private static final By	DRAFT_TO_FIELD_LOCATOR = By.xpath("//span[@email='dimos-eskimos@yandex.ru']");
	private static final By	DRAFT_SUBEJECT_FIELD_LOCATOR = By.xpath("//input[@name='subject']");
	private static final By SEND_BUTTON_LOCATOR = By.xpath("(//div[@role='button'][@tabindex='1'])[4]");
	private static final By SAVE_CLOSE_BUTTON_LOCATOR = By.xpath("//img[@alt='Закрыть']");
	private static final By SENT_POP_UP_LOCATOR = By.xpath("//*[@id='link_vsm']");
	
	public EmailPopUp() {
		super();
	}

	public EmailPopUp fillInToField(String toField) {
		waitForElementVisible(TO_FIELD_LOCATOR);
		driver.findElement(TO_FIELD_LOCATOR).sendKeys(toField);
		return this;
	}
	
	public EmailPopUp fillInSubjectField(String subjectField) {
		waitForElementVisible(SUBJECT_FIELD_LOCATOR);
		driver.findElement(SUBJECT_FIELD_LOCATOR).sendKeys(subjectField);
		return this;
	}
	
	public EmailPopUp fillInTextboxField(String textboxField) {
		waitForElementVisible(TEXTBOX_FIELD_LOCATOR);
		driver.findElement(TEXTBOX_FIELD_LOCATOR).sendKeys(textboxField);
		return this;
	}
	
	public SentPage clickSendButton() {
		waitForElementVisible(SEND_BUTTON_LOCATOR);
		driver.findElement(SEND_BUTTON_LOCATOR).click();
		waitForElementVisible(SENT_POP_UP_LOCATOR);
		return new SentPage();
	}
	
	public EmailPopUp clickSaveCloseButton() {
		waitForElementVisible(SAVE_CLOSE_BUTTON_LOCATOR);
		driver.findElement(SAVE_CLOSE_BUTTON_LOCATOR).click();
		return this;
	}

	public String getToFieldText() {
		waitForElementPresent(TO_FIELD_LOCATOR);
		return driver.findElement(DRAFT_TO_FIELD_LOCATOR).getAttribute("email");
	}
	
	public String getSubjectFieldText() {
		waitForElementPresent(SUBJECT_FIELD_LOCATOR);
		return driver.findElement(DRAFT_SUBEJECT_FIELD_LOCATOR).getAttribute("value");
	}
	
	public String getTextboxText() {
		waitForElementPresent(TEXTBOX_FIELD_LOCATOR);
		return driver.findElement(TEXTBOX_FIELD_LOCATOR).getText();
	}
}
