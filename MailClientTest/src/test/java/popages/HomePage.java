package popages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage{
	private static final String HOME_PAGE_URL = "https://www.google.com";
	private static final By EMAIL_BUTTON_LOCATOR = By.xpath("(//a[@href='https://mail.google.com/mail/?tab=wm'])[1]");
	private static final By ENTER_EMAIL_BUTTON_LOCATOR = By.xpath("//a[@target='_top']");
	private static final By EMAIL_LOGGED_ICON_LOCATOR = By.xpath("//div[@class='gb_eb gb_7c gb_Ng gb_R']");
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public void openPage() {
		driver.get(HOME_PAGE_URL);
	}
		
	public AccountPage clickEnterEmailButton() {
		waitForElementVisible(ENTER_EMAIL_BUTTON_LOCATOR);
		driver.findElement(ENTER_EMAIL_BUTTON_LOCATOR).click();
		return new AccountPage(driver);
	}
	
	public void clickEmailButton() {
		waitForElementVisible(EMAIL_BUTTON_LOCATOR);
		driver.findElement(EMAIL_BUTTON_LOCATOR).click();
	}
	
	public By getEmailLoggedIcon() {
		return EMAIL_LOGGED_ICON_LOCATOR;
	}
	
	public LoggedIconPopUp clickEmailLoggedIcon() {
		waitForElementVisible(EMAIL_LOGGED_ICON_LOCATOR);
		driver.findElement(EMAIL_LOGGED_ICON_LOCATOR).click();
		return new LoggedIconPopUp(driver);
	}
}
