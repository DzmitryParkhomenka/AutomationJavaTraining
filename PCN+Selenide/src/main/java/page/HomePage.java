package page;

import static com.codeborne.selenide.Selenide.open;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.visible;

public class HomePage {
	private static final String URL = "https://dev-pcn-mgmt.plexdev.io/pcn-create/new";
	private static final By SAVE_BUTTON = By.xpath("//button[@class='MuiButtonBase-root-59 MuiButton-root-121 MuiButton-raised-126 MuiButton-raisedSecondary-129']");
	
	public static void openPCNCreatePage() {
		open(URL);
	}
	
	public static void clickSaveButton() {
		$(SAVE_BUTTON).shouldBe(visible).click();
	}
}
