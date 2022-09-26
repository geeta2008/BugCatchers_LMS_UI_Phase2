package stepdefinition;

import com.factory.DriverFactory;
import com.pages.ManageBatch_PageObj;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class F03_NumberOfRecords_StepDef {
   
	ManageBatch_PageObj batch = new ManageBatch_PageObj(DriverFactory.getDriver());
	
//	@Given("User is logged on to LMS website")
//	public void user_is_logged_on_to_lms_website() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User is on Batch page")
//	public void user_is_on_batch_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

	@Then("Verify that number of records \\(rows of data in the table) displayed on the page are {int}")
	public void verify_that_number_of_records_rows_of_data_in_the_table_displayed_on_the_page_are(Integer int1) {
	  
		int newint1 = int1;
		Assert.assertEquals(newint1, batch.noOfRecordsDisplayed());
		
	}
	
}
