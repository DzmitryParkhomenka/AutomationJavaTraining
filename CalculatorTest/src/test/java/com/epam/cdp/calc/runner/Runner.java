package com.epam.cdp.calc.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;

public class Runner {
	
	public static void main(String[] args) {
		TestNG testNg = new TestNG();
		
		XmlSuite xmlSuite = new XmlSuite();
		xmlSuite.setSuiteFiles(Arrays.asList("./src/test/source/TestNG.xml"));
		
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(xmlSuite);
		
		testNg.setXmlSuites(suites);
		testNg.run();
	}
}
