package com.epam.cdp.calc.tests.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.cdp.calc.TestResourcesTestNG;

import junit.framework.Assert;

public class CtgDoubleTest extends TestResourcesTestNG{
	
	@Test(dataProvider = "valuesForCtgDouble")
	public void ctgTestDouble(double a, double expectedResult) {
		double result = calculator.ctg(a);
		Assert.assertEquals("Ctg result is incorrect", expectedResult, result);
	}
	
	@DataProvider(name = "valuesForCtgDouble")
	public Object[][] valuesForCtgDouble(){
		Double x = Double.NaN;
		return new Object[][] {
			{0.0, x},
			{30.0, -0.15611995},
			{45.0, 0.6174},
			{60.0, 3.1246},
			{90.0, -0.50120278},
		};
	}
}
