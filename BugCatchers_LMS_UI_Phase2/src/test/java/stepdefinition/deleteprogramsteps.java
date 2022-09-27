
  package stepdefinition;
  
  import com.factory.DriverFactory; import com.pages.EditPage; import
  com.pages.Programpages;
  
  import AppHooks.ApplicationHook; import io.cucumber.java.en.Given; import
  io.cucumber.java.en.Then; import io.cucumber.java.en.When;
  
  public class deleteprogramsteps { Programpages PP = new
  Programpages(DriverFactory.getDriver()); EditPage ed = new
  EditPage(DriverFactory.getDriver());
  
  @Given("User is logged on to LMS website") public void
  user_is_logged_on_to_lms_website() {
  DriverFactory.getDriver().get(ApplicationHook.prop.getProperty(
  "LMS_program_url"));
  PP.userpassword(ApplicationHook.prop.getProperty("User"),
  ApplicationHook.prop.getProperty("Password")); PP.Login();
  
  }
  
  @Then("User should see the Delete button on the top left hand side as Disabled"
  ) public void
  user_should_see_the_delete_button_on_the_top_left_hand_side_as_disabled() {
  PP.leftDisabledDeleteBtn(); }
  
  @When("User selects more than one Program using checkbox") public void
  user_selects_more_than_one_program_using_checkbox() { PP.checkTickAll(); }
  
  @Then("programs get selected") public void programs_get_selected() {
  PP.checkTickAll(); }
  
  @When("User clicks on <Delete> button on top left corner") public void
  user_clicks_on_delete_button_on_top_left_corner() { PP.leftDeleteBtn(); }
  
  @Then("User lands on Confirm Deletion form") public void
  user_lands_on_confirm_deletion_form() { PP.validatepagetitle(); }
  
  @Given("User is on Confirm Deletion form") public void
  user_is_on_confirm_deletion_form() { PP.validatepagetitle(); }
  
  @When("User clicks <Yes> button") public void user_clicks_yes_button() {
  PP.deleteYesBtn(); }
  
  @Then("User can see {string} message") public void
  user_can_see_message(String string) { PP.successfullydeleted(); }
  
  @When("User clicks <no> button") public void user_clicks_no_button() {
  PP.deleteNoBtn(); }
  
  @Then("User can see Confirm Deletion form disappears") public void
  user_can_see_confirm_deletion_form_disappears() { String message =
  PP.validatepagetitle(); }
  
  }
 