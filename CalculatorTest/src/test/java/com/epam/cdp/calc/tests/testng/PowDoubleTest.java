package com.epam.cdp.calc.tests.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.cdp.calc.TestResourcesTestNG;

public class PowDoubleTest extends TestResourcesTestNG{
	
	@Test(dataProvider = "valuesForPowDouble")
	public void powTestDouble(double a, double b, double expectedResult) {
		double result = calculator.pow(a, b);
		Assert.assertEquals(result, expectedResult, "Pow result is incorrect.");
	}
		
	@DataProvider(name = "valuesForPowDouble")
	public Object[][] valuesForPowDouble(){
		return new Object[][] {
			{2.0, 2.0, 4.0},			
			{10.0, 10.0, 10000000000.0},			
			{-2.0, 2.0, 4.0},
			{2.0, -2.0, 0.25},
			{3.0, 3.0, 27.0},
			{0.0, 0.0, 1.0},
		};
	}
}
