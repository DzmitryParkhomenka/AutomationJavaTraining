package ftm.mailclienttest.pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pfpages.AccountPage;
import pfpages.DraftPage;
import pfpages.EmailPopUp;
import pfpages.HomePage;
import pfpages.RightPanel;

public class PageFactoryMailClientTest {
	private WebDriver driver;
	
	@BeforeClass(description = "Start Browser")
	private void initBrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void login() {
		HomePage homePage = new HomePage(driver);
		homePage.openPage().clickEnterEmailButton().fillInEmailField("dimos.eskimos@gmail.com").clickSubmitEmailButton().fillInPasswordField("Jkmrfghbdtn20").clickSubmitPasswordButton(homePage);
		Assert.assertTrue(homePage.getEmailLoggedIcon().isDisplayed(), "Logged icon is not displayed");
	}
	
	@Test(priority = 2)
	public void writeEmailToDrafts() {
		String to = "dimos-eskimos@yandex.ru";
		String subject = "Learn To Automate";
		String text = "Getting some knowledge";
		new HomePage(driver).clickEmailButton();
		new RightPanel(driver).clickWriteEmailButton().fillInToField(to).fillInSubjectField(subject).fillInTextboxField(text).clickSaveCloseButton();
		DraftPage draftPage = new RightPanel(driver).clickDraftsButton().refreshDraftPage();
		driver.switchTo().alert().accept();
		draftPage.openDraftURL().refreshDraftPage();
		Assert.assertEquals(draftPage.getTextFromTopic(), subject);
	}
	
	@Test(priority = 3)
	public void checkTopicInDrafts() {
		Assert.assertEquals(new DraftPage(driver).clickTopicLink().getToFieldText(), "dimos-eskimos@yandex.ru");
	}
	
	@Test(priority = 4)
	public void checkSubjectInDrafts() {
		Assert.assertEquals(new EmailPopUp(driver).getSubjectFieldText(), "Learn To Automate");
	}
	
	@Test(priority = 5)
	public void checkTextboxInDrafts() {
		Assert.assertEquals(new EmailPopUp(driver).getTextboxText(), "Getting some knowledge");
	}
	
	@Test(priority = 6)
	public void sendEmailFromDrafts() {
		new DraftPage(driver).clickSendEmailButton().refreshDraftPage();
		driver.switchTo().alert().accept();
		Assert.assertEquals(new RightPanel(driver).getDraftsLocatorText(), "Черновики");
	}
	
	@Test(priority = 7)
	public void checkEmailIsSent() {
		String subject = "Learn To Automate";
		Assert.assertEquals(new RightPanel(driver).clickSentButton().clickSentEmail().getTextFromEmailChain(), subject);
	}
	
	@Test(priority = 8)
	public void logOutFromAccount() {
		new HomePage(driver).clickEmailLoggedIcon().clickExitButton();
		Assert.assertEquals(new AccountPage(driver).getTextFromPasswordField(), "");
	}
	
	@AfterClass(description = "TearDown")
	public void tearDown() {
		driver.quit();
	}
}
