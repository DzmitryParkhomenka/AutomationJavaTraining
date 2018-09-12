package Finger.Training.Service;

import Finger.Training.Page.LoginPage;

public class Service {
	public static void openGoogleSite() {
		LoginPage loginPage = new LoginPage();
		loginPage.openGooglePage();
	}
	
	public static void logIn() {
		LoginPage loginPage = new LoginPage();
		loginPage.clickEmailButton();
		loginPage.fillInLoginField();
		loginPage.clickSubmitEmailButton();
		loginPage.fillInPasswordfield();
		loginPage.clickSubmitPasswordButton();
	}
	
	public static String getTextFromEmailIcon() {
		LoginPage loginPage = new LoginPage();
		return loginPage.getTextFromIconElement();
	}
}
