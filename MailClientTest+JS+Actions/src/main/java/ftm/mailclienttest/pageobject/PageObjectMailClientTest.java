package ftm.mailclienttest.pageobject;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import ftm.mailclienttest.pages.*;
import ftm.mailclienttest.webdriversingle.*;

public class PageObjectMailClientTest {
	
	@Test(priority = 1)
	public void login() {
		HomePage homePage = new HomePage();
		homePage.openPage();
		AccountPage accountPage = homePage.clickEnterEmailButton();
		accountPage.fillInEmailField("dimos.eskimos@gmail.com");
		accountPage.clickSubmitEmailButton();
		accountPage.fillInPasswordField("Jkmrfghbdtn20");
		accountPage.clickSubmitPasswordButton(homePage);
		Assert.assertTrue(WebDriverSingleton.getWebDriverInstance().findElement(homePage.getEmailLoggedIcon()).isDisplayed(), "Logged icon is not displayed");
	}
	
	@Test(priority = 2)
	public void writeEmailToDrafts() {
		String to = "dimos-eskimos@yandex.ru";
		String subject = "Learn To Automate";
		String text = "Getting some knowledge";
		HomePage homePage = new HomePage();
		homePage.clickEmailButton();
		RightPanel rightPanel = new RightPanel();
		EmailPopUp emailPopUp = rightPanel.clickWriteEmailButton();
		emailPopUp.fillInToField(to);
		emailPopUp.fillInSubjectField(subject);
		emailPopUp.fillInTextboxField(text);
		emailPopUp.clickSaveCloseButton();
		DraftPage draftPage = rightPanel.clickDraftsButton();
		draftPage.refreshDraftPage();
		draftPage.openDraftURL();
		draftPage.refreshDraftPage();
		Assert.assertEquals(draftPage.getTextFromTopic(), subject);
	}
	
	@Test(priority = 3)
	public void checkTopicInDrafts() {
		DraftPage draftPage = new DraftPage();
		EmailPopUp emailPopUp = draftPage.clickTopicLink();
		Assert.assertEquals(emailPopUp.getToFieldText(), "dimos-eskimos@yandex.ru");
	}
	
	@Test(priority = 4)
	public void checksubjectInDrafts() {
		EmailPopUp emailPopUp = new EmailPopUp();
		Assert.assertEquals(emailPopUp.getSubjectFieldText(), "Learn To Automate");
	}
	
	@Test(priority = 5)
	public void checkTextboxInDrafts() {
		EmailPopUp emailPopUp = new EmailPopUp();
		Assert.assertEquals(emailPopUp.getTextboxText(), "Getting some knowledge");
	}
	
	@Test(priority = 6)
	public void sendEmailFromDrafts() {
		RightPanel rightPanel = new RightPanel();
		DraftPage draftPage = new DraftPage();
		draftPage.clickSendEmailButton();
		draftPage.refreshDraftPage();
		Assert.assertEquals(rightPanel.getDraftsLocatorText(), "Черновики");
	}
	
	@Test(priority = 7)
	public void checkEmailIsSent() {
		String subject = "Learn To Automate";
		RightPanel rightPanel = new RightPanel();
		SentPage sentPage = rightPanel.clickSentButton();
		sentPage.clickSentEmail();
		Assert.assertEquals(sentPage.getTextFromEmailChain(), subject);
	}
	
	@Test(priority = 8)
	public void logOutFromAccount() {
		LoggedIconPopUp loggedIconPopUp = new LoggedIconPopUp();
		loggedIconPopUp.clickIconInsideEmail();
		loggedIconPopUp.clickExitButton();
		AccountPage accountPage = new AccountPage();
		Assert.assertEquals(accountPage.getTextFromPasswordField(), "");
	}
	
	@AfterClass(description = "TearDown")
	public void tearDown() {
		WebDriverSingleton.kill();
	}
}
