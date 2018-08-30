package ftm.mailclienttest.factory;

import org.openqa.selenium.WebDriver;

import ftm.mailclienttest.webdriver.ChromeDriver;
import ftm.mailclienttest.webdriver.FirefoxDriver;

public class DriverFactory {
	public static WebDriver getDriver(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			return ChromeDriver.getWebDriverInstance();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			return FirefoxDriver.getWebDriverInstance();
		}
		return null;
	}
}
