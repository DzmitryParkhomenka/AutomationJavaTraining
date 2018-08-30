package ftm.mailclienttest.abstractpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ftm.mailclienttest.webdriver.WebDriverSingleton;

public class AbstractPage {
	protected WebDriver driver;
	private static final int WAIT_FOR_ELEMENT_SECONDS = 10;

	public AbstractPage() {
		this.driver = WebDriverSingleton.getWebDriverInstance();
	}

	public void waitForElementVisible(By locator) {
		new WebDriverWait(driver, WAIT_FOR_ELEMENT_SECONDS)
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}

	public void waitForElementPresent(By locator) {
		new WebDriverWait(driver, WAIT_FOR_ELEMENT_SECONDS)
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}

	public void waitForElementNotVisible(By locator) {
		new WebDriverWait(driver, WAIT_FOR_ELEMENT_SECONDS)
				.until(ExpectedConditions.invisibilityOfElementLocated(locator));
	}

	public void waitForURLToBeExpected(String url) {
		new WebDriverWait(driver, WAIT_FOR_ELEMENT_SECONDS).until(ExpectedConditions.urlToBe(url));
	}
}
