package com.cydeo.runner;

// This class has only one purpose
//Instructing how and what feature we want to run
// where are the step definitions

//do we want to just generate missing step definitions
//@CucumberOptions(dryRun=true)will run the test without failing for missing steps
//so you can copy al the missing steps if there is any
// do we want to get Json, html report
//do we want to filter the test run according to certain tags


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
                    glue = "com/cydeo/step_definitions",
                    plugin = {"html:@target/cucumber.html"},
                    dryRun = false
                //  tags="@wip"
)
public class TestRunner {

}
