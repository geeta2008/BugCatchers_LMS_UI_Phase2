package stepdefinition;

import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.pages.ManageUserPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManageUser_UserTableRows {
	
    public WebDriver driver = DriverFactory.getDriver();
	ManageUserPage userPage = new ManageUserPage(driver);
	
	/*@Given("User is on Manage User page")
	public void user_is_on_manage_user_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}*/

	@When("User ckicks Delete icon in the user table row")
	public void user_ckicks_delete_icon_in_the_user_table_row() throws InterruptedException {
	    userPage.deleteUserRow();
	}

	@Then("Confirm dialog box should be displayed")
	public void confirm_dialog_box_should_be_displayed() {
	    userPage.verify_confirm_delete();
	}

	@When("User ckicks Update icon in the user table row")
	public void user_ckicks_update_icon_in_the_user_table_row() throws InterruptedException {
	    userPage.editUserRow();
	}

	@Then("User Details dialog box should be displayed to edit user details")
	public void user_details_dialog_box_should_be_displayed_to_edit_user_details() {
	    if(userPage.edit_userDetails_display())
	    	System.out.println("User details dialog box is displayed");
	}

	@When("User enters name in the search field")
	public void user_enters_name_in_the_search_field() {
	    System.out.println("User enters name in the search box");
	}

	@Then("Rows matching with Search criteria should be displayed")
	public void rows_matching_with_search_criteria_should_be_displayed() throws InterruptedException {
	    System.out.println(userPage.searchResult());
	}

	@When("User clicks on User Id link in any row")
	public void user_clicks_on_user_id_link_in_any_row() throws InterruptedException {
	    userPage.click_userId_link();
	}

	@Then("A dialog box with user information should be displayed")
	public void a_dialog_box_with_user_information_should_be_displayed() {
	    if(userPage.edit_userDetails_display())
	    	System.out.println("A dialog box with user details is displayed");
	   
	}
}
