package com.epam.cdp.calc.tests.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.cdp.calc.TestResourcesTestNG;

import junit.framework.Assert;

public class CosDoubleTest extends TestResourcesTestNG{
	
	@Test(dataProvider = "valuesForCosDouble")
	public void cosTestDouble(double a, double expectedResult) {
		double result = calculator.cos(a);
		Assert.assertEquals("Cos result is incorrect", expectedResult, result);
	}
	
	@DataProvider(name = "valuesForCosDouble")
	public Object[][] valuesForCosDouble(){
		return new Object[][] {
			{0.0, 1.0},
			{30.0, 0.15425145},
			{45.0, 0.52532199},
			{60.0, -0.95241298},
			{90.0, -0.44807362},
		};
	}
}
