package stepdefinition;

import org.junit.Assert;

import com.factory.DriverFactory;
import com.pages.AddPage;
import com.pages.Programpages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addnewprogramsteps {

	Programpages PP = new Programpages(DriverFactory.getDriver());
	AddPage add=new AddPage(DriverFactory.getDriver());

	@When("User clicks A New Program button")
	public void user_clicks_a_new_program_button() {
		add.addingNewProgramBtn();
	}

	@Then("User lands on Program Details form")
	public void user_lands_on_program_details_form() {
		PP.validatepagetitle();
				
	}

	@Given("user is on program details")
	public void user_is_on_program_details() {
		add.addingNewProgramBtn();
	}

	@When("User clicks <Save> button without entering data")
	public void user_clicks_save_button_without_entering_data() {
		add.saveAddedBtn();
	}

	@Then("User will see message {string}")
	public void user_will_see_message(String string) {
		String errorName = PP.nameRequiredInForm();
		System.out.println("Name required:" + errorName);
	}

	@When("User enters <Name> in text box")
	public void user_enters_name_in_text_box() {
		add.addName();
	}

	@Then("User can see added {string} entered")
	public void user_can_see_added_entered(String string) {
		add.viewAddedName();
	}

	@When("User enters description or  selects <Status> using radio button")
	public void user_enters_description_or_selects_status_using_radio_button() {
		add.addDescription();
	}

	@Then("User can see description entered and {string} status selected")
	public void user_can_see_description_entered_and_status_selected(String string) {
	    add.viewaddDescription();
		PP.statusActive();
		
	}

	@When("User click <Save> button")
	public void user_click_save_button() {
		add.saveAddedBtn();
	}

	@Then("User get message {string}")
	public void user_get_message(String string) {
        String addedProgram= add.successfullyCreated();
        System.out.println("Program Created:" + addedProgram);
	}

	@When("User click <cancel> button")
	public void user_click_cancel_button() {
        add.cancelAddingBtn();
	}

	@Then("User should get message {string}")
	public void user_should_get_message(String disapper) {
				
		String message = PP.validatepagetitle();
		
	}

}
