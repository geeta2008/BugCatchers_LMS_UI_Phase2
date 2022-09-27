package stepdefinition;

import org.testng.Assert;

import com.factory.DriverFactory;
import com.pages.ManageBatch_PageObj;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class F07_DeleteSingleBatch {

	ManageBatch_PageObj batch = new ManageBatch_PageObj(DriverFactory.getDriver());
	
	
//	@Given("User is on Batch page")
//	public void user_is_on_batch_page() {
//	    
//	    
//	}

	@When("User clicks on first delete button.")
	public void user_clicks_on_first_delete_button() {
	    
		batch.clickOnFirstDeleteBtn();
	    
	}

	@When("User clicks on {string} button.")
	public void user_clicks_on_button(String yesnoDecision) {
	    
	    batch.clickOnConfirmationBtn(yesnoDecision);
	}

	@Then("User verifies that {string} message is displayed.")
	public void user_verifies_that_message_is_displayed(String msg) {
	    
		batch.confirmationMsgAfterDelete(msg);
	    
	}

	@Then("User verifies that no {string} message is displayed.")
	public void user_verifies_that_no_message_is_displayed(String msg) {
	    
		Assert.assertTrue(batch.confirmationMsgAfterDelete(msg));
		
	}


}
