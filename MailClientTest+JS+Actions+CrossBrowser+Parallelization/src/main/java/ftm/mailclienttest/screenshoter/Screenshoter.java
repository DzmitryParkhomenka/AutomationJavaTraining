package ftm.mailclienttest.screenshoter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Screenshoter {
    private static final String SCREENSHOTS_NAME_TPL = "screenshots/src";

    public static void takeScreenshot(WebDriver driver) {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            String screenshotName = SCREENSHOTS_NAME_TPL + System.nanoTime();
            File copy = new File(screenshotName + ".png");
            FileHandler.copy(screenshot, copy);
            System.out.println("Saved screenshot: " + screenshotName);
        } catch (IOException e) {
            System.out.println("Failed to make screenshot");
        }
    }
}
