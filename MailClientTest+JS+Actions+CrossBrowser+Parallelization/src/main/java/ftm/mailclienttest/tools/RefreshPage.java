package ftm.mailclienttest.tools;

import org.openqa.selenium.WebDriver;

import ftm.mailclienttest.pages.AbstractPage;

public class RefreshPage extends AbstractPage{	
	public RefreshPage(WebDriver driver) {
		super(driver);
	}

	public void refreshDraftPage() {
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
