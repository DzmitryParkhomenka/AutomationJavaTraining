package main;

public class Service {
	public static void login() {
		LoginPage loginPage = new LoginPage();
		loginPage.openGooglePage();
		loginPage.clickEmailButton();
		loginPage.fillInLoginField();
		loginPage.clickSubmitEmailButton();
		loginPage.fillInPasswordfield();
		loginPage.clickSubmitPasswordButton();
	}
	
	public static String getIconAttribute() {
		return new LoginPage().getTextFromIconElement();
	}
}
