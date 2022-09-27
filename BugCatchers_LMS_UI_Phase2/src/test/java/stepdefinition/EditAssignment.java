package stepdefinition;

import org.testng.Assert;

import com.factory.DriverFactory;
import com.pages.AssignmentPages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditAssignment {

	AssignmentPages Assignment = new AssignmentPages(DriverFactory.getDriver());

	@When("User selects Assignment using checkbox")
	public void user_selects_assignment_using_checkbox() {
		Assignment.checkboxselect();
	}

	@Then("Assignment gets selected")
	public void assignment_gets_selected() {
		Assignment.checkboxselected();
	}

	@When("User clicks on <Edit> button")
	public void user_clicks_on_edit_button() {
		Assignment.EditbuttonRightclick();
	}

	@Then("User lands on Assignment Details form.")
	public void user_lands_on_assignment_details_form() {
		String Text1 = "Assigment Details";
		Assignment.validatepagetitle();
		String Text = Assignment.pageheader();
		Assert.assertEquals(Text, Text1);
	}

	@Given("User clicks on <Edit> button and is on Assignment Details form")
	public void user_clicks_on_edit_button_and_is_on_assignment_details_form() {
		Assignment.checkboxselect();
		Assignment.EditbuttonRightclick();
	}

	@When("User edits {string},{string},{string}")
	public void user_edits(String Name, String Description, String Grade) {
		Assignment.EditAssignformFill(Name, Description, Grade);
	}

	@When("User clicks <Save> button on Assignment Details form")
	public void user_clicks_save_button_on_assignment_details_form() {
		Assignment.AssformSaveClick();
	}

	@Then("User can sees {string} message")
	public void user_can_sees_message(String string) {
		String pageheader = Assignment.pageheader();
		System.out.println(pageheader);
	}

	@Given("User is on Assignment page and clicks on <Edit> button")
	public void user_is_on_assignment_page_and_clicks_on_edit_button() {
		Assignment.checkboxselect();
		Assignment.EditbuttonRightclick();
	}

	@When("User clicks <Cancel> button, <Exit> button  on Assignment Details form")
	public void user_clicks_cancel_button_exit_button_on_assignment_details_form() {
		Assignment.AssformCancelClick();
		}

	@Then("User sees Assignment Details form disappears")
	public void user_sees_assignment_details_form_disappears() {
		String pagetitle = Assignment.validatepagetitle();
		System.out.println(pagetitle);
	}

}
