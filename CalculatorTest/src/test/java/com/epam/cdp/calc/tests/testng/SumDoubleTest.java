package com.epam.cdp.calc.tests.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.cdp.calc.TestResourcesTestNG;

public class SumDoubleTest extends TestResourcesTestNG{
	
	@Test(dataProvider = "valuesForSumDouble")
	public void sumTestDouble(double a, double b, double expectedResult) {
		double result = calculator.sum(a, b);
		Assert.assertEquals(result, expectedResult, "Sum result is incorrect.");
	}
	
	@DataProvider(name = "valuesForSumDouble")
	public Object[][] valuesForSumDouble(){
		return new Object[][] {
			{1.0, 1.5, 2.5},
			{0.0, 0.0, 0.0},
			{-1.0, 2.5, 1.5},
			{-1.1, -1.1, -2.2},
			{-0.0, -0.0, 0.0},
		};
	}
}
