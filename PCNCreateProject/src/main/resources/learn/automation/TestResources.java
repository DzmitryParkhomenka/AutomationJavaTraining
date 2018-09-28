package learn.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestResources {
	protected static int waitLess = 300;
	protected static int waitLong = 2000;
	protected static WebDriver driver;
	protected static WebDriverWait wait;
	protected static ChromeOptions options;
	protected static Actions actions;
	protected static String customerCodeName = "TestPCN";

	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\Java\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, 10);
		driver.get("https://dev-pcn-mgmt.plexdev.io/pcn-create/new");
	}

	public static void tearDown(WebDriver driver) {
		driver.close();
	}
}
