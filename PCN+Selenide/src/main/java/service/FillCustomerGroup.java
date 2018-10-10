package service;

import module.CustomerGroup;

public class FillCustomerGroup {
	public static void fillCustomerGroup() {
		CustomerGroup.chooseNewCustomerGroup();
		CustomerGroup.fillCustomerGroupField();
	}
}
