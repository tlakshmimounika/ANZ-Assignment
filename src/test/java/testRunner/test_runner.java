package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features=".//Features/test.feature",
		glue="stepDefinitions",
		//dryRun=true,
		monochrome=true,
		plugin= {"pretty","html:test-output"}
		
		
		
		)
public class test_runner {

}
