package source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage{
	private static final String HOME_PAGE_URL = "https://www.google.com";
	
	@FindBy(xpath = "//*[@id='lst-ib']")
	private WebElement inputField;
	
	@FindBy(xpath = "(//input[@type='submit'])[1]")
	private WebElement searchButton;

	public HomePage() {
		super();
	}
	
	public HomePage openURL() {
		driver.get(HOME_PAGE_URL);
		return new HomePage();
	}
	
	public HomePage sendKeysToInputField(String query) {
		inputField.sendKeys(query);
		return new HomePage();
	}

	public SearchResultPage clickSearchButton() {
		searchButton.sendKeys(Keys.ENTER);
		return new SearchResultPage();
	}
}
