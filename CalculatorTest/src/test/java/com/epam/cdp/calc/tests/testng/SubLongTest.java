package com.epam.cdp.calc.tests.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.cdp.calc.TestResourcesTestNG;

public class SubLongTest extends TestResourcesTestNG{

	@Test(dataProvider = "valuesForSubLong")
	public void subTestLong(long a, long b, long expectedResult) {
		long result = calculator.sub(a, b);
		Assert.assertEquals(result, expectedResult, "Sub result is incorrect.");
	}
		
	@DataProvider(name = "valuesForSubLong")
	public Object[][] valuesForSubLong(){
		return new Object[][] {
			{5, 2, 3},
			{0, 0, 0},
			{-5, 2, -7},
			{5, -2, 7},
			{-5, -2, -3},
		};
	}
}
