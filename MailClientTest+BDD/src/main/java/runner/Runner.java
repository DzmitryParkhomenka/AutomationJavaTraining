package runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;

public class Runner {

	public static void main(String[] args) {
		TestNG tng = new TestNG();
		XmlSuite suite = new XmlSuite();
		suite.setName("Test");
		
		List<String> files = new ArrayList<>();
		files.addAll(new ArrayList<String>() {
			{
				add("./src/main/java/Test.xml");
			}
		});
		
		suite.setSuiteFiles(files);
		List<XmlSuite> suites = new ArrayList<>();
		suites.add(suite);
		tng.setXmlSuites(suites);
		
		tng.run();
	}
}
