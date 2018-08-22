package ftm.mailclienttest.testscenarios;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ftm.mailclienttest.businessobjects.User;
import ftm.mailclienttest.pages.*;
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
	public void writeEmailToDrafts() {
		String to = "dimos-eskimos@yandex.ru";
		String subject = "Learn To Automate";
		String text = "Getting some knowledge";
		HomePage homePage = new HomePage(driver);
		homePage.clickEmailButton();
		LeftPanel rightPanel = new LeftPanel(driver);
		EmailPopUp emailPopUp = rightPanel.clickWriteEmailButton();
		emailPopUp.fillInToField(to);
		emailPopUp.fillInSubjectField(subject);
		emailPopUp.fillInTextboxField(text);
		emailPopUp.clickSaveCloseButton();
		DraftPage draftPage = rightPanel.clickDraftsButton();
		draftPage.openDraftURL();
		Assert.assertEquals(draftPage.getTextFromTopic(), subject);
	}

	@Test(priority = 3)
	public void checkTopicInDrafts() {
		DraftPage draftPage = new DraftPage(driver);
		EmailPopUp emailPopUp = draftPage.clickTopicLink();
		Assert.assertEquals(emailPopUp.getToFieldText(), "dimos-eskimos@yandex.ru");
	}

	@Test(priority = 4)
	public void checksubjectInDrafts() {
		EmailPopUp emailPopUp = new EmailPopUp(driver);
		Assert.assertEquals(emailPopUp.getSubjectFieldText(), "Learn To Automate");
	}

	@Test(priority = 5)
	public void checkTextboxInDrafts() {
		EmailPopUp emailPopUp = new EmailPopUp(driver);
		Assert.assertEquals(emailPopUp.getTextboxText(), "Getting some knowledge");
	}

	@Test(priority = 6)
	public void sendEmailFromDrafts() {
		LeftPanel rightPanel = new LeftPanel(driver);
		DraftPage draftPage = new DraftPage(driver);
		draftPage.clickSendEmailButton();
		Assert.assertEquals(rightPanel.getDraftsLocatorText(), "Черновики");
	}

	@Test(priority = 7)
	public void checkEmailIsSent() {
		String subject = "Learn To Automate";
		LeftPanel rightPanel = new LeftPanel(driver);
		SentPage sentPage = rightPanel.clickSentButton();
		sentPage.clickSentEmail();
		Assert.assertEquals(sentPage.getTextFromEmailChain(), subject);
	}

	@Test(priority = 8)
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
