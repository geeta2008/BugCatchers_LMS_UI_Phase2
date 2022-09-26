package testrunner;


//import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(
	  plugin = {"pretty"},
	  monochrome=false, 
	  //tags = "@feature01",
	  features = {"src/test/resources/features/Batch/F08_AddBatch.feature"}, 
	  glue= {"stepdefinition","AppHooks"})

public class runner extends AbstractTestNGCucumberTests{

}