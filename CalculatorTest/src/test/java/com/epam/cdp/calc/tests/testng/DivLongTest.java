package com.epam.cdp.calc.tests.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.cdp.calc.TestResourcesTestNG;

import junit.framework.Assert;

public class DivLongTest extends TestResourcesTestNG{
	
	@Test(dataProvider = "valuesForDivLong")
	public void divTestLong(long a, long b, long expectedResult) {
		long result = calculator.div(a, b);
		Assert.assertEquals("Div result is incorrect.", result, expectedResult);
	}
	
	@DataProvider(name = "valuesForDivLong")
	public Object[][] valuesForDivLong(){
		return new Object[][] {
			{2, 2, 1},
			{-2, -2, 1},
			{0, 0, 0},
			{-5, 2, -2},
			{5, -2, -2},
		};
	}
}
