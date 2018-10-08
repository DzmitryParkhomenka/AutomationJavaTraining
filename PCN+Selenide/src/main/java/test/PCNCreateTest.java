package test;

import org.testng.annotations.Test;

import page.HomePage;

public class PCNCreateTest {
	
	@Test
	public static void openPCNPage() {
		HomePage.openPCNCreatePage();
	}
}
