package testRunner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src/test/java/scenarios", glue = "stepDefinitions", 
				
			monochrome=true, plugin= {"pretty", "html:target/cucumber-reports"},
					tags= "@Check_Amazon_Pay_Balance"	

		
		)
public class TestRunner extends AbstractTestNGCucumberTests {

}
