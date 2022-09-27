package stepdefinition;



import org.testng.Assert;

import com.factory.DriverFactory;
import com.pages.AssignmentPages;
import com.pages.Loginpage;

import AppHooks.ApplicationHook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddNewAssignment {

	AssignmentPages Assignment = new AssignmentPages(DriverFactory.getDriver());
	Loginpage login = new Loginpage(DriverFactory.getDriver());

	@Given("User is on Assignment details form")
	public void user_is_on_assignment_details_form() {
		Assignment.NewAssignmentClick();
	}

	@When("User clicks Save button without entering data")
	public void user_clicks_save_button_without_entering_data() {
		Assignment.AssformSaveClick();
	}

	@Then("User gets message {string}")
	public void user_gets_message(String Text) {
		String Text11 = "Name is required.";
		Text = Assignment.validateNameisrequired();
		Assert.assertEquals(Text, Text11);
		Assignment.AssformExitclick();
	}
	
	@Given("user enters {string}")
	public void user_enters(String string) {
		Assignment.NewAssignmentName(string);
	}	
		
	@When("user clicks Save button")
	public void user_clicks_save_button() {
		Assignment.AssformSaveClick();
	}	

	@Then("User can see {string} saved in Assignment")
	public void user_can_see_saved_in_Assignment(String Text11) {
		Text11 = "Successful";
		String Text= Assignment.validateAddSuccessmsg();
		Assert.assertEquals(Text,Text11);
		
	}
	
	@Given("user enters {string},{string}")
	public void user_enters(String string, String string2) {
		Assignment.AssignformSomeFill(string,string);
	}
	
	@When("clicks Save button")
	public void clicks_save_button() {
		Assignment.AssformSaveClick();
	}

	@Then("User get message as {string}")
	public void user_get_message_as(String Text) {
		String Text11 = "Name is required.";
		Text = Assignment.validateNameisrequired();
		System.out.println(Text);
		Assert.assertEquals(Text, Text11);
	}
	
	@Given("user enters {string},{string},{string}")
	public void user_enters(String string, String string2, String string3) {
		Assignment.NewAssignmentName(string);
		Assignment.AssignformSomeFill(string,string);
		//Assignment.AssignDatefill();
	}
	
	@Then("User can see {string} message displayed")
	public void user_can_see_message_displayed(String Text11) {
		Text11 = "Successful";
		String Text= Assignment.validateAddSuccessmsg();
		Assert.assertEquals(Text,Text11);
	}
	
	
	@Given("User enters {string},{string},{string} in Assignment Details form")
	public void user_enters_in_assignment_details_form(String string, String string2, String string3) {
		Assignment.NewAssignmentName(string);
		Assignment.AssignformSomeFill(string,string);
		//Assignment.AssignDatefill();
	}


	@When("User Clicks <Cancel> button")
	public void user_clicks_cancel_button() {
		Assignment.AssformCancelClick();
		Assignment.AssformExitclick();
	}

	@Then("User can see Assignment Details form disappears")
	public void user_can_see_assignment_details_form_disappears() {
		String Text = Assignment.validateheader();
		String Text1 = "Manage Assignment";
		Assert.assertEquals(Text,Text1);
	}

}
