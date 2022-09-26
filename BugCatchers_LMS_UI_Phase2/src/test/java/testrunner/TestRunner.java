package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\kiran_9zu7s3k\\git\\BugCatchers_LMS_UI_Phase2\\BugCatchers_LMS_UI_Phase2\\src\\test\\resources\\features\\Batch\\"},
		glue = {"stepdefinition","AppHooks"},
		plugin = {"pretty"
				 },
		monochrome=true , //display the console output in a readable format
		dryRun = false, //to check the mapping is proper between feature file and step definition file
	    publish=true
		)
public class TestRunner {

}
