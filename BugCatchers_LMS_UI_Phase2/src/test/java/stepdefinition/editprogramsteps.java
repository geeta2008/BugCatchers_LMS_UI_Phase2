package stepdefinition;

import com.factory.DriverFactory;

import com.pages.EditPage;
import com.pages.Programpages;

import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class editprogramsteps {

	Programpages PP = new Programpages(DriverFactory.getDriver());
	EditPage ed = new EditPage(DriverFactory.getDriver());

	@When("User selects Program using checkbox")
	public void user_selects_program_using_checkbox() {
		ed.editCheckTick();
	}

	@Then("Program gets selected")
	public void program_gets_selected() {
		ed.checkboxselected();
	}

	@When("User clicks on <Edit> button")
	public void user_clicks_on_edit_button() {
		ed.clickEditBtn();
	}

	@Then("User is on Program Details form.")
	public void user_lands_on_program_details_form() {
		ed.clickEditBtn();

	}

	@Given("User is on Program Details form")
	public void user_is_on_program_details() {
		ed.clickEditBtn();
	}

	@When("User edits <Name> and <Description>")
	public void user_edits_name_and_description() {
		ed.editingName();
		ed.editingDescription();
	}

	@Then("User can see edited {string} or {string}")
	public void user_can_see_edited_or(String string, String string2) {
		ed.viewEditedName();
	}

	@When("User changes status")
	public void user_changes_status() {
		PP.statusInactive();
	}

	@Then("User can see updated Status")
	public void user_can_see_updated_status() {
		ed.viewEditedName();
	}

	@Given("user edit program details")
	public void user_edit_program_details() {
		ed.viewEditedName();
	}

	@When("User clicks <Save> button")
	public void user_clicks_save_button() {
		ed.editingsavedBtn();
	}

	@Then("User gets message {string}")
	public void user_gets_message(String string) {
		String addedProgram= ed.successfullyCreated();
        System.out.println("Program Created:" + addedProgram);
	}
	
	@When("User clicks <cancel> button")
	public void user_clicks_cancel_button() {
		ed.editingCancelBtn();
	}

	@Then("User can see Program Details form disappears")
	public void user_can_see_program_details_form_disappears() {
		String message = PP.validatepagetitle();
	}

}
