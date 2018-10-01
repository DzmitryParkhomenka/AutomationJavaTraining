package testscenario;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import businessobject.Email;
import service.Service;
import webdriver.WebDriverSingleton;

public class MailClientTest {

	@Test(priority = 1)
	public void login() {
		Service.openHomePage();
		Service.loginToGoogleAccount();
		Service.checkLoginIsSuccessfull();
	}

	@Test(priority = 2)
	public void sendEmail() {
		Service.openEmailPopUp();
		Service.fillInAllFieldsAndSendEmail(Email.getTo(), Email.getSubject(), Email.getText());
		Service.openSentPage();
		Service.checkThatEmailWasSent(Email.getSubject());
	}
	
	@Test(priority = 3)
	public void logOutFromAccount() {
		Service.logOutFromEmailAccout();
		Service.checkThatLogoutWasSuccessfull();
	}

	@AfterClass(description = "TearDown")
	public void tearDown() {
		WebDriverSingleton.kill();
	}
}
