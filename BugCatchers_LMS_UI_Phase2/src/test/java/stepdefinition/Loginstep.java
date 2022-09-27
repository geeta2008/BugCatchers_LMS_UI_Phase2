package stepdefinition;

import com.factory.DriverFactory;
import com.pages.Loginpage;
import AppHooks.ApplicationHook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginstep {

	Loginpage login = new Loginpage(DriverFactory.getDriver());

	@Given("User is on the Login Page")
	public void user_is_on_the_login_page() {
		DriverFactory.getDriver().get(ApplicationHook.prop.getProperty("LMS_url"));
	}

	@When("User enter Username,Password and click login button") 
	public void user_enter_username_password_and_click_login_button() {
		 login.userpassword(ApplicationHook.prop.getProperty("User"),ApplicationHook.prop.getProperty("Password"));
		 login.Login();
		 }

	@Then("User should see the LMS Home page.")
	public void user_should_see_the_lms_home_page() {

		//login.validatepagetitle();
		login.validateheader();

	}
	
	@When("User without Username,Password and click login button")
	public void user_without_username_password_and_click_login_button() {
		login.userpassword(" "," ");
		login.Login();
	}
	
	@Then("User stay on the LMS Login page.")
	public void user_stay_on_the_lms_login_page() {
		login.validateheader();
	}


}
