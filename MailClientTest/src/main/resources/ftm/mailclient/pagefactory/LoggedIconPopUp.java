package ftm.mailclient.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoggedIconPopUp extends AbstractPage{
	
	@FindBy(xpath = "//a[@class='gb_za gb_0f gb_6f gb_Le gb_Eb']")
	private WebElement exitButton;
	
	public LoggedIconPopUp(WebDriver driver) {
		super(driver);
	}
	
	public LoggedIconPopUp clickExitButton() {
		waitForElementVisible(exitButton);
		exitButton.click();
		return this;
	}
}
