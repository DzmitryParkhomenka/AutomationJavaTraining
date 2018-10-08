package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractPage {
	protected WebDriver driver;
	private static final int WAIT_SECONDS = 10;
	
	public AbstractPage() {
		this.driver = WebDriverSingleton.getInstance();
	}
	
	public void waitForElementToBeVisible(By locator) {
		new WebDriverWait(driver, WAIT_SECONDS).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	public void waitForElementNotToBePresent(By locator) {
		new WebDriverWait(driver, WAIT_SECONDS).until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}
}
