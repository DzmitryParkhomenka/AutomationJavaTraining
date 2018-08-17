package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YoutubeVideoPage extends AbstractPage{
	private static final String YOUTUBE_URL = "https://www.youtube.com";
	
	@FindBy(xpath = "//span[@class='view-count style-scope yt-view-count-renderer']")
	private WebElement counterElement;
	
	public YoutubeVideoPage() {
		super();
	}
	
	public YoutubeVideoPage openURL() {
		driver.get(YOUTUBE_URL);
		return new YoutubeVideoPage();
	}

	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public Long getTextFromCounter() {
		String pattern = "(\\s)";
		String pattern2 = "(\\,)";
		String a = counterElement.getText().substring(0, 10).replaceAll(pattern, "").replaceAll(pattern2, "");
		return Long.parseLong(a);
	}
	
}
