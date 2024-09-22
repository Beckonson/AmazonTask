package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        //features to provise the path of the feature files
        features = "src/test/resources/features/AddToCart.feature",

        // glue use to find step definition
        glue = "steps",
        dryRun =false,
        tags = "@smoke3",
        plugin = {"pretty"}
)
public class RunnerClass {

}
