package module;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.visible;

public class PCNList {
	private static final By ADD_PCN_BUTTON = By
			.xpath("//button[@class='MuiButtonBase-root-59 MuiButton-root-121 MuiButton-raised-126 MuiButton-fab-131 MuiButton-raisedSecondary-129 t-addButton-229']");
	
	public static void addOneMorePCN() {
		$(ADD_PCN_BUTTON).shouldBe(visible).click();
	}
}
