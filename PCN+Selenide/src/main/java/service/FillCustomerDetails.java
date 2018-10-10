package service;

import module.CustomerDetails;

public class FillCustomerDetails {
<<<<<<< HEAD
	public static void fill() {
=======
	public static void fillCustomerDetails() {
>>>>>>> 6f00147a643c539532a1b1e592bff76333aed522
		CustomerDetails.chooseNewCustomer();
		CustomerDetails.fillCustomerCodeField();
		CustomerDetails.fillCustomerNameField();
		CustomerDetails.clickStatusButton();
		CustomerDetails.fillDropdown();
		CustomerDetails.clickRegionButton();
		CustomerDetails.fillDropdown();
	}
}
