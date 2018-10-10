package service;

import module.CustomerDetails;

public class FillCustomerDetails {
	public static void fill() {
		CustomerDetails.chooseNewCustomer();
		CustomerDetails.fillCustomerCodeField();
		CustomerDetails.fillCustomerNameField();
		CustomerDetails.clickStatusButton();
		CustomerDetails.fillDropdown();
		CustomerDetails.clickRegionButton();
		CustomerDetails.fillDropdown();
	}
}
