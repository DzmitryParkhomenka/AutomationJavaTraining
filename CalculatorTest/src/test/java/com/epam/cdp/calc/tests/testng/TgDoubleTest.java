package com.epam.cdp.calc.tests.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.cdp.calc.TestResourcesTestNG;

import junit.framework.Assert;

public class TgDoubleTest extends TestResourcesTestNG{
	
	@Test(dataProvider = "valuesForTgDouble")
	public void tgTestDouble(double a, double expectedResult) {
		double result = calculator.tg(a);
		Assert.assertEquals("Tg result is incorrect", expectedResult, result);
	}
	
	@DataProvider(name = "valuesForTgDouble")
	public Object[][] valuesForTgDouble(){
		return new Object[][] {
			{0.0, 0.0},
			{30.0, -6.4053312},
			{45.0, 1.61977519},
			{60.0, 0.32004039},
			{90.0, -1.99520041},
		};
	}
}
