package ftm.mailclienttest.emailtestpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ftm.mailclienttest.abstractpage.AbstractPage;
import ftm.mailclienttest.tools.Screenshoter;

public class HomePage extends AbstractPage{
	private static final String HOME_PAGE_URL = "https://www.google.com";
	private static final By EMAIL_BUTTON_LOCATOR = By.xpath("(//a[@href='https://mail.google.com/mail/?tab=wm'])[1]");
	private static final By ENTER_EMAIL_BUTTON_LOCATOR = By.xpath("//a[@target='_top']");
	private static final By EMAIL_LOGGED_ICON_LOCATOR = By.xpath("//*[@id='gbw']/div/div/div[2]/div[4]/div[1]/a");
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public void openPage() {
		driver.get(HOME_PAGE_URL);
	}
		
	public AccountPage clickEnterEmailButton() {
		waitForElementVisible(ENTER_EMAIL_BUTTON_LOCATOR);
		highlightElement(ENTER_EMAIL_BUTTON_LOCATOR);
		Screenshoter.takeScreenshot(driver);
		driver.findElement(ENTER_EMAIL_BUTTON_LOCATOR).click();
		return new AccountPage(driver);
	}
	
	public void clickEmailButton() {
		waitForElementVisible(EMAIL_BUTTON_LOCATOR);
		highlightElement(EMAIL_BUTTON_LOCATOR);
		Screenshoter.takeScreenshot(driver);
		driver.findElement(EMAIL_BUTTON_LOCATOR).click();
	}
	
	public By getEmailLoggedIcon() {
		return EMAIL_LOGGED_ICON_LOCATOR;
	}
	
	public LoggedIconPopUp clickEmailLoggedIcon() {
		waitForElementVisible(EMAIL_LOGGED_ICON_LOCATOR);
		highlightElement(EMAIL_LOGGED_ICON_LOCATOR);
		Screenshoter.takeScreenshot(driver);
		driver.findElement(EMAIL_LOGGED_ICON_LOCATOR).click();
		return new LoggedIconPopUp(driver);
	}
}
