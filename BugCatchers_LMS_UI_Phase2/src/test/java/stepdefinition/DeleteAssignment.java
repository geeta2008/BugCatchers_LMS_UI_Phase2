package stepdefinition;

import com.factory.DriverFactory;
import com.pages.AssignmentPages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteAssignment {
    
	AssignmentPages Assignment=new AssignmentPages(DriverFactory.getDriver());
	
	@When("User clicks on <Delete> button after selecting an assignment")
	public void user_clicks_on_delete_button_after_selecting_an_assignment() {
		Assignment.checkboxselect();
		Assignment.Deletebuttonright();
		Assignment.DeletebuttonRightclick();
	}

	@Then("User lands on Confirm Deletion form.")
	public void user_lands_on_confirm_deletion_form() {
	     Assignment.DeleteConfirmwindowpop();
	     
	}

	@When("User selects more than one Assignment using checkbox")
	public void user_selects_more_than_one_assignment_using_checkbox() {
	   Assignment.checkboxselect();
	   //Assignment.checkboxselect();
	}

	@Then("Assignments get selected")
	public void assignments_get_selected() {
	   Assignment.checkboxselected();
	}

	@Given("User selected Mutliple Assignments in Assignment page")
	public void user_selected_mutliple_assignments_in_assignment_page() {
		 Assignment.checkboxselect();
		 //Assignment.checkboxselect();
	}

	@When("User clicks on <Delete> button on top left corner of the screen")
	public void user_clicks_on_delete_button_on_top_left_corner_of_the_screen() {
	  Assignment.DeletebuttonRightclick();
	}

	@Then("User lands on Confirm Deletion page.")
	public void user_lands_on_confirm_deletion_page() {
		Assignment.DeleteConfirmwindowpop();
	}

	@Given("User is on Confirm Deletion form")
	public void user_is_on_confirm_deletion_form() {
		Assignment.checkboxselect();
		Assignment.DeletebuttonRightclick();
		Assignment.DeleteConfirmwindowpop();
	}

	@When("User clicks <Yes> button")
	public void user_clicks_yes_button() {
		Assignment.DeleteSaveButtonclick();
	}

	@Then("User can see {string} message")
	public void user_can_see_message(String DeleteMsg) {
	  DeleteMsg=Assignment.deleteMsgText();
	  System.out.println("Deletion Success Message:"+DeleteMsg);
	  

	}

	@Given("User clicks on <Delete> button")
	public void user_clicks_on_delete_button() {
		Assignment.DeletebuttonRightclick();
		Assignment.DeleteConfirmwindowpop();
	}

	@When("User clicks <No> button")
	public void user_clicks_no_button() {
		Assignment.DeleteNoButtonclick();	
		}

	@Then("User can see Confirm Deletion form disappears")
	public void user_can_see_confirm_deletion_form_disappears() {
		Assignment.DeleteConfirmwindowpop();
	}
}
