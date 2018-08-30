package ftm.mailclienttest.actiontestpage;

import org.openqa.selenium.WebDriver;

public class ActionsPage extends MainPage{
	public ActionsPage(WebDriver driver) {
		super(driver);
	}

	public void switchToFrame() {
		driver.switchTo().frame(0);
	}
}
