package service;

import module.PlexCustomerDetails;

public class FillPlexCustomerDetails {
	public static void fillPlexCustomerDetails() {
		PlexCustomerDetails.fillADCDField();
		//PlexCustomerDetails.fillCurrencyField();
		PlexCustomerDetails.fillCultureField();
		PlexCustomerDetails.fillTimeZoneField();
	}
}
