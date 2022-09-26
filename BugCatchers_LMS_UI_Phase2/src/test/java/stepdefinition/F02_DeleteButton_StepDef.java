package stepdefinition;

import org.junit.Assert;

import com.factory.DriverFactory;
import com.pages.ManageBatch_PageObj;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class F02_DeleteButton_StepDef {


	//call the pageObjectModel class and give the driver
	private ManageBatch_PageObj batch = new ManageBatch_PageObj(DriverFactory.getDriver());
	
//	@Given("User is logged on to LMS website")
//	public void user_is_logged_on_to_lms_website() {
//	  
//	    
//	}
//
//	@When("User is on Batch page")
//	public void user_is_on_batch_page() {
//	    
//	   
//	}

	@Then("Verify that the Delete button next to the search box is Disabled")
	public void verify_that_the_delete_button_next_to_the_search_box_is_disabled() {
	    
		Assert.assertFalse(batch.isDisabled());	 
	}

}
