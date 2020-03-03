package com.cucumber.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//To run the test, run via the command below:
//mvn clean install -Dcucumber.options="--tags <Tag you want to run>"
//Runner to execute all Cucumber features
@RunWith(Cucumber.class)
@CucumberOptions(
      features = {"src/test/resources/Features"}, //feature file path
      glue = {"com/cucumber/lambdastepdefinition","com/cucumber/helpers"}, //step definition package
      plugin = {"html:target/testresults/html", //test results as html
              "json:target/testresults/cucumber.json", //test results as json
              "junit:target/testresults/cucumber.xml", //test results as junit xml
              "pretty"}) 
public class FeatureRunnerTest {
	// leave this blank
}