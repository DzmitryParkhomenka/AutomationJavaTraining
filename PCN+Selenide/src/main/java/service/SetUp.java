package service;

import com.codeborne.selenide.Configuration;

public class SetUp {
	public static void setUpChrome() {
		Configuration.timeout = 6000;
		Configuration.browser = "chrome";
		Configuration.holdBrowserOpen = true;
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\Drivers\\chromedriver.exe");
	}
}
