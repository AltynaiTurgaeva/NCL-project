package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumberreports", "json: target/report.json"},
        features = "src/test/Resources/Features/FindCruise.feature",
        glue = "Steps",
        tags = "@test",
        dryRun = false


)
public class Runner {

}
