package com.epam.cdp.calc.tests.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.cdp.calc.TestResourcesTestNG;

public class IsPositiveLongTest extends TestResourcesTestNG{
	
	@Test(dataProvider = "valuesForPositiveLong")
	public void isPositiveTestLong(long a, boolean expectedResult) {
		boolean result = calculator.isPositive(a);
		Assert.assertEquals(result, expectedResult, a + " is negative");
	}
		
	@DataProvider(name = "valuesForPositiveLong")
	public Object[][] valuesForPositiveLong(){
		return new Object[][] {
			{1, true},
			{-1, false},
			{0, false},
		};
	}
}
