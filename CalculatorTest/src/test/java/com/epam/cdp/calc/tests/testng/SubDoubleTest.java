package com.epam.cdp.calc.tests.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.cdp.calc.TestResourcesTestNG;

public class SubDoubleTest extends TestResourcesTestNG{

	@Test(dataProvider = "valuesForSubDouble")
	public void subTestDouble(double a, double b, double expectedResult) {
		double result = calculator.sub(a, b);
		Assert.assertEquals(result, expectedResult, "Sub result is incorrect.");
	}
		
	@DataProvider(name = "valuesForSubDouble")
	public Object[][] valuesForSubDouble(){
		return new Object[][] {
			{5.0, 2.0, 3.0},
			{0.0, 0.0, 0.0},
			{3.1, 1.5, 1.6},
			{-5.0, 2.0, -7.0},
			{5.0, -2.0, 7.0},
			{-5.0, -2.0, -3.0},
		};
	}
}
