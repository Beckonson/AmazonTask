package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features/Search.feature",
        //features = "src/test/resources/features/",

        // glue use to find step definition
        glue = "steps",
        dryRun =false,
        tags = "@smoke or @smoke1 or @smoke2",
        plugin = {"pretty"}
)
public class RunnerClass {

}
