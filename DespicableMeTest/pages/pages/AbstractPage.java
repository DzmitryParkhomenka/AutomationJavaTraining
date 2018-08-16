package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.WebDriverSingleton;

public class AbstractPage {
	protected WebDriver driver;
	private static final int WAIT_FOR_ELEMENT_SECONDS = 5;
	
	public AbstractPage() {
		this.driver = WebDriverSingleton.getWebDriverInstance();
		PageFactory.initElements(this.driver, this);
	}
	
	protected void waitForElementVisible(WebElement webElement) {
		new WebDriverWait(driver, WAIT_FOR_ELEMENT_SECONDS).until(ExpectedConditions.visibilityOfAllElements(webElement));
	}
	
}
