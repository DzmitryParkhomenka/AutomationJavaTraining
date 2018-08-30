package page;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

import businessObject.Email;

public class EmailPopUp{
	private static final By TO_FIELD_LOCATOR = By.xpath("//textarea[@name='to']");
	private static final By SUBJECT_FIELD_LOCATOR = By.xpath("//input[@name='subjectbox']");
	private static final By TEXTBOX_FIELD_LOCATOR = By.xpath("//div[@role='textbox']");
	private static final By SEND_BUTTON_LOCATOR = By.xpath("(//div[@role='button'][@tabindex='1'])[4]");
	private static final By SENT_POP_UP_LOCATOR = By.xpath("//*[@id='link_vsm']");

	public static void setValueToToEmailField() {
		$(TO_FIELD_LOCATOR).setValue(Email.getTo());
	}
	
	public static void setValueToSubjectField() {
		$(SUBJECT_FIELD_LOCATOR).setValue(Email.getSubject());
	}
	
	public static void setValueToTextField() {
		$(TEXTBOX_FIELD_LOCATOR).setValue(Email.getText());
	}
	
	public static void clickSendButton() {
		$(SEND_BUTTON_LOCATOR).click();
	}
	
	public static void checkSendPopUpVisible() {
		$(SENT_POP_UP_LOCATOR).shouldBe(visible);
	}
}
