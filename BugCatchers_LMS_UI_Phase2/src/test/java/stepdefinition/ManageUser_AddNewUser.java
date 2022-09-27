package stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.factory.DriverFactory;
import com.pages.ManageUserPage;
import com.util.XLSUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManageUser_AddNewUser {
	
	public WebDriver driver = DriverFactory.getDriver();
	ManageUserPage userPage = new ManageUserPage(driver);
	boolean flag;
	String projectPath = System.getProperty("user.dir");
	String path = projectPath+"/TestData/AddNewUser_TestData.xlsx";
	XLSUtility xlutil = new XLSUtility(path);
	
	/*@Given("User is on Manage User page")
	public void user_is_on_manage_user_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}*/

	@When("User clicks Add New User button")
	public void user_clicks_add_new_user_button() throws InterruptedException {
	    userPage.click_add_NewUser();
	}

	@Then("User Details dialog box should be displayed with all the input fields")
	public void user_details_dialog_box_should_be_displayed_with_all_the_input_fields() {
	    System.out.println("User details dialog box is displayed : "+userPage.edit_userDetails_display());
	}

	@Given("User is on user Details window")
	public void user_is_on_user_details_window() throws InterruptedException {
		driver.get(userPage.LMS_url);
		userPage.Login(userPage.user, userPage.pwd);
		userPage.click_userTab();
		userPage.click_add_NewUser();
	}

	@When("User clicks the button {string}")
	public void user_clicks_the_button(String addAdress) {
	   userPage.click_addAptAddress_button();
	   System.out.println("User clicks button : "+addAdress);
	}

	@Then("User should see the input field with Label {string}")
	public void user_should_see_the_input_field_with_label(String text) {
	    if(userPage.address2_displayed())
	    	System.out.println(text+" : Textbox is displayed on User Details window");
	}

	@When("User clicks the {string}")
	public void user_clicks_the(String dropdown) {
	    userPage.select_dropdown(dropdown);
	}

	/*@Then("User should select from the drop down menu")
	public void user_should_select_from_the_drop_down_menu() {
	    userPage.select_state_from_dropdown();
	}*/
	
	@Then("User should select from the {string}")
	public void user_should_select_from_the(String option) {
	    userPage.select_value_from_dropdown(option);
	}

	@When("User clicks postal code input field")
	public void user_clicks_postal_code_input_field() {
		flag = userPage.click_PostalCode();
	}

	@Then("User should see the input Number arrows in the postal code input field")
	public void user_should_see_the_input_number_arrows_in_the_postal_code_input_field() {
	   if(flag)
		   System.out.println("Input number arrows in postal code input field are enabled");
	}

	@When("User clicks save button with all input details empty")
	public void user_clicks_save_button_with_all_input_details_empty() throws InterruptedException {
		
	    userPage.click_submit_userDetails();
	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
	    System.out.println("Expected Result : User should get a message "+string);
	}

	@When("User clicks Submit button with all valid values in required fields")
	public void user_clicks_submit_button_with_all_valid_values_in_required_fields() throws IOException, InterruptedException {
	    userPage.enter_firstname(xlutil.getCellData("Sheet1", 1, 0));
	    userPage.enter_middlename(xlutil.getCellData("Sheet1", 1, 1));
	    userPage.enter_lastname(xlutil.getCellData("Sheet1", 1, 2));
	    userPage.enter_email(xlutil.getCellData("Sheet1", 1, 3));
	    userPage.enter_phone(xlutil.getCellData("Sheet1", 1, 4));
	    userPage.address(xlutil.getCellData("Sheet1", 1, 5));
	    userPage.enterCity(xlutil.getCellData("Sheet1", 1, 6));
	    userPage.expand_state_dropdown();
	    userPage.select_state_from_dropdown();
	    userPage.enterPostalCode(xlutil.getCellData("Sheet1", 1, 7));
	    userPage.enterProgram(xlutil.getCellData("Sheet1", 1, 8));
	    userPage.enterUgProgram(xlutil.getCellData("Sheet1", 1, 9));
	    userPage.enterPgProgram(xlutil.getCellData("Sheet1", 1, 10));
	    userPage.enterSkill(xlutil.getCellData("Sheet1", 1, 11));
	    userPage.enterExperience(xlutil.getCellData("Sheet1", 1, 12));
	    userPage.expand_role_dropdown();
	    userPage.select_role_from_dropdown();
	    userPage.enterVisa(xlutil.getCellData("Sheet1", 1, 13));
	    userPage.enterbatch(xlutil.getCellData("Sheet1", 1, 14));
	    userPage.enterComments(xlutil.getCellData("Sheet1", 1, 15));
	    userPage.enterUserName(xlutil.getCellData("Sheet1", 1, 16));
	    userPage.enterFormPwd(xlutil.getCellData("Sheet1", 1, 17));
	    userPage.enterFiletype(xlutil.getCellData("Sheet1", 1, 18));
	    userPage.add_newUser_validData();
	}

	@Then("New user should get created")
	public void new_user_should_get_created() {
		Assert.assertEquals(userPage.getURL(), userPage.ManageUser_url);
		System.out.println("A new User is created");
	}

	@When("User clicks on {string}")
	public void user_clicks_on(String link) throws InterruptedException {
	    userPage.cancel_userDetails(link);
	}

	@Then("User details window should be closed.")
	public void user_details_window_should_be_closed() {
		 Assert.assertEquals(userPage.getURL(), userPage.ManageUser_url);
	}

}
