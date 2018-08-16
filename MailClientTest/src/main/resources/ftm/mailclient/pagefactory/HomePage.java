package ftm.mailclient.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage{
	private static final String HOME_PAGE_URL = "https://www.google.com";
		
	@FindBy(xpath = "(//a[@href='https://mail.google.com/mail/?tab=wm'])[1]")
	private WebElement emailButton;
	
	@FindBy(xpath = "//a[@target='_top']")
	private WebElement enterEmailButton;
	
	@FindBy(xpath = "//div[@class='gb_eb gb_7c gb_Ng gb_R']")
	private WebElement emailLoggedIcon;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public HomePage openPage() {
		driver.get(HOME_PAGE_URL);
		return this;
	}
		
	public AccountPage clickEnterEmailButton() {
		waitForElementVisible(enterEmailButton);
		enterEmailButton.click();
		return new AccountPage(driver);
	}
	
	public HomePage clickEmailButton() {
		waitForElementVisible(emailButton);
		emailButton.click();
		return this;
	}
	
	public WebElement getEmailLoggedIcon() {
		return emailLoggedIcon;
	}
	
	public LoggedIconPopUp clickEmailLoggedIcon() {
		waitForElementVisible(emailLoggedIcon);
		emailLoggedIcon.click();
		return new LoggedIconPopUp(driver);
	}
}
