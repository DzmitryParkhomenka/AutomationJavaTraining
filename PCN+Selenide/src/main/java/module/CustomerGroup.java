package module;

import org.openqa.selenium.By;
import bo.PCN;
import static com.codeborne.selenide.Selenide.$;

public class CustomerGroup {
	private static final By NEW_CUSTOMER_GROUP_RADIO_BUTTON = By.xpath("//input[@name='group'][@value='new']");
	private static final By EXISTING_CUSTOMER_GROUP_RADIO_BUTTON = By.xpath("//input[@name='group'][@value='existing']");
	private static final By CUSTOMER_GROUP_FIELD = By.xpath("//input[@placeholder='Type Customer Group']");

	public static void chooseNewCustomerGroup() {
		if (!$(NEW_CUSTOMER_GROUP_RADIO_BUTTON).isSelected()) {
			$(NEW_CUSTOMER_GROUP_RADIO_BUTTON).click();
		}
	}

	public static void chooseExistingCustomerGroup() {
		if ($(EXISTING_CUSTOMER_GROUP_RADIO_BUTTON).isSelected()) {
			$(EXISTING_CUSTOMER_GROUP_RADIO_BUTTON).click();
		}
	}

	public static void fillCustomerGroupField() {
		if ($(CUSTOMER_GROUP_FIELD).isEnabled()) {
			$(CUSTOMER_GROUP_FIELD).sendKeys(PCN.getCustomerGroup());
		}
	}
}
