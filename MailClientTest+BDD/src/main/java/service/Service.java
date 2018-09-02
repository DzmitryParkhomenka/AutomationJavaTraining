package service;

import org.testng.Assert;

import businessobject.User;
import cucumber.api.java.en.Given;
import page.AccountPage;
import page.EmailPopUp;
import page.HomePage;
import page.LoggedIconPopUp;
import page.SentPage;
import util.Refresher;
import webdriver.WebDriverSingleton;

public class Service {
	@Given("I opened Google page")
	public static AccountPage openHomePage() {
		HomePage homePage = new HomePage().openPage();
		AccountPage accountPage = homePage.clickEnterEmailButton();
		return accountPage;
	}
	
	@Given("I fill in login and password fields")
	public static AccountPage loginToGoogleAccount() {
		HomePage homePage = new HomePage();
		AccountPage accountPage = new AccountPage();
		accountPage.fillInEmailField(new User()).clickSubmitEmailButton().fillInPasswordField(new User()).clickSubmitPasswordButton(homePage);
		return accountPage;
	}
	
	@Given("I checked that login was successfull")
	public static void checkLoginIsSuccessfull() {
		HomePage homePage = new HomePage(); 
		Assert.assertTrue(WebDriverSingleton.getWebDriverInstance().findElement(homePage.getEmailLoggedIcon()).isDisplayed(), "Logged icon is not displayed");
	}
	
	@Given("I opened dialog to send email")
	public static EmailPopUp openEmailPopUp() {
		EmailPopUp emailPopUp = new HomePage().clickEmailButton().clickWriteEmailButton();
		return emailPopUp;
	}
	
	@Given("I filled in ([^\"]) field, ([^\"]) field, ([^\"]) field and sent email")
	public static void fillInAllFieldsAndSendEmail(String to, String subject, String textbox) {
		new EmailPopUp().fillInToField(to).fillInSubjectField(subject).fillInTextboxField(textbox).clickSendButton();
	}
	
	@Given("I opened Sent Page to check that email was sent")
	public static void openSentPage() {
		SentPage sentPage = new SentPage();
		sentPage.openPage();
		new Refresher().refreshPage();
	}
	
	@Given("I checked that email was sent")
	public static void checkThatEmailWasSent(String subject) {
		Assert.assertEquals(new SentPage().getTextFromEmailChain(), subject);
	}
	
	@Given("I logged out from Google Account")
	public static void logOutFromEmailAccout() {
		new LoggedIconPopUp().clickIconInsideEmail().clickExitButton();
	}
	
	@Given("I checked that logout was succesfull")
	public static void checkThatLogoutWasSuccessfull() {
		Assert.assertEquals(new AccountPage().getTextFromPasswordField(), "");
	}
}
