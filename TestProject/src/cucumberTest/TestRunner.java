package cucumberTest;

import org.junit.runner.RunWith;
import org.junit.runner.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", glue = { "stepDefinition" }, tags = { "@tag1" }

)

public class TestRunner {

}
