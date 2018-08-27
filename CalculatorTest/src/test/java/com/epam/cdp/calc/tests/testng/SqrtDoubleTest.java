package com.epam.cdp.calc.tests.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.cdp.calc.TestResourcesTestNG;

public class SqrtDoubleTest extends TestResourcesTestNG{

	@Test(dataProvider = "valuesForSqrtDouble")
	public void sqrtTestDouble(double a, double expectedResult) {
		double result = calculator.sqrt(a);
		Assert.assertEquals(result, expectedResult, "Sqrt result is incorrect.");
	}
		
	@DataProvider(name = "valuesForSqrtDouble")
	public Object[][] valuesForSqrtDouble(){
		return new Object[][] {
			{4.0, 2.0},
			{-4.0, 0.0},		
			{0.0, 0.0},			
			{13.0, 3.605551275463989},
		};
	}
}
