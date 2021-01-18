package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "json:target/cucumber.json" },
        glue = {"steps","services"},
        features = "src/test/resources/features",
        tags = {"@regress"}
)

public class RunnerTest {


    private final Logger log = Logger.getLogger(this.getClass());
}