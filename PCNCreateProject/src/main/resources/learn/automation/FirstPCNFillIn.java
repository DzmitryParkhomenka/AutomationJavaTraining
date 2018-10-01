package learn.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstPCNFillIn extends TestResources{
	public static void fillInFirstPCN(WebDriver driver, WebDriverWait wait, Actions actions, String customerCodeName, int a, int b) throws InterruptedException {
		Thread.sleep(2000);
		
		WebElement newCustomerRButton = driver.findElement(By.xpath("//input[@name='customer'][@value='new']"));
		newCustomerRButton.isSelected();
			
		WebElement customerCode = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Type Customer Code']")));
		customerCode.sendKeys(customerCodeName + "1");
		Thread.sleep(a);
		
		WebElement customerName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Type Customer Name']")));
		customerName.sendKeys(customerCodeName + "1");
		Thread.sleep(a);
		
		WebElement dropdownButton1 = driver.findElement(By.xpath("(//div[@class='MuiSelect-select-286 MuiSelect-selectMenu-287 MuiInput-input-279'])[1]"));
		jsMethods.jsClick(dropdownButton1);
		
		WebElement chooseStatus = driver.findElement(By.xpath("(//li[@role='option'])[2]"));
		jsMethods.jsClick(chooseStatus);
		Thread.sleep(a);
		
		WebElement dropdownButton2 = driver.findElement(By.xpath("(//div[@class='MuiSelect-select-286 MuiSelect-selectMenu-287 MuiInput-input-279'])[2]"));
		jsMethods.jsClick(dropdownButton2);
		Thread.sleep(a);
		
		WebElement chooseCustomerType = driver.findElement(By.xpath("(//li[@role='option'])[2]"));
		jsMethods.jsClick(chooseCustomerType);
		Thread.sleep(a);
		
		WebElement dropdownButton3 = driver.findElement(By.xpath("(//div[@class='MuiSelect-select-286 MuiSelect-selectMenu-287 MuiInput-input-279'])[3]"));
		jsMethods.jsClick(dropdownButton3);
		Thread.sleep(a);
		
		WebElement chooseRegion = driver.findElement(By.xpath("(//li[@role='option'])[1]"));
		jsMethods.jsClick(chooseRegion);
		Thread.sleep(b);
		
		WebElement customerGroup = driver.findElement(By.xpath("//input[@placeholder='Type Customer Group']"));
		customerGroup.sendKeys(customerCodeName);
		Thread.sleep(a);
		
		WebElement activeDirectory = driver.findElement(By.xpath("//input[@placeholder='Type Active Directory Company Code']"));
		activeDirectory.sendKeys(customerCodeName + "1");
		Thread.sleep(a);
		
		WebElement currencyField = driver.findElement(By.xpath("//input[@placeholder='Type Currency']"));
		currencyField.sendKeys("byn");
		Thread.sleep(b);
		currencyField.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(a);
		
		WebElement cultureField = driver.findElement(By.xpath("(//div[@class='MuiSelect-select-286 MuiSelect-selectMenu-287 MuiInput-input-279'])[5]"));
		jsMethods.jsClick(cultureField);
		Thread.sleep(a);
		
		WebElement chooseCulture = driver.findElement(By.xpath("(//li[@role='option'])[1]"));
		jsMethods.jsClick(chooseCulture);
		Thread.sleep(a);
		
		WebElement timezoneField = driver.findElement(By.xpath("(//div[@class='MuiSelect-select-286 MuiSelect-selectMenu-287 MuiInput-input-279'])[6]"));
		jsMethods.jsClick(timezoneField);
		Thread.sleep(a);
		
		WebElement chooseTimezone = driver.findElement(By.xpath("(//li[@role='option'])[2]"));
		jsMethods.jsClick(chooseTimezone);
		Thread.sleep(b);
		
		WebElement sourcePCNField = driver.findElement(By.xpath("//input[@placeholder='Type Source PCN']"));
		sourcePCNField.sendKeys("plex template auto-full");
		Thread.sleep(b);
		sourcePCNField.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(a);
				
		WebElement addOneMorePCN = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root-59 MuiButton-root-121 MuiButton-raised-126 MuiButton-fab-131 MuiButton-raisedSecondary-129 t-addButton-229']"));
		jsMethods.jsClick(addOneMorePCN);
		Thread.sleep(a);
	}
}
