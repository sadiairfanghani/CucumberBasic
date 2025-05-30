package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // it has the path of feature directory/file
        features = "src/test/resources/Features/",
        // the name of the package where step definition are available
        glue = "Steps",
        // it stops actual execution when set to true and scans all the steps
        // also it provides missing step, definition
        // to start the execution, set the value of dry run to false
        dryRun = false,
        tags = "@sprint2",

        plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json"}

)
public class TestRunner {

}
