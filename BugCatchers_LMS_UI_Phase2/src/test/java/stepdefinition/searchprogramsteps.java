package stepdefinition;

import com.factory.DriverFactory;
import com.pages.AddPage;
import com.pages.Programpages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchprogramsteps {
	Programpages PP = new Programpages(DriverFactory.getDriver());
	AddPage add=new AddPage(DriverFactory.getDriver());
@Then("User should see search box with text as search")
public void user_should_see_search_box_with_text_as_search() {
    PP.SearchedDataText();
}

@When("User enters  {allure} or  or  into search box.")
public void user_enters_allure_or_or_into_search_box() {
    
}

@Then("Entries for allure or  or  are shown.")
public void entries_for_allure_or_or_are_shown() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("User enters   or test reporting tool or  into search box.")
public void user_enters_or_test_reporting_tool_or_into_search_box() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Entries for  or test reporting tool or  are shown.")
public void entries_for_or_test_reporting_tool_or_are_shown() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("User enters   or  or Active into search box.")
public void user_enters_or_or_active_into_search_box() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Entries for  or  or Active are shown.")
public void entries_for_or_or_active_are_shown() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
}
