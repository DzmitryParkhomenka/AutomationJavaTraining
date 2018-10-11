package service;

import page.HomePage;
import page.LoginPage;

public class Login {
	public static void loginToMSAccount() {
		HomePage.openPCNCreatePage();
		LoginPage.inputEmailIntoField();
		LoginPage.inputPasswordIntoField();
		LoginPage.clickNoButton();
	}
}
