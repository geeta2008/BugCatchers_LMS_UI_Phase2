package testrunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
	  plugin = {"pretty",
			    "html:target/Cucumber.html",
      		    "rerun:target/failedrerun.txt"},
	  monochrome=true, 
	  publish=true,
	  //tags = "@feature01",
	  features = {"src/test/resources/features/User"}, 
	  glue= {"stepdefinition","AppHooks"})

public class MyTestRunner extends AbstractTestNGCucumberTests{

}
