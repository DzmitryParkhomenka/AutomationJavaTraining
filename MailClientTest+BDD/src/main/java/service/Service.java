package service;

import org.testng.Assert;

import businessobject.User;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import page.AccountPage;
import page.EmailPopUp;
import page.HomePage;
import page.LoggedIconPopUp;
import page.SentPage;
import util.Refresher;
import webdriver.WebDriverSingleton;

public class Service {
	@Given("I open Google page")
	public static AccountPage openHomePage() {
		HomePage homePage = new HomePage().openPage();
		AccountPage accountPage = homePage.clickEnterEmailButton();
		return accountPage;
	}
	
	@And("I fill in login and password fields")
	public static AccountPage loginToGoogleAccount() {
		HomePage homePage = new HomePage();
		AccountPage accountPage = new AccountPage();
		accountPage.fillInEmailField(new User()).clickSubmitEmailButton().fillInPasswordField(new User()).clickSubmitPasswordButton(homePage);
		return accountPage;
	}
	
	@Then("I check that login was successfull")
	public static void checkLoginIsSuccessfull() {
		HomePage homePage = new HomePage(); 
		Assert.assertTrue(WebDriverSingleton.getWebDriverInstance().findElement(homePage.getEmailLoggedIcon()).isDisplayed(), "Logged icon is not displayed");
	}
	
	@Given("I open dialog to send email")
	public static EmailPopUp openEmailPopUp() {
		EmailPopUp emailPopUp = new HomePage().clickEmailButton().clickWriteEmailButton();
		return emailPopUp;
	}
	
	@And("^I fill in \"([^\"]*)\" field, \"([^\"]*)\" field, \"([^\"]*)\" field and sent Email$")
	public static void fillInAllFieldsAndSendEmail(String to, String subject, String textbox) {
		new EmailPopUp().fillInToField(to).fillInSubjectField(subject).fillInTextboxField(textbox).clickSendButton();
	}
		
	@And("I open Sent Page to check that email was sent")
	public static void openSentPage() {
		SentPage sentPage = new SentPage();
		sentPage.openPage();
		new Refresher().refreshPage();
	}
	
	@Then("^I check that email was sent and has correct \"([^\"]*)\"$")
	public static void checkThatEmailWasSent(String subject) {
		Assert.assertEquals(new SentPage().getTextFromEmailChain(), subject);
	}
	
	@Given("I log out from Google Account")
	public static void logOutFromEmailAccout() {
		new LoggedIconPopUp().clickIconInsideEmail().clickExitButton();
	}
	
	@Then("I check that logout was succesfull")
	public static void checkThatLogoutWasSuccessfull() {
		Assert.assertEquals(new AccountPage().getTextFromPasswordField(), "");
	}
}
