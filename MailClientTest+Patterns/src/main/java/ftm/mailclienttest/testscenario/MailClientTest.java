package ftm.mailclienttest.testscenario;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ftm.mailclienttest.businessobject.*;
import ftm.mailclienttest.emailtestpage.*;
import ftm.mailclienttest.factory.DriverFactory;
import ftm.mailclienttest.util.Refresher;

public class MailClientTest {
	private static WebDriver driver;
	
	@BeforeClass
	public static void getDriver() {
		driver = DriverFactory.getDriver("Chrome");
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
		new Refresher().refreshPage(driver);
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
