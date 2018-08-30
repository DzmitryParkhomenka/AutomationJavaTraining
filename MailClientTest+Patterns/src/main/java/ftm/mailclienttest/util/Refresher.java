package ftm.mailclienttest.util;

import ftm.mailclienttest.webdriver.WebDriverSingleton;

public class Refresher {	
	public void refreshPage() {
		WebDriverSingleton.getWebDriverInstance().navigate().refresh();
		if (checkAlert() == true) {
			WebDriverSingleton.getWebDriverInstance().switchTo().alert().accept();
		}
	}
	
	public boolean checkAlert() {
		try {
			WebDriverSingleton.getWebDriverInstance().switchTo().alert();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
