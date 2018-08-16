package ftm.automate.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import ftm.automate.resource.TestResources;
import ftm.automate.resource.jsMethods;

public class Login extends TestResources{
	
	@Test(priority = 1)
	public static void clickEnterEmailButton() {
		WebElement enterButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@target='_top']")));
		Assert.assertTrue(enterButton.isDisplayed(), "Enter Email button is not displayed");
		enterButton.click();	
	}
	
	@Test(priority = 2)
	public static void sendKeysToEmailField() {
		WebElement emailField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='email']")));
		Assert.assertTrue(emailField.isDisplayed(), "Email field is not displayed");
		emailField.sendKeys("dimos.eskimos@gmail.com");
	}
	
	@Test(priority = 3)
	public static void clickSubmitEmailButton() {
		WebElement submitEmailButton = driver.findElement(By.xpath("//div[@id='identifierNext']"));
		Assert.assertTrue(submitEmailButton.isDisplayed(), "Submit Email button is not available");
		jsMethods.jsClick(submitEmailButton);
	}
	
	@Test(priority = 4)
	public static void sendKeysToPasswordField() {
		WebElement passwordField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']")));
		Assert.assertTrue(passwordField.isDisplayed(), "Password field is not displayed");
		passwordField.sendKeys("Jkmrfghbdtn20");
	}
	
	@Test(priority = 5)
	public static void clickSubmitPasswordButton() {
		WebElement submitPasswordButton = driver.findElement(By.xpath("//div[@id='passwordNext']"));
		Assert.assertTrue(submitPasswordButton.isDisplayed(), "Submit Password button is not displayed");
		jsMethods.jsClick(submitPasswordButton);
	}
	
	@Test(priority = 6)
	public static void verifyLoginsuccessful() {
		WebElement accountButton = driver.findElement(By.xpath("//div[@class='gb_eb gb_7c gb_Ng gb_R']"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='gb_Db']")));
		Assert.assertTrue(accountButton.isDisplayed(), "Account button is not displayed");
	}
	
	@Test(priority = 7)
	public static void createNewEmail() {
		WebElement emailButton = driver.findElement(By.xpath("//a[@href='https://mail.google.com/mail/?tab=wm']"));
		jsMethods.jsClick(emailButton);
		
		WebElement writeEmailButton = driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")));
		writeEmailButton.click();
		
		WebElement recipientField = driver.findElement(By.xpath("//textarea[@name='to']"));
		recipientField.sendKeys("dimos-eskimos@yandex.ru");
		
		WebElement subjectBox = driver.findElement(By.xpath("//input[@name='subjectbox']"));
		subjectBox.sendKeys("Learn to automate");
		
		WebElement emailBodyField = driver.findElement(By.xpath("//div[@role='textbox']"));
		emailBodyField.sendKeys("Hi, learn to automate immediately");
		
		driver.get("https://mail.google.com/mail/u/0/#drafts");
		wait.until(ExpectedConditions.visibilityOf(writeEmailButton));
	}
	
	@Test(priority = 8)
	public static void verifyEmailIsInDraft() {	
		driver.navigate().refresh();
		driver.switchTo().alert().accept();
		WebElement draftsFolder = driver.findElement(By.xpath("//td[@class='yX xY ']"));
		jsMethods.jsClick(draftsFolder); 
	}
	
	@Test(priority = 9)
	public static void verifyDraftFieldsValues() {
		WebElement recipientFieldText = driver.findElement(By.xpath("//span[@email='dimos-eskimos@yandex.ru']"));
		Assert.assertEquals(recipientFieldText.getAttribute("email"), "dimos-eskimos@yandex.ru");
		
		WebElement subjectBox = driver.findElement(By.xpath("//input[@name='subject']"));
		Assert.assertEquals(subjectBox.getAttribute("value"), "Learn to automate");
		
		WebElement emailBodyField = driver.findElement(By.xpath("//div[@role='textbox']"));
		Assert.assertEquals(emailBodyField.getText(), "Hi, learn to automate immediately");
	}
	
	@Test(priority = 10)
	public static void sendDraftEmail() {
		WebElement emailBodyField = driver.findElement(By.xpath("//div[@role='textbox']"));
		String keysPressed =  Keys.chord(Keys.CONTROL, Keys.RETURN);
		emailBodyField.sendKeys(keysPressed);
	}
	
	@Test(priority = 11)
	public static void verifyEmailGoneFromDrafts() {
		driver.get("https://mail.google.com/mail/u/0/#drafts");
		driver.navigate().refresh();
		driver.switchTo().alert().accept();
		
		WebElement noDraftsMessage = driver.findElement(By.xpath("//a[@title='Черновики']"));
		Assert.assertEquals(noDraftsMessage.getText(), "Черновики");
	}
	
	@Test(priority = 12)
	public static void checkEmailIsInSent() {
		WebElement sentButton = driver.findElement(By.xpath("//a[@title='Отправленные']"));
		jsMethods.jsClick(sentButton);
		
		WebElement emailWasSent = driver.findElement(By.xpath("//span[@email='dimos-eskimos@yandex.ru']"));
		jsMethods.jsClick(emailWasSent);
		
		WebElement emailInSentBox = driver.findElement(By.xpath("//h2[@class='hP']"));
		Assert.assertEquals(emailInSentBox.getText(), "Learn to automate");
	}
	
	@Test(priority = 13)
	public static void logOut() {
		WebElement accountButton = driver.findElement(By.xpath("//div[@class='gb_eb gb_7c gb_Ng gb_R']"));
		jsMethods.jsClick(accountButton);
		
		WebElement logOutButton = driver.findElement(By.xpath("//a[@class='gb_za gb_Zf gb_6f gb_Ke gb_Eb']"));
		jsMethods.jsClick(logOutButton);
		
		driver.get("https://www.google.com");
		wait.until(ExpectedConditions.invisibilityOf(accountButton));
		WebElement enterButton = driver.findElement(By.xpath("//a[@target='_top']"));
		Assert.assertTrue(enterButton.isDisplayed());
	}
}
