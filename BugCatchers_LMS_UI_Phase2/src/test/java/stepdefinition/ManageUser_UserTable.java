package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.factory.DriverFactory;
import com.pages.ManageUserPage;

import AppHooks.ApplicationHook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ManageUser_UserTable {
	public WebDriver driver = DriverFactory.getDriver();
	ManageUserPage userPage = new ManageUserPage(driver);
	//String ManageUser_url = "https://lms-frontend-phase2.herokuapp.com/user";
		
	@Given("User logs in to LMS website")
	public void user_logs_in_to_lms_website() {
	   driver.get(userPage.LMS_url);
	   userPage.Login(userPage.user, userPage.pwd);
	}

	@When("User clicks on the User tab")
	public void user_clicks_on_the_user_tab() {
	    userPage.click_userTab();
	}

	@Then("User should be on {string} page")
	public void user_should_be_on_page(String user) {
	    Assert.assertEquals(userPage.getURL(), userPage.ManageUser_url);
	    System.out.println("User is on "+user+" page");
		
	}

	@Then("User should see the text in footer {string}")
	public void user_should_see_the_text_in_footer(String text) {
		userPage.check_footerText();
	    System.out.println("Text displayed in footer : "+text);
	}

	@Given("User is on Manage User page")
	public void user_is_on_manage_user_page() {
		driver.get(userPage.LMS_url);
		userPage.Login(userPage.user, userPage.pwd);
		userPage.click_userTab();
	}

	@When("User clicks on sort icon in table header")
	public void user_clicks_on_sort_icon_in_table_header() {
	    System.out.println("User clicks on sort Contact Number icon");
	}

	@Then("Table rows should be sorted")
	public void table_rows_should_be_sorted() {
	    userPage.sort_Contacts();
		
	}

	@When("User checks empty checkbox in header")
	public void user_checks_empty_checkbox_in_header() {
	    System.out.println("User checks the User Id checkbox in the header of User Table");
	}

	@Then("Check box in all the rows of user table should be checked")
	public void check_box_in_all_the_rows_of_user_table_should_be_checked() {
	    userPage.check_userid_Checkbox();
	}

	@When("User unchecks the checkbox in header")
	public void user_unchecks_the_checkbox_in_header() {
	    System.out.println("User unchecks the User Id checkbox in the header of User Table");
	}

	@Then("Check box in all the rows of user table should be unchecked")
	public void check_box_in_all_the_rows_of_user_table_should_be_unchecked() {
	    userPage.uncheck_userid_Checkbox();
	}

	@When("User do not check any row checkbox")
	public void user_do_not_check_any_row_checkbox() {
	    System.out.println("User id checkbox is not checked");
	}

	@Then("Delete icon at the top left corner of the user table should be disabled")
	public void delete_icon_at_the_top_left_corner_of_the_user_table_should_be_disabled() {
	    userPage.verify_header_Delete_Icon();
	}

	@When("User checks the row in user table")
	public void user_checks_the_row_in_user_table() {
	    //userPage.check_userid_Checkbox();
		userPage.check_single_user();
	}
	@Then("Delete icon at the top left corner of the user table should be enabled")
	public void delete_icon_at_the_top_left_corner_of_the_user_table_should_be_enabled() {
	    userPage.verify_header_Delete_Icon();
	}

	/*@Given("User checks the row in user table")
	public void user_checks_the_row_in_user_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
*/
	
	/*@When("User clicks the delete icon at the top left corner of user table")
	public void user_clicks_the_delete_icon_at_the_top_left_corner_of_user_table() {
	    userPage.click_header_Delete_Icon();
	}

	@Then("Confirm dialog box should be displayed")
	public void confirm_dialog_box_should_be_displayed() {
	    userPage.verify_confirm_delete();
	}*/

	@Given("User is on confirm dialog box after clicking delete icon")
	public void user_is_on_confirm_dialog_box_after_clicking_delete_icon() throws InterruptedException {
	    driver.get(userPage.LMS_url);
		userPage.Login(userPage.user, userPage.pwd);
		userPage.click_userTab();
		Thread.sleep(2000);
		//userPage.check_userid_Checkbox();
		userPage.check_single_user();
		userPage.click_header_Delete_Icon();
	}

	@When("User clicks the close\\(x) icon")
	public void user_clicks_the_close_x_icon() {
	    userPage.click_closeX_icon();
	}

	@Then("Confirm dialog box should be closed")
	public void confirm_dialog_box_should_be_closed() {
	    
	    Assert.assertEquals(userPage.getURL(), userPage.ManageUser_url);
	    System.out.println("User is navigated to Manage User page");
	}

	@When("User clicks the Yes icon")
	public void user_clicks_the_yes_icon() {
		
		userPage.click_Yes_Delete();
	}

	@Then("Selected rows should be deleted with popup message {string}")
	public void selected_rows_should_be_deleted_with_popup_message(String message) {
	   System.out.println(message);
	   System.out.println(userPage.print_user_deleted_msg());
	}



}
