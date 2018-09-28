package factory;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestTest {
	
	@Test
	public void test() {
		WebDriverCreator webDriverCreator = new ChromeDriverCreator();
		WebDriver driver = webDriverCreator.createWebDriver();
		driver.navigate().to("http:www.tut.by/");
		driver.quit();
	}
}
