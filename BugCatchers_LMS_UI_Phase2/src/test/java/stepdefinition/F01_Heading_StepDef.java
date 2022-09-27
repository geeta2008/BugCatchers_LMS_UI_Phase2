package stepdefinition;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.pages.ManageBatch_PageObj;

import AppHooks.ApplicationHook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class F01_Heading_StepDef {

	//call the pageObjectModel class and give the driver
	private ManageBatch_PageObj batch = new ManageBatch_PageObj(DriverFactory.getDriver());
	
	
	@Given("User is logged on to LMS website")
	public void user_is_logged_on_to_lms_website() {
	   
		DriverFactory.getDriver().get(ApplicationHook.prop.getProperty("LMS_url"));
		batch.appLogin();
	     
	}

	@When("User is on Batch page")
	public void user_is_on_batch_page() {
	   
		batch.clickOnBatchBtnOnRibbonTab();
	}

	@Then("User should see a heading with text {string} on the page")
	public void user_should_see_a_heading_with_text_on_the_page(String manageBatchText) {
		
		Assert.assertEquals(manageBatchText, batch.getText());	   
	     
	}

}
