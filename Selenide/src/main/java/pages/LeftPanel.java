package pages;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

public class LeftPanel {
	private static final By WRITE_EMAIL_BUTTON_LOCATOR = By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']");
	
	public static void clickWriteEmailButton() {
		$(WRITE_EMAIL_BUTTON_LOCATOR).click();
	}
	
}
