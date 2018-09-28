package ftm.mailclienttest.webdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverInit {
	
    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();

    public static WebDriver getDriver(String browser) throws MalformedURLException {
        if(webDriver.get() == null){
            webDriver.set(getRemDriver(browser));
        }
        return webDriver.get();
    }
	
	public static RemoteWebDriver getRemDriver(String browser) throws MalformedURLException {
		//return new RemoteWebDriver(new URL("http://192.168.100.6:4444/wd/hub"), getBrowserCapabilities(browser));
		return new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), getBrowserCapabilities(browser));
	}

	private static DesiredCapabilities getBrowserCapabilities(String browserType) {
		switch (browserType) {
		case "firefox":
			System.out.println("Opening firefox driver");
			return DesiredCapabilities.firefox();
		case "chrome":
			System.out.println("Opening chrome driver");
			return DesiredCapabilities.chrome();
		case "IE":
			System.out.println("Opening IE driver");
			return DesiredCapabilities.internetExplorer();
		default:
			System.out.println("browser : " + browserType + " is invalid, Launching Firefox as browser of choice..");
			return DesiredCapabilities.firefox();
		}
	}
	
}
