package com.epam.cdp.calc.tests.junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.epam.cdp.calc.TestResourcesJUnit;
import junit.framework.Assert;

@RunWith(Parameterized.class)
public class CosDoubleTest extends TestResourcesJUnit{
	private double a;
	private double expectedResult;
	
	public CosDoubleTest(double a, double expectedResult) {
		this.a = a;
		this.expectedResult = expectedResult;
	}
	
	@Parameterized.Parameters
	public static Collection valuesForCosDouble(){
		return Arrays.asList(new Object[][] {
			{0.0, 1.0},
			{30.0, 0.15425145},
			{45.0, 0.52532199},
			{60.0, -0.95241298},
			{90.0, -0.44807362},
		});
	}
	
	@Test
	public void cosDoubleTest() {
		double result = calculator.cos(a);
		Assert.assertEquals("Cos operation result is incorrect", result, expectedResult);
	}
}
