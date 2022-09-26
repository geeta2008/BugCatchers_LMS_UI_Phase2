package stepdefinition;

import org.junit.Assert;

import com.factory.DriverFactory;
import com.pages.ManageBatch_PageObj;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class F11_ResultsInDescendingOrder_StepDef {

    ManageBatch_PageObj batch = new ManageBatch_PageObj(DriverFactory.getDriver())	;
	
//	@Given("User is on Batch page")
//	public void user_is_on_batch_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
	@When("User clicks onthe Descending arrow \\(down ) near to the {string}")
	public void user_clicks_onthe_descending_arrow_down_near_to_the(String columnName) {
	   
		batch.clickOnHeaderDescending(columnName);
		
	}

	@Then("User can see the results in Descending order of {string}")
	public void user_can_see_the_results_in_descending_order_of(String columnName) {
	   
		Assert.assertTrue(batch.verifySortedResulDescending(columnName));
	}

	


}
