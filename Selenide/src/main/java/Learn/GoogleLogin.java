package Learn;

import org.testng.annotations.Test;

import BusinessObject.Email;
import BusinessObject.User;
import Pages.AccountPage;
import Pages.EmailPopUp;
import Pages.HomePage;
import Pages.LeftPanel;
import Pages.LoggedIconPopUp;

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
