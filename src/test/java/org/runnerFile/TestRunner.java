package org.runnerFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/org/FeaturesFile",
		glue = {"org/stepDefFiles","org/applicationHooks"},
		monochrome = true,
		dryRun = false,
		plugin = {"pretty",
				"html:Report/html_report.html",
				"json:Report/html_report.json",
				"junit:Report/html_report.xml"
		}
		)

public class TestRunner {

	
}
