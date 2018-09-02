package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class Runner {
	@CucumberOptions(features = { "src/main/java/source" },
			glue = { "service" }
			)

	public class CucumberTestNGTest extends AbstractTestNGCucumberTests {
	}

}
