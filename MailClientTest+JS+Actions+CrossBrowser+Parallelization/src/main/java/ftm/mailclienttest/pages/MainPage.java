package ftm.mailclienttest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ftm.mailclienttest.screenshoter.Screenshoter;

public class MainPage extends AbstractPage{
	private static final String MAIN_URL = "https://jqueryui.com";
    private static final By DROPPABLE_LINK_LOCATOR = By.cssSelector("a[href$='droppable/']");
    private static final By SELECTABLE_LINK_LOCATOR = By.cssSelector("a[href$='selectable/']");

    public MainPage(WebDriver driver) {
		super(driver);
	}
    
    public MainPage open() {
        driver.get(MAIN_URL);
        return this;
    }

    public DroppablePage openDroppableLink() {
        highlightElement(DROPPABLE_LINK_LOCATOR);
        Screenshoter.takeScreenshot(driver);
        unHighlightElement(DROPPABLE_LINK_LOCATOR);
        driver.findElement(DROPPABLE_LINK_LOCATOR).click();
        return new DroppablePage(driver);
    }

    public SelectablePage openSelectableLink() {
        highlightElement(SELECTABLE_LINK_LOCATOR);
        Screenshoter.takeScreenshot(driver);
        unHighlightElement(SELECTABLE_LINK_LOCATOR);
        driver.findElement(SELECTABLE_LINK_LOCATOR).click();
        return new SelectablePage(driver);
    }
}
