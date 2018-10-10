package service;

import module.CustomerDetails;

public class FillCustomerDetails {
	public static void fillCustomerDetails() {
		CustomerDetails.chooseNewCustomer();
		CustomerDetails.fillCustomerCodeField();
		CustomerDetails.fillCustomerNameField();
		CustomerDetails.clickStatusButton();
		CustomerDetails.clickRegionButton();
	}
}
