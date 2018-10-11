package service;

import com.codeborne.selenide.Configuration;

public class SetUp {
	public static void setUpChrome() {
		Configuration.browser = "chrome";
		Configuration.holdBrowserOpen = true;
		System.setProperty("webdriver.chrome.driver", "E:\\Java\\Drivers\\chromedriver.exe");
	}
}
