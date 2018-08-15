package ftm.mailclienttest.pages;

import org.openqa.selenium.By;

public class EmailPopUp extends AbstractPage{
	private static final By TO_FIELD_LOCATOR = By.xpath("//textarea[@name='to']");
	private static final By SUBJECT_FIELD_LOCATOR = By.xpath("//input[@name='subjectbox']");
	private static final By TEXTBOX_FIELD_LOCATOR = By.xpath("//div[@role='textbox']");
	private static final By	DRAFT_TO_FIELD_LOCATOR = By.xpath("//span[@email='dimos-eskimos@yandex.ru']");
	private static final By	DRAFT_SUBEJECT_FIELD_LOCATOR = By.xpath("//input[@name='subject']");
	private static final By SEND_BUTTON_LOCATOR = By.xpath("(//div[@role='button'][@tabindex='1'])[4]");
	private static final By SAVE_CLOSE_BUTTON_LOCATOR = By.xpath("//img[@alt='Закрыть']");
	
	public EmailPopUp() {
		super();
	}

	public void fillInToField(String query) {
		waitForElementVisible(TO_FIELD_LOCATOR);
		driver.findElement(TO_FIELD_LOCATOR).sendKeys(query);
	}
	
	public void fillInSubjectField(String query) {
		waitForElementVisible(SUBJECT_FIELD_LOCATOR);
		driver.findElement(SUBJECT_FIELD_LOCATOR).sendKeys(query);
	}
	
	public void fillInTextboxField(String query) {
		waitForElementVisible(TEXTBOX_FIELD_LOCATOR);
		driver.findElement(TEXTBOX_FIELD_LOCATOR).sendKeys(query);
	}
	
	public void clickSendButton() {
		waitForElementVisible(SEND_BUTTON_LOCATOR);
		driver.findElement(SEND_BUTTON_LOCATOR).click();
	}
	
	public void clickSaveCloseButton() {
		waitForElementVisible(SAVE_CLOSE_BUTTON_LOCATOR);
		driver.findElement(SAVE_CLOSE_BUTTON_LOCATOR).click();
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
