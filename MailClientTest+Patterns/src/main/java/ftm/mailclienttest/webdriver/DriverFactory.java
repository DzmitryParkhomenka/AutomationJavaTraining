package ftm.mailclienttest.webdriver;

import org.openqa.selenium.WebDriver;

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
