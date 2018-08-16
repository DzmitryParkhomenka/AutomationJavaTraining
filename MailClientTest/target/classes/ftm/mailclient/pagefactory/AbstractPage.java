package ftm.mailclient.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractPage {
	protected WebDriver driver;
	private static final int WAIT_FOR_ELEMENT_SECONDS = 5;
	
	public AbstractPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	protected void waitForElementVisible(WebElement webElement) {
		new WebDriverWait(driver, WAIT_FOR_ELEMENT_SECONDS).until(ExpectedConditions.visibilityOfAllElements(webElement));
	}
	
	protected void waitForURLToBeExpected(String url) {
		new WebDriverWait(driver, WAIT_FOR_ELEMENT_SECONDS).until(ExpectedConditions.urlToBe(url));
	}
	
	protected void waitForElementPresent(By locator) {
		new WebDriverWait(driver, WAIT_FOR_ELEMENT_SECONDS).until(ExpectedConditions.presenceOfElementLocated(locator));
	}
}
