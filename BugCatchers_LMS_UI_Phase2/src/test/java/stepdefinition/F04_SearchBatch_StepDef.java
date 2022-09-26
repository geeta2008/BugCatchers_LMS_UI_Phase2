package stepdefinition;

import org.junit.Assert;

import com.factory.DriverFactory;
import com.pages.ManageBatch_PageObj;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class F04_SearchBatch_StepDef {
	
	ManageBatch_PageObj batch = new ManageBatch_PageObj(DriverFactory.getDriver());
	
//	@Given("User is on Batch page")
//	public void user_is_on_batch_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

	@When("user clicks on search box with Batch Name entered in it {string}")
	public void user_clicks_on_search_box_with_batch_name_entered_in_it(String string) {
	    
		batch.enterText(string);
	}

	@Then("records of that  {string} are displayed")
	public void records_of_that_are_displayed(String searchString) {
	    
		Assert.assertTrue(batch.searchValueInTable(searchString));

	}


}
