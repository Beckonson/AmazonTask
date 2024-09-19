package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        //features to provise the path of the feature files
        features = "src/test/resources/features/Search.feature",

        // glue use to find step definition
        glue = "steps",
        dryRun = false
)
public class RunnerClass {

}
