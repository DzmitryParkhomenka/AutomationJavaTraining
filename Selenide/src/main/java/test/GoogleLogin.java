package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.codeborne.selenide.Configuration;

import page.AccountPage;
import page.EmailPopUp;
import page.HomePage;
import page.LeftPanel;
import page.LoggedIconPopUp;;

public class GoogleLogin {
	@BeforeClass
	public void setUp() {
		Configuration.browser="marionette";
		System.setProperty("webdriver.gecko.driver", "E:\\Java\\Drivers\\geckodriver.exe");
	}
	
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
