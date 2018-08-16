package test.source.source;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSingleton {
	private static WebDriver driver;
	
	private WebDriverSingleton() {
	}
	
	public static WebDriver getWebDriverInstance() {
		if (driver != null) {
			return driver;
		}
		return driver = init();
	}

	private static WebDriver init() {
		System.setProperty("webdriver.chrome.driver", "F:\\JAVA\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
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
