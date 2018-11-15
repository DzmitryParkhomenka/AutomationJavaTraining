package page;

import static com.codeborne.selenide.Selenide.open;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.visible;

public class HomePage {
	private static final String URL = "https://dev-pcn-mgmt.plexdev.io/pcn-create/new";
	private static final By SAVE_BUTTON = By.xpath("//span[text()[contains(.,\"Save\")]]/parent::*");
	private static final By ADD_PCN_BUTTON = By.xpath("(//span[@class='MuiButton-label-122'])[2]/parent::*");

	public static void openPCNCreatePage() {
		open(URL);
	}

	public static void clickSaveButton() {
		$(SAVE_BUTTON).shouldBe(visible).click();
	}

	public static void clickAddPCNButton() {
		$(ADD_PCN_BUTTON).shouldBe(visible).click();
	}
}
