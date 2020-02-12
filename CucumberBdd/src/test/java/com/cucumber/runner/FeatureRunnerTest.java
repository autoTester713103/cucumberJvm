package com.cucumber.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//To run the test, run via the comman below:
//mvn clean install -Dcucumber.options="--tags <Tag you want to run>"
//Runner to execute all Cucumber features
@RunWith(Cucumber.class)
@CucumberOptions(
      features = {"src/test/resources/Features"}, //feature file path
      glue = {"com/cucumber/stepdefinition","com/cucumber/helpers"}, //step definition package
      plugin = {"html:target/testresults/html", //test results as html
              "json:target/testresults/cucumber.json", //test results as json
              "junit:target/testresults/cucumber.xml"}) //test results as junit xml
public class FeatureRunnerTest {
	// leave this blank
}