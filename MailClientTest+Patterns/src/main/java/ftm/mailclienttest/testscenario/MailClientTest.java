package ftm.mailclienttest.testscenario;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ftm.mailclienttest.businessobject.*;
import ftm.mailclienttest.decorator.DriverDecorator;
import ftm.mailclienttest.emailtestpage.*;
import ftm.mailclienttest.factory.DriverFactory;
import ftm.mailclienttest.util.Refresher;

public class MailClientTest {
	private static WebDriver driver;
	
	@BeforeClass
	@Parameters("browser")
	public static void getDriver(String browser) {
		driver = DriverFactory.getDriver(browser);
		driver = new DriverDecorator(driver);
	}

	@Test(priority = 1)
	public void login() {
		HomePage homePage = new HomePage(driver).openPage();
		AccountPage accountPage = homePage.clickEnterEmailButton();
		accountPage.fillInEmailField(new User()).clickSubmitEmailButton().fillInPasswordField(new User()).clickSubmitPasswordButton(homePage);
		Assert.assertTrue(driver.findElement(homePage.getEmailLoggedIcon()).isDisplayed(), "Logged icon is not displayed");
	}

	@Test(priority = 2)
	public void sendEmail() {
		SentPage sentPage = new SentPage(driver);
		EmailPopUp emailPopUp = new HomePage(driver).clickEmailButton().clickWriteEmailButton();
		emailPopUp.fillInToField(new Email()).fillInSubjectField(new Email()).fillInTextboxField(new Email()).clickSendButton();
		sentPage.openPage();
		new Refresher().refreshPage(driver);
		Assert.assertEquals(sentPage.getTextFromEmailChain(), new Email().getSubject());
	}
	
	@Test(priority = 3)
	public void logOutFromAccount() {
		new LoggedIconPopUp(driver).clickIconInsideEmail().clickExitButton();
		AccountPage accountPage = new AccountPage(driver);
		Assert.assertEquals(accountPage.getTextFromPasswordField(), "");
	}

	@AfterClass(description = "TearDown")
	public void tearDown() {
		driver.quit();
	}
}
