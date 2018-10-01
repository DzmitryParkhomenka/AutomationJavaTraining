package main;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TestClass {
	
	@Test
	public void login() {
		Service.login();
		Assert.assertEquals(Service.getIconAttribute(), "Аккаунт Google: Baram Bomka  " + "\n" + "(dimos.eskimos@gmail.com)");
	}
	
	@AfterClass
	public void kill() {
		WebDriverSingleton.kill();
	}
}
