package org.example.runners;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) // Comment this out for testng

@CucumberOptions (
        features = {"/Users/timmanas/ProgrammingProjects/Java/BaseBoilerPlateWebUIAutomation/CucumberFramework/src/test/java/CucumberFramework/featureFiles/"},
        glue = {"org.example.steps"},
        monochrome = true,
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        }
)

// Uncomment htis when running with JUnit
public class MainRunner {

}

//// UnComment this when running with TestNG
//public class MainRunner extends AbstractTestNGCucumberTests {
//}



