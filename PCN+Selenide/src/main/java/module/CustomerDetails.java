package module;

import java.util.List;
import org.openqa.selenium.By;
import com.codeborne.selenide.SelenideElement;
import bo.PCN;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Condition.visible;

public class CustomerDetails {
	private static final By NEW_CUSTOMER_RADIO_BUTTON = By.xpath("(//input[@name='customer'])[1]");
	private static final By EXISTING_CUSTOMER_RADIO_BUTTON = By.xpath("(//input[@name='customer'])[2]");
	private static final By CUSTOMER_CODE_FIELD = By.xpath("//input[@placeholder='Type Customer Code']");
	private static final By CUSTOMER_NAME_FIELD = By.xpath("//input[@placeholder='Type Customer Name']");
	private static final By DROPDOWN = By.xpath("//li[@role='option']");
	private static final By STATUS_BUTTON = By
			.xpath("(//div[@class='MuiSelect-select-286 MuiSelect-selectMenu-287 MuiInput-input-279'])[1]");
	private static final By REGION_BUTTON = By
			.xpath("(//div[@class='MuiSelect-select-286 MuiSelect-selectMenu-287 MuiInput-input-279'])[3]");

	public static void chooseNewCustomer() {
		if ($(NEW_CUSTOMER_RADIO_BUTTON).isSelected()) {
		} else {
			$(NEW_CUSTOMER_RADIO_BUTTON).click();
		}
	}

	public static void chooseExistingCustomer() {
		$(EXISTING_CUSTOMER_RADIO_BUTTON).click();
	}

	public static void fillCustomerCodeField() {
		$(CUSTOMER_CODE_FIELD).shouldBe(visible).sendKeys(PCN.getCustomerCode());
	}

	public static void fillCustomerNameField() {
		$(CUSTOMER_NAME_FIELD).shouldBe(visible).sendKeys(PCN.getCustomerName());
	}

	public static void clickStatusButton() {
		$(STATUS_BUTTON).shouldBe(visible).click();
	}

	public static void clickRegionButton() {
		$(REGION_BUTTON).shouldBe(visible).click();
	}

	public static void fillDropdown() {
		List<SelenideElement> dropdownElements = $$(DROPDOWN);
		dropdownElements.get(5).click();
	}
}
