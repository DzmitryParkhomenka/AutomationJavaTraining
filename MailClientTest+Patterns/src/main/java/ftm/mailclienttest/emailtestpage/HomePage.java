package ftm.mailclienttest.emailtestpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ftm.mailclienttest.abstractpage.AbstractPage;

public class HomePage extends AbstractPage{
	private static final String HOME_PAGE_URL = "https://www.google.com";
	private static final By EMAIL_BUTTON_LOCATOR = By.xpath("(//a[@href='https://mail.google.com/mail/?tab=wm'])[1]");
	private static final By ENTER_EMAIL_BUTTON_LOCATOR = By.xpath("//a[@target='_top']");
	private static final By EMAIL_LOGGED_ICON_LOCATOR = By.xpath("//*[@id='gbw']/div/div/div[2]/div[4]/div[1]/a");
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public HomePage openPage() {
		driver.get(HOME_PAGE_URL);
		return this;
	}
		
	public AccountPage clickEnterEmailButton() {
		waitForElementVisible(ENTER_EMAIL_BUTTON_LOCATOR);
		driver.findElement(ENTER_EMAIL_BUTTON_LOCATOR).click();
		return new AccountPage(driver);
	}
	
	public LeftPanel clickEmailButton() {
		waitForElementVisible(EMAIL_BUTTON_LOCATOR);
		driver.findElement(EMAIL_BUTTON_LOCATOR).click();
		return new LeftPanel(driver);
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
