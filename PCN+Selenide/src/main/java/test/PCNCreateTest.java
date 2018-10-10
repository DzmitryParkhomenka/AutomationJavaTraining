package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import service.FillCustomerDetails;
import service.Login;
import service.SetUp;

public class PCNCreateTest {
	
	@BeforeClass
	public void setUp() {
		SetUp.setUpChrome();
		Login.loginToMSAccount();
	}
		
	@Test
	public static void openPCNPage() {
		FillCustomerDetails.fill();
	}
}
