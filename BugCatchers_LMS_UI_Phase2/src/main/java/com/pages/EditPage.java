package com.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.ConfigReader;

public class EditPage {
	public WebDriver driver;
	String Text1 = "LMS - Learning Management System";

	public EditPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public ConfigReader configReader;
	Properties prop;

	@FindBy(xpath = "//tbody/tr[1]/td[2]")
	@CacheLookup
	WebElement editcheckBox;
	
	@FindBy(xpath ="//p-confirmdialog[@class='ng-tns-c133-4']")
	WebElement successMessage;

	@FindBy(xpath = "//div[@class='action']/span[1]/button[1]")
	@CacheLookup
	WebElement editButton;
    
	@FindBy(xpath = "//input[@id='programName']")
	@CacheLookup
	WebElement editName;

	@FindBy(xpath = "//input[@id='programDescription']")
	@CacheLookup
	WebElement editDescription;
	
	@FindBy(xpath = "//span[normalize-space()='Cancel']")
	@CacheLookup
	WebElement editCancelButton;

	@FindBy(xpath = "//span[normalize-space()='Save']")
	@CacheLookup
	WebElement editSaveButton;

	//@FindBy(xpath = "//div[@class='p-dialog-header ng-tns-c132-3 ng-star-inserted']")
	@FindBy(xpath = "span[@class='p-dialog-title ng-tns-c132-3 ng-star-inserted']")
	@CacheLookup
	WebElement editDetailsForm;

	
	public void editingCancelBtn() {
		editCancelButton.click();
	}

	public void editingsavedBtn() {
		editSaveButton.click();
	}
	public void editing() {
		editButton.click();
	}
	
	
	public void editingName() {
		editName.sendKeys("");
	}

	public void editingDescription() {
		editDescription.sendKeys("john");
	}
    
	public boolean checkboxselected()
	{ if (editcheckBox.isSelected())
	   {
		return true;
	   }return false;
	}
	
	public String successfullyCreated() {
		String data=successMessage.getText();
		return(data);
	}
	
	public void editCheckTick() {
		editcheckBox.click();
	}

	public void clickEditBtn() {
		editButton.click();
	}

	public String editDetailsForm() {
		String editDetail = editDetailsForm.getText();
		String detailpage = driver.findElement(By.id("pr_id_2-label")).getText();
		
		System.out.println("Program Details Page" + detailpage);
		System.out.println("Program Edit Details Page" + editDetail);
		return editDetail;
	}

	public void editProgramDetail_page() {
		String isVisible = editDetailsForm.getAttribute("ng-reflect-visible");
		System.out.println("Program Details Page" + isVisible);
	}
	
	public void viewEditedName()
	{
		String viewName = driver.findElement(By.id("programName")).getText();
		System.out.println("View Added Name:" +  viewName );
	}
	public void viewaddDescription() {
		String viewDecription= driver.findElement(By.id("programDescription")).getText();
		System.out.println("View Added Description:" + viewDecription  );
	}
	

}
