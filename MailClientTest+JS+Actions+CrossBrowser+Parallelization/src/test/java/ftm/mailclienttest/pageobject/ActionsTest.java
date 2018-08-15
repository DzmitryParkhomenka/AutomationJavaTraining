package ftm.mailclienttest.pageobject;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ftm.mailclienttest.pages.MainPage;
import ftm.mailclienttest.webdriverthread.Browser;

public class ActionsTest {
	public static WebDriver driver;

	@BeforeClass
	@Parameters("browser")
	public static void getBrowserName(String browser) throws MalformedURLException{
		driver = Browser.getDriver(browser);
	}
	
    @Test(description = "Drag-n-drop test")
    public void dragNDrop() {
        new MainPage(driver).open().openDroppableLink().dragNDropSquare();
    }

    @Test(description = "Selecting test")
    public void selectItems() {
        new MainPage(driver).open().openSelectableLink().selectItems(5);
    }

    @AfterClass(description = "close browser")
    public void kill() {
        driver.quit();
    }
}
