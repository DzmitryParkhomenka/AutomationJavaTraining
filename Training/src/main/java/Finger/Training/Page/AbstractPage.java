package Finger.Training.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Finger.Training.WebDriverSingleton.WebDriverSingleton;

public class AbstractPage {
	protected WebDriver driver;
	private static final int WAIT_SECONDS = 10;
	
	public AbstractPage() {
		this.driver = WebDriverSingleton.getDriverInstance();
	}
	
	public void waitForElementsToBeVisible(By locator) {
		new WebDriverWait(driver, WAIT_SECONDS).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
}
