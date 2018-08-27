package com.epam.cdp.calc.parallelrun;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.cdp.calc.TestResourcesTestNG;
import junit.framework.Assert;

public class ParallelRun extends TestResourcesTestNG{
	
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
	
	@Test(dataProvider = "valuesForDivLong")
	public void divTestLong(long a, long b, long expectedResult) {
		long result = calculator.div(a, b);
		Assert.assertEquals("Div result is incorrect.", result, expectedResult);
	}
	
	@DataProvider(name = "valuesForDivLong")
	public Object[][] valuesForDivLong(){
		return new Object[][] {
			{2, 2, 1},
			{-2, -2, 1},
			{0, 0, 0},
			{-5, 2, -2},
			{5, -2, -2},
		};
	}
	
	@Test(dataProvider = "valuesForNegativeLong")
	public void isNegativeTestLong(long a, boolean expectedResult) {
		boolean result = calculator.isNegative(a);
		Assert.assertEquals(a + " is positive", result, expectedResult);
	}
		
	@DataProvider(name = "valuesForNegativeLong")
	public Object[][] valuesForNegativeLong(){
		return new Object[][] {
			{1, false},
			{-1, true},
			{0, false},
		};
	}
	
	@Test(dataProvider = "valuesForPositiveLong")
	public void isPositiveTestLong(long a, boolean expectedResult) {
		boolean result = calculator.isPositive(a);
		Assert.assertEquals(a + " is negative", result, expectedResult);
	}
		
	@DataProvider(name = "valuesForPositiveLong")
	public Object[][] valuesForPositiveLong(){
		return new Object[][] {
			{1, true},
			{-1, false},
			{0, false},
		};
	}
	
	@Test(dataProvider = "valuesForMulDouble")
	public void mulTestLong(double a, double b, double expectedResult) {
		double result = calculator.mult(a, b);
		Assert.assertEquals("Mul result is incorrect.", result, expectedResult);
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
	
	@Test(dataProvider = "valuesForMulLong")
	public void mulTestLong(long a, long b, long expectedResult) {
		long result = calculator.mult(a, b);
		Assert.assertEquals("Sum result is incorrect.", result, expectedResult);
	}
		
	@DataProvider(name = "valuesForMulLong")
	public Object[][] valuesForMulLong(){
		return new Object[][] {
			{2, 2, 4},
			{-2, 2, -4},
			{2, -2, -4},
			{-2, -2, 4},
			{0, 0, 0},
			{0, 2, 0},
			{2, 0, 0},
		};
	}
	
	@Test(dataProvider = "valuesForPowDouble")
	public void powTestDouble(double a, double b, double expectedResult) {
		double result = calculator.pow(a, b);
		Assert.assertEquals("Pow result is incorrect.", result, expectedResult);
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
	
	@Test(dataProvider = "valuesForSqrtDouble")
	public void sqrtTestDouble(double a, double expectedResult) {
		double result = calculator.sqrt(a);
		Assert.assertEquals("Sqrt result is incorrect.", result, expectedResult);
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
	
	@Test(dataProvider = "valuesForSubDouble")
	public void subTestDouble(double a, double b, double expectedResult) {
		double result = calculator.sub(a, b);
		Assert.assertEquals("Sub result is incorrect.", result, expectedResult);
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
	
	@Test(dataProvider = "valuesForSubLong")
	public void subTestLong(long a, long b, long expectedResult) {
		long result = calculator.sub(a, b);
		Assert.assertEquals("Sub result is incorrect.", result, expectedResult);
	}
		
	@DataProvider(name = "valuesForSubLong")
	public Object[][] valuesForSubLong(){
		return new Object[][] {
			{5, 2, 3},
			{0, 0, 0},
			{-5, 2, -7},
			{5, -2, 7},
			{-5, -2, -3},
		};
	}
	
	@Test(dataProvider = "valuesForSumDouble")
	public void sumTestDouble(double a, double b, double expectedResult) {
		double result = calculator.sum(a, b);
		Assert.assertEquals("Sum result is incorrect.", result, expectedResult);
	}
	
	@DataProvider(name = "valuesForSumDouble")
	public Object[][] valuesForSumDouble(){
		return new Object[][] {
			{1.0, 1.5, 2.5},
			{0.0, 0.0, 0.0},
			{-1.0, 2.5, 1.5},
			{-1.1, -1.1, -2.2},
			{-0.0, -0.0, 0.0},
		};
	}
	
	@Test(dataProvider = "valuesForSumLong")
	public void sumTestLong(long a, long b, long expectedResult) {
		long result = calculator.sum(a, b);
		Assert.assertEquals("Sum result is incorrect.", result, expectedResult);
	}
		
	@DataProvider(name = "valuesForSumLong")
	public Object[][] valuesForSumLong(){
		return new Object[][] {
			{1, 2, 3},
			{0, 0, 0},
			{-1, 1, 0},
			{-1, -1, -2},
			{-0, -0, 0},
		};
	}
	
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
