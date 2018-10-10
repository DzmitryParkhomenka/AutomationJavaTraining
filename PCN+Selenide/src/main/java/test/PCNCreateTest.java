package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import service.FillCustomerDetails;
<<<<<<< HEAD
<<<<<<< HEAD
=======
import service.FillCustomerGroup;
import service.FillPlexCustomerDetails;
>>>>>>> 6f00147a643c539532a1b1e592bff76333aed522
=======
import service.FillCustomerGroup;
import service.FillPlexCustomerDetails;
>>>>>>> 6f00147a643c539532a1b1e592bff76333aed522
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
<<<<<<< HEAD
<<<<<<< HEAD
		FillCustomerDetails.fill();
=======
		//FillCustomerDetails.fillCustomerDetails();
		//FillCustomerGroup.fillCustomerGroup();
		FillPlexCustomerDetails.fillPlexCustomerDetails();
>>>>>>> 6f00147a643c539532a1b1e592bff76333aed522
=======
		//FillCustomerDetails.fillCustomerDetails();
		//FillCustomerGroup.fillCustomerGroup();
		FillPlexCustomerDetails.fillPlexCustomerDetails();
>>>>>>> 6f00147a643c539532a1b1e592bff76333aed522
	}

}
