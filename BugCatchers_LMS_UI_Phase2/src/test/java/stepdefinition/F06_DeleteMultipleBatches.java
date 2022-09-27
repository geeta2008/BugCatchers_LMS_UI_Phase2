package stepdefinition;

import com.factory.DriverFactory;
import com.pages.ManageBatch_PageObj;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class F06_DeleteMultipleBatches {
	
	ManageBatch_PageObj batch = new ManageBatch_PageObj(DriverFactory.getDriver());
	
//	@Given("User is logged on to LMS website")
//	public void user_is_logged_on_to_lms_website() {
//	}
//
//	@Given("User is on Batch page")
//	public void user_is_on_batch_page() {
//	}

	@When("User clicks on two records")
	public void user_clicks_on_two_records() {
	
		batch.multipleRecordsDeleted();
	}

//	@When("User clicks on {string} button.")
//	public void user_clicks_on_button(String string) {
//	}
//
//	@Then("User verifies that {string} message is displayed.")
//	public void user_verifies_that_message_is_displayed(String string) {
//	}
//
//	@Then("User verifies that no {string} message is displayed.")
//	public void user_verifies_that_no_message_is_displayed(String string) {
//	}




}
