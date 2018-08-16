package learn.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	public static void userLoginToPCNCreateTool(WebDriver driver, WebDriverWait wait) throws InterruptedException {
		WebElement loginInput = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#i0116.form-control.ltr_override")));
		loginInput.sendKeys("dzmitry_parkhomenka@epam.com");
				
		WebElement clickNext = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='btn btn-block btn-primary']")));
		jsMethods.jsClick(clickNext);
			
		//These are for login from home
		/*WebElement passwordInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='password']")));
		passwordInput.sendKeys("Jkmrfghbdtn35");
						
		WebElement submitPassword = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='submitButton']")));
		jsMethods.jsClick(submitPassword);
				
		WebElement noButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='idBtn_Back']")));
		jsMethods.jsClick(noButton);*/
	}
}
