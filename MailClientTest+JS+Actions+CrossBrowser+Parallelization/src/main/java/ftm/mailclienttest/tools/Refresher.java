package ftm.mailclienttest.tools;

import org.openqa.selenium.WebDriver;

import ftm.mailclienttest.abstractpage.AbstractPage;

public class Refresher extends AbstractPage{	
	public Refresher(WebDriver driver) {
		super(driver);
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
