package ftm.automate.resource;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestResources {
	protected static WebDriver driver;
	protected static WebDriverWait wait;
	protected static ChromeOptions options;
	protected static Actions actions;

	@BeforeClass(description = "Start browser")
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\Java\\Drivers\\chromedriver.exe");
		options = new ChromeOptions();
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, 10);
		driver.get("https://www.google.com");
	}
	
	@AfterClass
	public static void tearDown() {
		driver.quit();
	}
}
