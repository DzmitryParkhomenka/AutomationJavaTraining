package ftm.mailclienttest.actiontestpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import ftm.mailclienttest.tool.Screenshoter;

public class DroppablePage extends ActionsPage{
	private static final By SQUARE_LOCATOR = By.cssSelector("#draggable");
    private static final By TARGET_LOCATOR = By.cssSelector("#droppable");
    
    public DroppablePage(WebDriver driver) {
		super(driver);
	}

    public DroppablePage dragNDropSquare() {
        switchToFrame();
        waitForElementVisible(SQUARE_LOCATOR);
        waitForElementVisible(TARGET_LOCATOR);
        WebElement element = driver.findElement(SQUARE_LOCATOR);
        WebElement target = driver.findElement(TARGET_LOCATOR);
        Screenshoter.takeScreenshot(driver);
        new Actions(driver).dragAndDrop(element, target).build().perform();
        Screenshoter.takeScreenshot(driver);
        System.out.println("Successfully dragged a square!");
        return this;
    }
}
