package ftm.mailclienttest.pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import popages.AccountPage;
import popages.DraftPage;
import popages.EmailPopUp;
import popages.HomePage;
import popages.LoggedIconPopUp;
import popages.RightPanel;
import popages.SentPage;

public class PageObjectMailClientTest {
	private WebDriver driver;
	
	@BeforeClass(description = "Start Browser")
	private void initBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Java\\Java basics\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void login() {
		HomePage homePage = new HomePage(driver);
		homePage.openPage();
		AccountPage accountPage = homePage.clickEnterEmailButton();
		accountPage.fillInEmailField("dimos.eskimos@gmail.com");
		accountPage.clickSubmitEmailButton();
		accountPage.fillInPasswordField("Jkmrfghbdtn20");
		accountPage.clickSubmitPasswordButton(homePage);
		Assert.assertTrue(driver.findElement(homePage.getEmailLoggedIcon()).isDisplayed(), "Logged icon is not displayed");
	}
	
	@Test(priority = 2)
	public void writeEmailToDrafts() {
		String to = "dimos-eskimos@yandex.ru";
		String subject = "Learn To Automate";
		String text = "Getting some knowledge";
		HomePage homePage = new HomePage(driver);
		homePage.clickEmailButton();
		RightPanel rightPanel = new RightPanel(driver);
		EmailPopUp emailPopUp = rightPanel.clickWriteEmailButton();
		emailPopUp.fillInToField(to);
		emailPopUp.fillInSubjectField(subject);
		emailPopUp.fillInTextboxField(text);
		emailPopUp.clickSaveCloseButton();
		DraftPage draftPage = rightPanel.clickDraftsButton();
		draftPage.refreshDraftPage();
		driver.switchTo().alert().accept();
		draftPage.openDraftURL();
		draftPage.refreshDraftPage();
		Assert.assertEquals(draftPage.getTextFromTopic(), subject);
	}
	
	@Test(priority = 3)
	public void checkTopicInDrafts() {
		DraftPage draftPage = new DraftPage(driver);
		EmailPopUp emailPopUp = draftPage.clickTopicLink();
		Assert.assertEquals(emailPopUp.getToFieldText(), "dimos-eskimos@yandex.ru");
	}
	
	@Test(priority = 4)
	public void checksubjectInDrafts() {
		EmailPopUp emailPopUp = new EmailPopUp(driver);
		Assert.assertEquals(emailPopUp.getSubjectFieldText(), "Learn To Automate");
	}
	
	@Test(priority = 5)
	public void checkTextboxInDrafts() {
		EmailPopUp emailPopUp = new EmailPopUp(driver);
		Assert.assertEquals(emailPopUp.getTextboxText(), "Getting some knowledge");
	}
	
	@Test(priority = 6)
	public void sendEmailFromDrafts() {
		RightPanel rightPanel = new RightPanel(driver);
		DraftPage draftPage = new DraftPage(driver);
		draftPage.clickSendEmailButton();
		draftPage.refreshDraftPage();
		driver.switchTo().alert().accept();
		Assert.assertEquals(rightPanel.getDraftsLocatorText(), "Черновики");
	}
	
	@Test(priority = 7)
	public void checkEmailIsSent() {
		String subject = "Learn To Automate";
		RightPanel rightPanel = new RightPanel(driver);
		SentPage sentPage = rightPanel.clickSentButton();
		sentPage.clickSentEmail();
		Assert.assertEquals(sentPage.getTextFromEmailChain(), subject);
	}
	
	@Test(priority = 8)
	public void logOutFromAccount() {
		HomePage homePage = new HomePage(driver);
		LoggedIconPopUp loggedIconPopUp = homePage.clickEmailLoggedIcon();
		loggedIconPopUp.clickExitButton();
		AccountPage accountPage = new AccountPage(driver);
		Assert.assertEquals(accountPage.getTextFromPasswordField(), "");
	}
	
	@AfterClass(description = "TearDown")
	public void tearDown() {
		driver.quit();
	}
}
