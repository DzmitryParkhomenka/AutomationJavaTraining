package service;

import cucumber.api.java.After;
import webdriver.WebDriverSingleton;

public class CucumberHook {
	@After
	public static void closeDriver() {
		WebDriverSingleton.kill();
	}
}
