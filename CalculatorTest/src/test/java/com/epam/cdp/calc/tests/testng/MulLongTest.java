package com.epam.cdp.calc.tests.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.cdp.calc.TestResourcesTestNG;

public class MulLongTest extends TestResourcesTestNG{
	
	@Test(dataProvider = "valuesForMulLong")
	public void mulTestLong(long a, long b, long expectedResult) {
		long result = calculator.mult(a, b);
		Assert.assertEquals(result, expectedResult, "Sum result is incorrect.");
	}
		
	@DataProvider(name = "valuesForMulLong")
	public Object[][] valuesForMulLong(){
		return new Object[][] {
			{2, 2, 4},
			{-2, 2, -4},
			{2, -2, -4},
			{-2, -2, 4},
			{0, 0, 0},
			{0, 2, 0},
			{2, 0, 0},
		};
	}
}
