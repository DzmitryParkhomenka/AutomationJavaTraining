package ftm.mailclienttest.webdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirefoxDriver {

	private static WebDriver driver;

	private FirefoxDriver() {
	}

	public static WebDriver getWebDriverInstance() {
		if (driver != null) {
			return driver;
		}
		return driver = init();
	}

	private static WebDriver init() {
		WebDriver driver = null;
		try {
			driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), DesiredCapabilities.firefox());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return driver;
	}

	public void kill() {
		if (driver != null) {
			try {
				driver.quit();
			} catch (Exception e) {
				System.out.println("Cannot kill browser");
			} finally {
				driver = null;
			}
		}
	}
}
