package module;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import bo.PCN;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Condition.visible;

public class PlexCustomerDetails {
	private static final By ACTIVE_DIRECTORY_COMPANY_CODE_FIELD = By.xpath("//input[@placeholder='Type Active Directory Company Code']");
	private static final By CURRENCY_FIELD = By.xpath("//input[@placeholder='Type Currency']");
	private static final By CULTURE_BUTTON = By.xpath("//input[@name='cultureKey']/preceding-sibling::*");
	private static final By TIME_ZONE_BUTTON = By.xpath("//input[@name='timezoneKey']/preceding-sibling::*");
	private static final By DROPDOWN = By.xpath("//li[@role='option']");
	
	public static void fillADCDField() {
		$(ACTIVE_DIRECTORY_COMPANY_CODE_FIELD).sendKeys(PCN.getADCD());
	}
	
	public static void fillCurrencyField() {
		$(CURRENCY_FIELD).shouldBe(visible).sendKeys(PCN.getCurrency());
		$(CURRENCY_FIELD).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		$(CURRENCY_FIELD).attr("value");
	}
	
	public static void fillCultureField() {
		$(CULTURE_BUTTON).shouldBe(visible).click();
		fillDropdown();
	}
	
	public static void fillTimeZoneField() {
		$(TIME_ZONE_BUTTON).shouldBe(visible).click();
		fillDropdown();
	}
	
	public static void fillDropdown() {
		List<SelenideElement> dropdownElements = $$(DROPDOWN);
		dropdownElements.get(0).shouldBe(visible).click();
	}
}
