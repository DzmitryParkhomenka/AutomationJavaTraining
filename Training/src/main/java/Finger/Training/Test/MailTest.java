package Finger.Training.Test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Finger.Training.Service.Service;
import Finger.Training.WebDriverSingleton.WebDriverSingleton;

public class MailTest {
	
	@BeforeClass
	public void openSite() {
		Service.openGoogleSite();
	}
	
	@Test
	public void checkLogin() {
		Service.logIn();
		Assert.assertEquals(Service.getTextFromEmailIcon(),"Аккаунт Google: Baram Bomka  " + "\n" + "(dimos.eskimos@gmail.com)");
	}
	
	@AfterClass
	public void closeBrowser() {
		WebDriverSingleton.kill();
	}
}
