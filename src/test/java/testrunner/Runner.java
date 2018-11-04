package testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Jatin on 11/4/2018.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features"
        ,glue={"stepdefinitions"},
        plugin = {"json:target/cucumber-report/cucumber.json"},
        monochrome = true

)
public class Runner {
}
