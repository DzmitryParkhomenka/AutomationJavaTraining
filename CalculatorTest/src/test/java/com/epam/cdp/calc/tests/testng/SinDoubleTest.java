package com.epam.cdp.calc.tests.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.cdp.calc.TestResourcesTestNG;

import junit.framework.Assert;

public class SinDoubleTest extends TestResourcesTestNG{
	
	@Test(dataProvider = "valuesForSinDouble")
	public void sinTestDouble(double a, double expectedResult) {
		double result = calculator.sin(a);
		Assert.assertEquals("Sin result is incorrect", expectedResult, result);
	}
	
	@DataProvider(name = "valuesForSinDouble")
	public Object[][] valuesForSinDouble(){
		return new Object[][] {
			{0.0, 0.0},
			{30.0, -0.9880316240928618},
			{45.0, 0.8509035245341184},
			{60.0, -0.3048106211022167},
			{90.0, 0.8939966636005579},
		};
	}
}
