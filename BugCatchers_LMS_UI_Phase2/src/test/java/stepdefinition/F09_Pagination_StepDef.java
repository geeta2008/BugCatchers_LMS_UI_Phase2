package stepdefinition;

import org.testng.Assert;

import com.factory.DriverFactory;
import com.pages.ManageBatch_PageObj;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class F09_Pagination_StepDef {
	
	ManageBatch_PageObj batch = new ManageBatch_PageObj(DriverFactory.getDriver());
//
//	@Given("User is logged on to LMS website")
//	public void user_is_logged_on_to_lms_website() {
//	    
//	     
//	}
//
//	@When("User is on first page of Manage Batch")
//	public void user_is_on_first_page_of_manage_batch() {
//	    
//	     
//	}

	@Then("Verify that previous link is disabled")
	public void verify_that_previous_link_is_disabled() {
	    
		Assert.assertTrue(batch.previousLinkDisabled());
	     
	}

	@Given("User is on the page number {string}")
	public void user_is_on_the_page_number(String string) {
	    
		Assert.assertTrue(batch.isOnPage(string));
	     
	}

	
	@When("User clicks navigate {string} button")
	public void user_clicks_navigate_button(String link) {
	    
		batch.goToPage(link);
		
	}


	@Then("User navigated to page number {string}")
	public void user_navigated_to_page_number(String string) {
	    
	     batch.isOnPage(string);
	}

	@Given("User is on page number {string}")
	public void user_is_on_page_number(String link) {
	    
		batch.goToPage(link);
		Assert.assertTrue(batch.isOnPage(link));
	}


	@When("User is on last page of Manage Batch")
	public void user_is_on_last_page_of_manage_batch() {
	    
	     batch.goToLastPage();
	}

	@Then("Verify that next link is disabled")
	public void verify_that_next_link_is_disabled() {
	    
		Assert.assertTrue(batch.nextLinkDisabled());
	     
	}

}
