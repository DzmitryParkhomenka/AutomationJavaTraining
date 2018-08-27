package com.epam.cdp.calc.parallelrun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;

public class ParallelRunTwo {
	public static void main(String[] args) {
		TestNG testNg = new TestNG();
		
		XmlSuite xmlSuite = new XmlSuite();
		XmlSuite xmlSuite2 = new XmlSuite();
		//xmlSuite.setName("TmpSuite");
		xmlSuite.setSuiteFiles(Arrays.asList("./src/test/source/TestNG.xml"));
		xmlSuite2.setSuiteFiles(Arrays.asList("./src/test/source/ParallelRun.xml"));
		

		xmlSuite.setParallel(XmlSuite.ParallelMode.METHODS);
		xmlSuite.setThreadCount(4);

		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(xmlSuite);
		suites.add(xmlSuite2);
		
		testNg.setXmlSuites(suites);
		testNg.run();
	}
}