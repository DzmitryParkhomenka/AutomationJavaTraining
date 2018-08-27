package com.epam.cdp.calc.tests.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.cdp.calc.TestResourcesTestNG;

public class SumLongTest extends TestResourcesTestNG{
	
	@Test(dataProvider = "valuesForSumLong")
	public void sumTestLong(long a, long b, long expectedResult) {
		long result = calculator.sum(a, b);
		Assert.assertEquals(result, expectedResult, "Sum result is incorrect.");
	}
		
	@DataProvider(name = "valuesForSumLong")
	public Object[][] valuesForSumLong(){
		return new Object[][] {
			{1, 2, 3},
			{0, 0, 0},
			{-1, 1, 0},
			{-1, -1, -2},
			{-0, -0, 0},
		};
	}
}
