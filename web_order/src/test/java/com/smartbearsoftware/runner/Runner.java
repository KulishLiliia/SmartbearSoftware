package com.smartbearsoftware.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.smartbearsoftware.utilities.CommonStep;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(
		plugin= {
				"html:target/cucumber_report",
				"rerun:target/rerun.txt"
				
		},
		features = {"src/test/resources/Features"},
		glue = {"com.smartbearsoftware.steps"}
		,tags= {}
//		,dryRun = true
		
			
		)
public class Runner extends CommonStep{
	@AfterClass
	public static void after() {
		closeDriver();
	}

}
