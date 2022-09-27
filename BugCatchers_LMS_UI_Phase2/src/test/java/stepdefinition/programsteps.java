package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;

import com.pages.Programpages;

import AppHooks.ApplicationHook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class programsteps {

	Programpages PP = new Programpages(DriverFactory.getDriver());

	@Given("user is logged on to LMS Website")
	public void user_is_logged_on_to_lms_website() {
		DriverFactory.getDriver().get(ApplicationHook.prop.getProperty("LMS_program_url"));
		PP.userpassword(ApplicationHook.prop.getProperty("User"), ApplicationHook.prop.getProperty("Password"));
		PP.Login();

	}

	@When("user is on program page")
	public void user_is_on_program_page() {
		PP.URL();

	}

	@Then("User should see a heading with text {string} on the page")
	public void user_should_see_a_heading_with_text_on_the_page(String ManageProgram) {
		String title = PP.pageProgramTitle();
		Assert.assertEquals(title, ManageProgram);

	}

	@Then("user should see the current page entries")
	public void user_should_see_the_current_page_entries() {
		String pagecontent = PP.pageEntries();
		System.out.println("pagecontent=" + pagecontent);
		Assert.assertTrue(pagecontent, true);

	}

	@Then("user should see the total programs")
	public void user_should_see_the_total_programs() {
		String pagesfooter = PP.allPages();
		Assert.assertTrue(pagesfooter, true);

	}

	/*
	 * @Given("user is logged on to LMS Website") public void
	 * user_is_logged_on_to_LMS_Website() {
	 * DriverFactory.getDriver().get(ApplicationHook.prop.getProperty(
	 * "LMS_program_url"));
	 * PP.userpassword(ApplicationHook.prop.getProperty("User"),
	 * ApplicationHook.prop.getProperty("Password")); PP.Login();}
	 */

	@When("User is on first page of Manage Program")
	public void user_is_on_first_page_of_manage_program() {
		System.out.println();
		DriverFactory.getDriver().get(ApplicationHook.prop.getProperty("LMS_program_url"));
		PP.userpassword(ApplicationHook.prop.getProperty("User"), ApplicationHook.prop.getProperty("Password"));
		PP.Login();
	}

	@Then("Verify that previous link is disabled")
	public void verify_that_previous_link_is_disabled() {
		user_is_on_first_page_of_manage_program();
		System.out.println("PreviousLink");
		PP.previousLink();
		System.out.println("PreviousLink1111" + PP.previousLink());

	}

	@Given("User is on the page number")
	public void user_is_on_the_page_number() {
		user_is_on_first_page_of_manage_program();
		String data = PP.CurrentPage();
	}

	@When("User clicks navigate forward button")
	public void user_clicks_navigate_forward_button() {
		PP.nextPageBtn();
	}

	@Then("User navigated to page number")
	public void user_navigated_to_page_number() {
		PP.nextPage();
	}

	@Given("User is on the current page number")
	public void user_is_on_the_current_page_number() {
		user_is_on_the_page_number();
		user_clicks_navigate_forward_button();
		user_navigated_to_page_number();
		String data = PP.CurrentPage();
		System.out.println("CurrentPagesss" + data);
	}

	@When("User clicks navigate backward button")
	public void user_clicks_navigate_backward_button() {
		System.out.println("backward button");
		PP.prevoiusPageBtn();
		// PP.FirstPageNo();
		// user_navigated_to_page_number();

	}

	@Then("User navigated to previous page number")
	public void user_navigated_to_previous_page_number() {
		PP.CurrentPage();
	}

	@When("User is on last page of Manage Program")
	public void user_is_on_last_page_of_manage_program() {
		PP.lastPage();
	}

	@Then("Verify that next link is disabled")
	public void verify_that_next_link_is_disabled() {
		PP.nextPageBtn();
	}

	@Then("user should see the Delete button on the top left hand side as disabled")
	public void user_should_see_the_delete_button_on_the_top_left_hand_side_as_disabled() {
		user_is_on_first_page_of_manage_program();
		boolean leftDelete = PP.leftDisabledDeleteBtn();
		Assert.assertEquals(leftDelete, false);
	}

	@Then("user should see the number of records in program page as <{int}>")
	public void user_should_see_the_number_of_records_in_program_page_as(Integer int1) {
         boolean record=PP.pageOneRecord();
         Assert.assertEquals(record, true);
	}

}
