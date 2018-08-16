package learn.automation;

public class WebDriverHelloWorld extends TestResources{
	public static void main(String[] args) throws InterruptedException {
		setUp();
		Login.userLoginToPCNCreateTool(driver, wait);
		
		FirstPCNFillIn.fillInFirstPCN(driver, wait, actions, customerCodeName, waitLess, waitLong);
		OtherPCNFillIn.fillInOtherPCN(driver, wait, actions, customerCodeName, waitLess, waitLong);
		//tearDown(driver);
	}
}
