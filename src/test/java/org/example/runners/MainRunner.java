package org.example.runners;

import org.junit.runner.RunWith;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions (
        features = {"/Users/timmanas/ProgrammingProjects/Java/BaseBoilerPlateWebUIAutomation/CucumberFramework/src/test/java/CucumberFramework/featureFiles"},
        glue = {"org.example.steps"},
        monochrome = true,
        tags = "",
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        }
)

// UnComment this when running with TestNG
//public class MainRunner extends AbstractTestNGCucumberTests {
//}

// Uncomment htis when running with JUnit
public class MainRunner {
}

