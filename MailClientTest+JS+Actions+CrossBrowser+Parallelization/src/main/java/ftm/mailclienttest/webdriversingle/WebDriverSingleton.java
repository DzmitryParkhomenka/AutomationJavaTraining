package ftm.mailclienttest.webdriversingle;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverSingleton {
	private static WebDriver driver;
	private static String browser;

	private WebDriverSingleton() {
	}

	public static String setBrowserString(String browserName) {
		return browser = browserName;
	}

	public static WebDriver getWebDriverInstance() {
		if (driver != null) {
			return driver;
		}
		return driver = init();
	}

	private static WebDriver init() {
		driver = null;
		if (browser.equalsIgnoreCase("firefox")) {
			try {
				driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), DesiredCapabilities.firefox());
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		} else if (browser.equalsIgnoreCase("chrome")) {
			try {
				driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), DesiredCapabilities.chrome());
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}	
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

	public static void kill() {
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
