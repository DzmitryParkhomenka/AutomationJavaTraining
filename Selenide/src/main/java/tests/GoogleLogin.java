package tests;

import org.testng.annotations.Test;

import businessObject.Email;
import businessObject.User;
import pages.AccountPage;
import pages.EmailPopUp;
import pages.HomePage;
import pages.LeftPanel;
import pages.LoggedIconPopUp;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.visible;;

public class GoogleLogin {
	@Test(priority = 1)
	public void useLoginToGoogle() {
		open(HomePage.getHomePageUrl());
		$(HomePage.getEnterEmailButtonLocator()).click();
		$(AccountPage.getEmailFieldLocator()).setValue(User.getLogin());
		$(AccountPage.getSubmitEmailButtonLocator()).click();
		$(AccountPage.getPasswordFieldLocator()).setValue(User.getPassword());
		$(AccountPage.getSubmitPasswordButtonLocator()).click();
	}
	
	@Test(priority = 2)
	public void userSendEmail() {
		$(HomePage.getEmailButtonLocator()).click();
		$(LeftPanel.getWriteEmailButtonLocator()).click();
		$(EmailPopUp.getToFieldLocator()).setValue(Email.getTo());
		$(EmailPopUp.getSubjectFieldLocator()).setValue(Email.getSubject());
		$(EmailPopUp.getTextboxFieldLocator()).setValue(Email.getText());
		$(EmailPopUp.getSendButtonLocator()).click();
		$(EmailPopUp.getSendPopUpLocator()).shouldBe(visible);
	}
	
	@Test(priority = 3)
	public void userLogOutFromEmailAccount() {
		$(LoggedIconPopUp.getEmailLoggedLocator()).click();
		$(LoggedIconPopUp.getExitButtonLocator()).click();
		$(AccountPage.getPasswordFieldLocator()).shouldBe(visible);
	}
}
