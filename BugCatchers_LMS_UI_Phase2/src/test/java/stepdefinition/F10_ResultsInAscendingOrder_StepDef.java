package stepdefinition;

import org.testng.Assert;

import com.factory.DriverFactory;
import com.pages.ManageBatch_PageObj;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class F10_ResultsInAscendingOrder_StepDef {
	
	ManageBatch_PageObj batch = new ManageBatch_PageObj(DriverFactory.getDriver());

//	@Given("User is on Batch page")
//	public void user_is_on_batch_page() {
//
//	}

	@When("User clicks on the Ascending arrow \\(down ) near to the {string}")
	public void user_clicks_on_the_ascending_arrow_down_near_to_the(String columnName) {
	   
		batch.clickOnHeaderAscending(columnName);
		
	}

	@Then("User can see the results in Ascending order of {string}")
	public void user_can_see_the_results_in_ascending_order_of(String columnName) {
	    
		Assert.assertTrue(batch.verifySortedResultAscending(columnName));
		
	}

}
