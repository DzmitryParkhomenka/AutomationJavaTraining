package com.epam.cdp.calc.tests.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.cdp.calc.TestResourcesTestNG;

import junit.framework.Assert;

public class DivDoubleTest extends TestResourcesTestNG{
	
	@Test(dataProvider = "valuesForDivDouble")
	public void divTestDouble(double a, double b, double expectedResult) {
		double result = calculator.div(a, b);
		Assert.assertEquals("Div result is incorrect.", result, expectedResult);
	}
	
	@DataProvider(name = "valuesForDivDouble")
	public Object[][] valuesForDivDouble(){
		double x = Double.NaN;
		return new Object[][] {
			{2.0, 2.0, 1.0},
			{-2.0, -2.0, 1.0},
			{0.0, 0.0, x},
			{-5.0, 2.0, -2.5},
			{5.0, -2.0, -2.5},
		};
	}
}
