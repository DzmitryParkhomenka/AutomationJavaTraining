package ftm.mailclient.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailPopUp extends AbstractPage{
	
	@FindBy(xpath = "//textarea[@name='to']")
	private WebElement toField;
	
	@FindBy(xpath = "//input[@name='subjectbox']")
	private WebElement subjectField;
	
	@FindBy(xpath = "//div[@role='textbox']")
	private WebElement textBoxField;
	
	@FindBy(xpath = "//span[@email='dimos-eskimos@yandex.ru']")
	private WebElement draftToField;
	
	@FindBy(xpath = "//input[@name='subject']")
	private WebElement draftSubjectField;
	
	@FindBy(xpath = "(//div[@role='button'][@tabindex='1'])[4]")
	private WebElement sendButton;
	
	@FindBy(xpath = "//img[@alt='Закрыть']")
	private WebElement saveCloseButton;
	
	public EmailPopUp(WebDriver driver) {
		super(driver);
	}

	public EmailPopUp fillInToField(String query) {
		waitForElementVisible(toField);
		toField.sendKeys(query);
		return this;
	}
	
	public EmailPopUp fillInSubjectField(String query) {
		waitForElementVisible(subjectField);
		subjectField.sendKeys(query);
		return this;
	}
	
	public EmailPopUp fillInTextboxField(String query) {
		waitForElementVisible(textBoxField);
		textBoxField.sendKeys(query);
		return this;
	}
	
	public EmailPopUp clickSendButton() {
		waitForElementVisible(sendButton);
		sendButton.click();
		return this;
	}
	
	public EmailPopUp clickSaveCloseButton() {
		waitForElementVisible(saveCloseButton);
		saveCloseButton.click();
		return this;
	}

	public String getToFieldText() {
		waitForElementVisible(draftToField);
		return draftToField.getAttribute("email");
	}
	
	public String getSubjectFieldText() {
		//waitForElementVisible(subjectField);
		return subjectField.getAttribute("value");
	}
	
	public String getTextboxText() {
		waitForElementVisible(textBoxField);
		return textBoxField.getText();
	}
}
