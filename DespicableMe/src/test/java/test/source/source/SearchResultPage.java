package test.source.source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends AbstractPage{
	
	@FindBy(xpath = "(//a[contains(text(),'Despicable Me')])[1]")
	private WebElement despicableMeYoutubeLink;
	
	public SearchResultPage() {
		super();
	}
	
	public YoutubeVideoPage clickYoutubeLink() {
		despicableMeYoutubeLink.click();
		return new YoutubeVideoPage();
	}

}
