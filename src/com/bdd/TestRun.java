package com.bdd;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/feature",
		glue= {"stepdefinition"}
	//	,dryRun = true
		)
public class TestRun {

	
}
