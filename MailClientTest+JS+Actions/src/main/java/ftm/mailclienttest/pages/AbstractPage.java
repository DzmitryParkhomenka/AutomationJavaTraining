package ftm.mailclienttest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ftm.mailclienttest.webdriversingle.*;

public class AbstractPage {
	protected WebDriver driver;
	private static final int WAIT_FOR_ELEMENT_SECONDS = 5;
	
	public AbstractPage() {
		this.driver = WebDriverSingleton.getWebDriverInstance();
	}
	
	protected void waitForElementVisible(By locator) {
		new WebDriverWait(driver, WAIT_FOR_ELEMENT_SECONDS).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	protected void waitForElementPresent(By locator) {
		new WebDriverWait(driver, WAIT_FOR_ELEMENT_SECONDS).until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}
	
	protected void waitForURLToBeExpected(String url) {
		new WebDriverWait(driver, WAIT_FOR_ELEMENT_SECONDS).until(ExpectedConditions.urlToBe(url));
	}
	
    protected void highlightElement(By locator) {
        WebElement element = driver.findElement(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid green'", element);
    }

    protected void unHighlightElement(By locator) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='0px'", driver.findElement(locator));
    }
}
