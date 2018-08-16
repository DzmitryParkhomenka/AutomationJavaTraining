package test.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SearchResultPage;
import pages.WebDriverSingleton;
import pages.YoutubeVideoPage;

public class AppTest {
	@Test(priority = 1)
	public void openUrl() {
		new HomePage().openURL();
	}

	@Test(priority = 2)
	public void enterTextToSearchField() {
		new HomePage().sendKeysToInputField("Banana Song").clickSearchButton();
	}

	@Test(priority = 3)
	public void clickSearchResult() {
		new SearchResultPage().clickYoutubeLink();
	}

	@Test(priority = 4)
	public void checkViewsCounter() {
		Long watchCounter = new YoutubeVideoPage().getTextFromCounter();
		Assert.assertTrue(watchCounter > 50000000, "Video was watched lesser than 50mln");
	}

	@Test(priority = 5)
	public void checkThatWeOnYoutubePage() {
		Assert.assertEquals(new YoutubeVideoPage().getPageTitle(),
				"Despicable Me 2 | Minions Banana Song (2013) SNSD TTS - YouTube");
	}

	@Test(priority = 6)
	public void closeDriver() {
		WebDriverSingleton.kill();
	}
}