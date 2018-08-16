package popages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoggedIconPopUp extends AbstractPage{
	private static final By EXIT_BUTTON_LOCTOR = By.xpath("//a[@class='gb_za gb_0f gb_6f gb_Le gb_Eb']");
	
	public LoggedIconPopUp(WebDriver driver) {
		super(driver);
	}
	
	public void clickExitButton() {
		waitForElementVisible(EXIT_BUTTON_LOCTOR);
		driver.findElement(EXIT_BUTTON_LOCTOR).click();
	}
}
