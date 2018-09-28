package ftm.mailclienttest.tool;

import org.openqa.selenium.WebDriver;

public class Refresher {	
	protected WebDriver driver;
	public Refresher(WebDriver driver) {
		this.driver = driver;
	}

	public void refreshPage() {
		driver.navigate().refresh();
		if (checkAlert() == true) {
			driver.switchTo().alert().accept();
		}
	}
	
	public boolean checkAlert() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
