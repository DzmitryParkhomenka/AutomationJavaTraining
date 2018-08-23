package Pages;

import org.openqa.selenium.By;

public class EmailPopUp{
	private static final By TO_FIELD_LOCATOR = By.xpath("//textarea[@name='to']");
	private static final By SUBJECT_FIELD_LOCATOR = By.xpath("//input[@name='subjectbox']");
	private static final By TEXTBOX_FIELD_LOCATOR = By.xpath("//div[@role='textbox']");
	private static final By SEND_BUTTON_LOCATOR = By.xpath("(//div[@role='button'][@tabindex='1'])[4]");
	private static final By SENT_POP_UP_LOCATOR = By.xpath("//*[@id='link_vsm']");
	
	public static By getToFieldLocator() {
		return TO_FIELD_LOCATOR;
	}
	
	public static By getSubjectFieldLocator() {
		return SUBJECT_FIELD_LOCATOR;
	}
	
	public static By getTextboxFieldLocator() {
		return TEXTBOX_FIELD_LOCATOR;
	}
	
	public static By getSendButtonLocator() {
		return SEND_BUTTON_LOCATOR;
	}
	
	public static By getSendPopUpLocator() {
		return SENT_POP_UP_LOCATOR;
	}
}
