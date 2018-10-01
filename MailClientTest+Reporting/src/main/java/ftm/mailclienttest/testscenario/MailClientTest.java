package ftm.mailclienttest.testscenario;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ftm.mailclienttest.businessobject.Email;
import ftm.mailclienttest.businessobject.User;
import ftm.mailclienttest.emailtestpage.*;
import ftm.mailclienttest.tool.Refresher;
import ftm.mailclienttest.webdriver.WebDriverInit;

public class MailClientTest {
	public static WebDriver driver;

	@BeforeClass
	@Parameters("browser")
	public static void getBrowserName(String browser) throws MalformedURLException{
		driver = WebDriverInit.getDriver(browser);
	}

	@Test(priority = 1)
	public void login() {
		HomePage homePage = new HomePage(driver);
		homePage.openPage();
		AccountPage accountPage = homePage.clickEnterEmailButton();
		accountPage.fillInEmailField(new User());
		accountPage.clickSubmitEmailButton();
		accountPage.fillInPasswordField(new User());
		accountPage.clickSubmitPasswordButton(homePage);
		Assert.assertTrue(driver.findElement(homePage.getEmailLoggedIcon()).isDisplayed(), "Logged icon is not displayed");
	}

	@Test(priority = 2)
	public void sendEmail() {
		HomePage homePage = new HomePage(driver);
		LeftPanel leftPanel = new LeftPanel(driver);
		SentPage sentPage = new SentPage(driver);
		homePage.clickEmailButton();
		EmailPopUp emailPopUp = leftPanel.clickWriteEmailButton();
		emailPopUp.fillInToField(new Email());
		emailPopUp.fillInSubjectField(new Email());
		emailPopUp.fillInTextboxField(new Email());
		emailPopUp.clickSendButton();
		sentPage.openPage();
		new Refresher(driver).refreshPage();
		Assert.assertEquals(sentPage.getTextFromEmailChain(), new Email().getSubject());
	}
	
	@Test(priority = 3)
	public void logOutFromAccount() {
		LoggedIconPopUp loggedIconPopUp = new LoggedIconPopUp(driver);
		loggedIconPopUp.clickIconInsideEmail();
		loggedIconPopUp.clickExitButton();
		AccountPage accountPage = new AccountPage(driver);
		Assert.assertEquals(accountPage.getTextFromPasswordField(), "");
	}

	@AfterClass(description = "TearDown")
	public void tearDown() {
		driver.quit();
	}
}
