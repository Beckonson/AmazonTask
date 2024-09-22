package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.CommonMethods;

public class Hooks extends CommonMethods {
    @Before
    //this method will always execute before every scenario
    //because it has before tag which is pre-condition
    public void start() {
        openBrowserAndLaunchApplication();
    }

    @After
    public void end(Scenario scenario) {
        byte[] pic;

        closeBrowser();
    }
}

