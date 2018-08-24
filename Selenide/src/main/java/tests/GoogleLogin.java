package tests;

import org.testng.annotations.Test;

import pages.AccountPage;
import pages.EmailPopUp;
import pages.HomePage;
import pages.LeftPanel;
import pages.LoggedIconPopUp;;

public class GoogleLogin {
	@Test(priority = 1)
	public void useLoginToGoogle() {
		HomePage.openUrl();
		HomePage.clickEnterEmailButton();
		AccountPage.setValueToEmailField();
		AccountPage.clickSubmitEmailButton();
		AccountPage.setValueToPasswordField();
		AccountPage.clickSubmitPasswordButton();
	}
	
	@Test(priority = 2)
	public void userSendEmail() {
		HomePage.clickEmailButton();
		LeftPanel.clickWriteEmailButton();
		EmailPopUp.setValueToToEmailField();
		EmailPopUp.setValueToSubjectField();
		EmailPopUp.setValueToTextField();
		EmailPopUp.clickSendButton();
		EmailPopUp.checkSendPopUpVisible();
	}
	
	@Test(priority = 3)
	public void userLogOutFromEmailAccount() {
		LoggedIconPopUp.clickLoggedEmailIcon();
		LoggedIconPopUp.clickExitButton();
		AccountPage.checkPasswordFieldVisible();
	}
}
