package ftm.mailclienttest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import ftm.mailclienttest.screenshoter.Screenshoter;

public class SelectablePage extends ActionsPage {
	public static final By FIRST_ITEM_LOCATOR = By.xpath("//li[1]");
    public static final String LAST_ITEM_LOCATOR_PATTERN = "//li[%d]";
    
    public SelectablePage(WebDriver driver) {
 		super(driver);
 	}

    public SelectablePage selectItems(int itemsToSelect) {
        switchToFrame();
        waitForElementVisible(FIRST_ITEM_LOCATOR);
        By lastItemLocator = By.xpath(String.format(LAST_ITEM_LOCATOR_PATTERN, itemsToSelect));
        Screenshoter.takeScreenshot(driver);
        new Actions(driver).clickAndHold(driver.findElement(FIRST_ITEM_LOCATOR)).moveToElement(driver.findElement(lastItemLocator)).release().build().perform();
        Screenshoter.takeScreenshot(driver);
        System.out.println("Successfully selected " + itemsToSelect + " elements!");
        return this;
    }
}
