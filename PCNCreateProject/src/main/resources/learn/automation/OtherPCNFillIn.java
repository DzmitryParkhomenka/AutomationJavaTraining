package learn.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OtherPCNFillIn {
	
	public static void fillInOtherPCN(WebDriver driver, WebDriverWait wait, Actions actions, String customerCodeName, int a, int b) throws InterruptedException {
		for (int i = 2; i < 11; i++) {	
			WebElement newCustomerRButton = driver.findElement(By.xpath("//input[@name='customer'][@value='new']"));
			newCustomerRButton.isSelected();
				
			WebElement customerCode = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Type Customer Code']")));
			customerCode.sendKeys(customerCodeName + i);
			Thread.sleep(a);
			
			WebElement customerName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Type Customer Name']")));
			customerName.sendKeys(customerCodeName + i);
			Thread.sleep(a);
			
			WebElement dropdownButton1 = driver.findElement(By.xpath("(//div[@class='MuiSelect-select-285 MuiSelect-selectMenu-286 MuiInput-input-278'])[1]"));
			jsMethods.jsClick(dropdownButton1);
			
			WebElement chooseStatus = driver.findElement(By.xpath("(//li[@role='option'])[2]"));
			jsMethods.jsClick(chooseStatus);
			Thread.sleep(a);
			
			WebElement dropdownButton2 = driver.findElement(By.xpath("(//div[@class='MuiSelect-select-285 MuiSelect-selectMenu-286 MuiInput-input-278'])[2]"));
			jsMethods.jsClick(dropdownButton2);
			Thread.sleep(a);
			
			WebElement chooseCustomerType = driver.findElement(By.xpath("(//li[@role='option'])[2]"));
			jsMethods.jsClick(chooseCustomerType);
			Thread.sleep(a);
			
			WebElement dropdownButton3 = driver.findElement(By.xpath("(//div[@class='MuiSelect-select-285 MuiSelect-selectMenu-286 MuiInput-input-278'])[3]"));
			jsMethods.jsClick(dropdownButton3);
			Thread.sleep(a);
			
			WebElement chooseRegion = driver.findElement(By.xpath("(//li[@role='option'])[1]"));
			jsMethods.jsClick(chooseRegion);
			Thread.sleep(b);
			
			WebElement activeDirectory = driver.findElement(By.xpath("//input[@placeholder='Type Active Directory Company Code']"));
			activeDirectory.sendKeys(customerCodeName + i);
			Thread.sleep(a);
			
			WebElement currencyField = driver.findElement(By.xpath("//input[@placeholder='Type Currency']"));
			currencyField.sendKeys("byn");
			Thread.sleep(b);
			currencyField.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
			Thread.sleep(a);
			
			WebElement cultureField = driver.findElement(By.xpath("(//div[@class='MuiSelect-select-285 MuiSelect-selectMenu-286 MuiInput-input-278'])[4]"));
			jsMethods.jsClick(cultureField);
			Thread.sleep(a);
			
			WebElement chooseCulture = driver.findElement(By.xpath("(//li[@role='option'])[1]"));
			jsMethods.jsClick(chooseCulture);
			Thread.sleep(a);
			
			WebElement timezoneField = driver.findElement(By.xpath("(//div[@class='MuiSelect-select-285 MuiSelect-selectMenu-286 MuiInput-input-278'])[5]"));
			jsMethods.jsClick(timezoneField);
			Thread.sleep(a);
			
			WebElement chooseTimezone = driver.findElement(By.xpath("(//li[@role='option'])[2]"));
			jsMethods.jsClick(chooseTimezone);
			Thread.sleep(b);
						
			WebElement sourcePCNField = driver.findElement(By.xpath("//input[@placeholder='Type Source PCN']"));
			String selectAll = Keys.chord(Keys.CONTROL, "a");
			sourcePCNField.sendKeys(selectAll);
			Thread.sleep(a);
			sourcePCNField.sendKeys(Keys.DELETE);
			Thread.sleep(a);
			sourcePCNField.sendKeys("plex template auto-full");
			Thread.sleep(b);
			sourcePCNField.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
			Thread.sleep(a);
			
			WebElement addOneMorePCN = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root-59 MuiButton-root-120 MuiButton-raised-125 MuiButton-fab-130 MuiButton-raisedSecondary-128 t-addButton-228']"));
			jsMethods.jsClick(addOneMorePCN);
			Thread.sleep(a);
		}
	}

}
