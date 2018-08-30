package ftm.mailclienttest.util;

import org.openqa.selenium.WebDriver;

public class Refresher {			
	public void refreshPage(WebDriver driver) {
		driver.navigate().refresh();
		if (checkAlert(driver) == true) {
			driver.switchTo().alert().accept();
		}
	}
	
	public boolean checkAlert(WebDriver driver) {
		try {
			driver.switchTo().alert();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
