package ftm.mailclienttest.testscenario;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import ftm.mailclienttest.businessobject.*;
import ftm.mailclienttest.emailtestpage.*;
import ftm.mailclienttest.util.Refresher;
import ftm.mailclienttest.webdriver.WebDriverSingleton;

public class MailClientTest {

	@Test(priority = 1)
	public void login() {
		HomePage homePage = new HomePage();
		homePage.openPage();
		AccountPage accountPage = homePage.clickEnterEmailButton();
		accountPage.fillInEmailField(new User());
		accountPage.clickSubmitEmailButton();
		accountPage.fillInPasswordField(new User());
		accountPage.clickSubmitPasswordButton(homePage);
		Assert.assertTrue(WebDriverSingleton.getWebDriverInstance().findElement(homePage.getEmailLoggedIcon()).isDisplayed(), "Logged icon is not displayed");
	}

	@Test(priority = 2)
	public void sendEmail() {
		HomePage homePage = new HomePage();
		LeftPanel leftPanel = new LeftPanel();
		SentPage sentPage = new SentPage();
		homePage.clickEmailButton();
		EmailPopUp emailPopUp = leftPanel.clickWriteEmailButton();
		emailPopUp.fillInToField(new Email());
		emailPopUp.fillInSubjectField(new Email());
		emailPopUp.fillInTextboxField(new Email());
		emailPopUp.clickSendButton();
		sentPage.openPage();
		new Refresher().refreshPage();
		Assert.assertEquals(sentPage.getTextFromEmailChain(), new Email().getSubject());
	}
	
	@Test(priority = 3)
	public void logOutFromAccount() {
		LoggedIconPopUp loggedIconPopUp = new LoggedIconPopUp();
		loggedIconPopUp.clickIconInsideEmail();
		loggedIconPopUp.clickExitButton();
		AccountPage accountPage = new AccountPage();
		Assert.assertEquals(accountPage.getTextFromPasswordField(), "");
	}

	@AfterClass(description = "TearDown")
	public void tearDown() {
		WebDriverSingleton.getWebDriverInstance().quit();
	}
}
