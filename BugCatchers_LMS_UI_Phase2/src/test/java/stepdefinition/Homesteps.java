package stepdefinition;

import org.testng.Assert;

import com.factory.DriverFactory;
import com.pages.Homepage;
import com.pages.Loginpage;

import AppHooks.ApplicationHook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homesteps {

	Homepage Home = new Homepage(DriverFactory.getDriver());
	Loginpage login = new Loginpage(DriverFactory.getDriver());

	@Given("User is on the browser")
	public void user_is_on_the_browser() {
		DriverFactory.getDriver().get(ApplicationHook.prop.getProperty("LMS_url"));
	}

	@When("User landed on the Home page after logging into the LMS website")
	public void user_landed_on_the_home_page_after_logging_into_the_lms_website() {
		login.userpassword(ApplicationHook.prop.getProperty("User"), ApplicationHook.prop.getProperty("Password"));
		login.Login();
	}

	@Then("User should see a button with text {string} on the menu bar")
	public void user_should_see_a_button_with_text_on_the_menu_bar(String Program) {
		String pgm = Home.ProgramTextDisplay();
		Assert.assertEquals(pgm, Program);
	}

	@Then("User should see button with text {string} on menu bar")
	public void user_should_see_button_with_text_on_menu_bar(String Batch) {
		String Btch = Home.BatchTextDisplay();
		Assert.assertEquals(Btch, Batch);
	}

	@Then("User should see button with text {string} on the menu bar")
	public void user_should_see_button_with_text_on_the_menu_bar(String User) {
		String User1 = Home.UserTextDisplay();
		Assert.assertEquals(User1, User);
	}

	@Then("User should see a button with text {string} on menu bar")
	public void user_should_see_a_button_with_text_on_menu_bar(String Assignment) {
		String Asgmt = Home.AssigmentTextDisplay();
		Assert.assertEquals(Asgmt, Assignment);
	}

	@Then("User should see button with text {string} on menu")
	public void user_should_see_button_with_text_on_menu(String Logout) {
		String log = Home.LogoutTextDisplay();
		Assert.assertEquals(log, Logout);
	}

}
