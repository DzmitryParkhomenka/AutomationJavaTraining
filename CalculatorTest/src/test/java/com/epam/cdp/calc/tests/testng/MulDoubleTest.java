package com.epam.cdp.calc.tests.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.cdp.calc.TestResourcesTestNG;

public class MulDoubleTest extends TestResourcesTestNG{

	@Test(dataProvider = "valuesForMulDouble")
	public void mulTestLong(double a, double b, double expectedResult) {
		double result = calculator.mult(a, b);
		Assert.assertEquals(result, expectedResult, "Mul result is incorrect.");
	}
		
	@DataProvider(name = "valuesForMulDouble")
	public Object[][] valuesForMulDouble(){
		return new Object[][] {
			{2.0, 2.0, 4.0},
			{2.1, 2.1, 4.41},
			{2.5, 2.5,  6.25},
			{3.6, 3.6, 12,96},
			{-2.0, 2.0, -4.0},
			{2.0, -2.0, -4.0},
			{-2.0, -2.0, 4.0},
			{0.0, 0.0, 0.0},
			{0.0, 2.0, 0.0},
			{2.0, 0.0, 0.0},
		};
	}
}
