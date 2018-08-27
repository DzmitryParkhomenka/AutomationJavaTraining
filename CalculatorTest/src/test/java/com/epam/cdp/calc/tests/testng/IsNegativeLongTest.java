package com.epam.cdp.calc.tests.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.cdp.calc.TestResourcesTestNG;

public class IsNegativeLongTest extends TestResourcesTestNG{
	
	@Test(dataProvider = "valuesForNegativeLong")
	public void isNegativeTestLong(long a, boolean expectedResult) {
		boolean result = calculator.isNegative(a);
		Assert.assertEquals(result, expectedResult, a + " is positive");
	}
		
	@DataProvider(name = "valuesForNegativeLong")
	public Object[][] valuesForNegativeLong(){
		return new Object[][] {
			{1, false},
			{-1, true},
			{0, false},
		};
	}
}
