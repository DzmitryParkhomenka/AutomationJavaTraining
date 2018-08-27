package com.epam.cdp.calc;

import org.junit.After;
import org.junit.Before;

import com.epam.tat.module4.Calculator;

public class TestResourcesJUnit {

	protected Calculator calculator;

	@Before
	public void setUp() {
		calculator = new Calculator();
	}

	@After
	public void tearDown() {
		calculator = null;
	}
}
