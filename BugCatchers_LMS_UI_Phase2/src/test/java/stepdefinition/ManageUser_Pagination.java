package stepdefinition;

import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.pages.ManageUserPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManageUser_Pagination {
	public WebDriver driver = DriverFactory.getDriver();
	ManageUserPage userPage = new ManageUserPage(driver);
	boolean flag;
	
	/*@Given("User is on Manage User page")
	public void user_is_on_manage_user_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}*/

	@When("Manage User table has more than {int} rows")
	public void manage_user_table_has_more_than_rows(Integer count) {
	   flag = userPage.checkPagination();
	}

	@Then("Pagination control should be displayed")
	public void pagination_control_should_be_displayed() {
	    if (flag == true) {
	    	System.out.println("Pagination control is displayed and enabled");
	    }
	    else
	    	System.out.println("Pagination control is displayed but not enabled");
	}

	@When("User clicks on next link of pagination")
	public void user_clicks_on_next_link_of_pagination() {
	    userPage.clickNextPage();
	}

	@Then("Next page should be displayed")
	public void next_page_should_be_displayed() {
	    if(userPage.checkPagination()==true) {
	    	System.out.println("Next page is displayed");
	    }
	}

	@When("User clicks on previous link of pagination")
	public void user_clicks_on_previous_link_of_pagination() {
	   userPage.clickPreviousPage();
	}

	@Then("Previous page should be displayed")
	public void previous_page_should_be_displayed() {
		if(userPage.checkPagination()==true) {
	    	System.out.println("Previous page is displayed");
	    }
	}


}
