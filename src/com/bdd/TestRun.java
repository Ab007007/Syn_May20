package com.bdd;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/feature", //location of feature files
		glue= {"stepdefinition"}  // package name where StepDefinitions are imiplemented
	//	,dryRun = true
		)
public class TestRun {

	
}
