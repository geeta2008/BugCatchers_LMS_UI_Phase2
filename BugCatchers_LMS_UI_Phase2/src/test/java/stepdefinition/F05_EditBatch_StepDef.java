package stepdefinition;

import org.junit.Assert;

import com.factory.DriverFactory;
import com.pages.ManageBatch_PageObj;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class F05_EditBatch_StepDef {
	
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

	@When("User clicks on Edit button on first record.")
	public void user_clicks_on_edit_button_on_first_record() {
	    
		batch.clickOnEditButton();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("User lands on Batch Details form.")
	public void user_lands_on_batch_details_form() {
	    
		//***************************
		//can we use Assert in When??
		//***************************
		batch.checkBatchDetailsPopUp();
	    
	}

	@When("User edits {string} , {string} , {string} , {string} , {string} and {string}")
	public void user_edits_and(String BatchNameTxtBx, String BatchDescription, String ProgramNameDrpDwn, String StatusRadioBtn, String NoOfClassesTxtBx, String ClickOnButton) {
	    
	     batch.editBatchDetails(BatchNameTxtBx, BatchDescription, ProgramNameDrpDwn, StatusRadioBtn, NoOfClassesTxtBx, ClickOnButton);
	     try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	@When("User searches record with {string}")
	public void user_searches_record_with(String batchName) {
	    
	     batch.enterText(batchName);
	     try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	@Then("User verifies that the details based on {string} , {string} , {string} , {string} , {string}")
	public void user_verifies_that_the_details_based_on(String BatchNameTxtBx, String BatchDescription, String ProgramNameDrpDwn, String StatusRadioBtn, String NoOfClassesTxtBx) {
	    
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	batch.searchEditedValueInTable(BatchNameTxtBx, BatchDescription, ProgramNameDrpDwn, StatusRadioBtn, NoOfClassesTxtBx);
		Assert.assertTrue(batch.searchEditedValueInTable(BatchNameTxtBx, BatchDescription, ProgramNameDrpDwn, StatusRadioBtn, NoOfClassesTxtBx));
	}

	
}
