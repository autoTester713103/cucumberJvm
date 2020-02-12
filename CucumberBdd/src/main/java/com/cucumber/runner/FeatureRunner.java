package com.cucumber.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


//Runner to execute all Cucumber features
@RunWith(Cucumber.class)
@CucumberOptions(
      //tags = {"@ComponentA, @BigFunctionalArea, @FunctionPoint1, @sample"}, //run tagged features at all levels
      tags = {"@test3"}, //run a single scenario while developing or troubleshooting
      features = {"src/test/resources/Features"}, //feature file path
      glue = {"com/cucumber/stepdefinition","com/cucumber/helpers"}, //step definition package
      plugin = {"html:target/testresults/html", //test results as html
              "json:target/testresults/cucumber.json", //test results as json
              "junit:target/testresults/cucumber.xml"}) //test results as junit xml
public class FeatureRunner {
	// leave this blank
}