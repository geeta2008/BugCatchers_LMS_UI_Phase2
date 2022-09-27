package stepdefinition;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.factory.DriverFactory;
import com.pages.AssignmentPages;
import com.pages.Loginpage;

import AppHooks.ApplicationHook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Assignmentsteps{
	
    Loginpage login = new Loginpage(DriverFactory.getDriver());
	AssignmentPages Assignment=new AssignmentPages(DriverFactory.getDriver());
	
	@Given("User is logged on to LMS website")
	public void user_is_logged_on_to_lms_website() {
		DriverFactory.getDriver().get(ApplicationHook.prop.getProperty("LMS_url"));
		login.userpassword(ApplicationHook.prop.getProperty("User"),ApplicationHook.prop.getProperty("Password"));
		login.Login();
	}

	@When("User is on Manage Assignment page")
	public void user_is_on_manage_assignment_page() {
		Assignment.Clickfun();
	}

	@Then("User should see a heading with text {string} on the page")
	public void user_should_see_a_heading_with_text_on_the_page(String ManageAssignment) {
		String Text=Assignment.validateheader();
		Assert.assertEquals(Text, ManageAssignment);
		
	}

	@Then("User should see the text as {string}.below the table")
	public void user_should_see_the_text_as_below_the_table(String Showing1to3of3entries) 
	{
		String Text=Assignment.validatepagination();
		Assert.assertEquals(Text, Showing1to3of3entries);
	}

	@Then("User should see the footer as {string}.")
	public void user_should_see_the_footer_as(String Intotalthereare3assignments) {
		String Text=Assignment.validateFooter();
		Assert.assertEquals(Text, Intotalthereare3assignments);
	}
	
	@Then("Text box used for search is diplayed")
	public void text_box_used_for_search_is_diplayed() {
		Assignment.searchdisplayed();
	}
		
    @Given("User on Assignment page") 
	 public void user_on_assignment_page() {
	    Assignment.Clickfun(); 
	  }
	 
	@When("User clicks A New Assignment button")
	public void user_clicks_a_new_assignment_button() {
		Assignment.NewAssignmentClick();
	}

	@Then("user can see Assignment details form")
	public void user_can_see_assignment_details_form() {
		//String Text1="Assigment Details";
		Assignment.validatepagetitle();
		/*
		 * String Text=Assignment.pageheader(); Assert.assertEquals(Text, Text1);
		 */
	}
	
	@Given("User is on Assignment page")
	public void user_is_on_assignment_page() {
		 Assignment.Clickfun(); 
	}

	@When("User enters {string} into search box")
	public void user_enters_into_search_box(String string) {
	   Assignment.searchboxContent(string);
	}

	@Then("Entries for {string} are displayed")
	public void entries_for_are_displayed(String string) {
	     if(string=="Selenium Assignment")   
	     { 	 
	      String Text=Assignment.SearchedDataText();
		  System.out.println("Search Box Content :"+Text);
		  Assert.assertEquals(Text, string);
	     }else if(string=="SQL Practice")
	     {
	      String Text=Assignment.SearchedAssDescText();
		  System.out.println("Search Box Content :"+Text);
			  Assert.assertEquals(Text, string);
	     }else
	     {
	    	 System.out.println("Wrong Search Data");
	     }
	     
	   }

	
}
