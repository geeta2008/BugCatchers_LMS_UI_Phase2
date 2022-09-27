package stepdefinition;

import org.testng.Assert;

import com.factory.DriverFactory;
import com.github.dockerjava.api.model.Driver;
import com.pages.ManageBatch_PageObj;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class F08_AddBatch_StepDef {
	
	ManageBatch_PageObj batch = new ManageBatch_PageObj(DriverFactory.getDriver());
	
//	@Given("User is logged on to LMS website")
//	public void user_is_logged_on_to_lms_website() {
//	   
//	    
//	}
//
//	@Given("User is on Batch page")
//	public void user_is_on_batch_page() {
//	   
//	    
//	}

	@When("User clicks A New Batch button")
	public void user_clicks_a_new_batch_button() {
	   
		batch.clikcOnANewBatcBtn();
	}

	@Then("user can see {string} form")
	public void user_can_see_form(String string) {
	   
		Assert.assertEquals(string, batch.getBatchDetailsTxt());

	}

	@When("User clicks Save button without entering data")
	public void user_clicks_save_button_without_entering_data() {
	   
	    batch.clickOnSaveBtn();
	}

	@Then("User gets message {string}")
	public void user_gets_message(String string) {
	   
		Assert.assertEquals(string, batch.getMsg());
	}

	@When("User clicks Cancel button")
	public void user_clicks_cancel_button() {
	   
		batch.clickOnCancelBtn();
	}

	@Then("User can see Batch Details form disappears.")
	public void user_can_see_batch_details_form_disappears() {
	   
		
	    
	}

	@Then("{string} is displayed")
	public void is_displayed(String string) {
	   
		Assert.assertEquals(string,  batch.getHeaderTxt());
	}

	@When("User add {string} , {string} , {string} , {string} , {string} and {string}")
	public void user_add_and(String BatchNameTxtBx, String BatchDescription, String ProgramNameDrpDwn, String StatusRadioBtn, String NoOfClassesTxtBx, String ClickOnButton) {
		
		batch.editBatchDetails(BatchNameTxtBx, BatchDescription, ProgramNameDrpDwn, StatusRadioBtn, NoOfClassesTxtBx, ClickOnButton);
	}

	@When("User clicks on Save")
	public void user_clicks_on_save() {
	   
	    
	}

	@Then("User verifies message {string}")
	public void user_verifies_message(String string) {
	   
		Assert.assertEquals(string, batch.getSucessMsg());
	}

	@When("User searches with newly created {string}")
	public void user_searches_with_newly_created(String batchName) {
	   
		 batch.enterText(batchName);
	}

	@Then("records of the newly created  {string} is displayed")
	public void records_of_the_newly_created_is_displayed(String string) {
	   
		Assert.assertEquals(string, batch.checkBatchName());
	}
}
