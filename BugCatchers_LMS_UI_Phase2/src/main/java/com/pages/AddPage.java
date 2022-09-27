package com.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.ConfigReader;

public class AddPage {
	public WebDriver driver;
	String Text1 = "LMS - Learning Management System";

	public AddPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public ConfigReader configReader;
	Properties prop;
		
	@FindBy(xpath = "//input[@id='programDescription']")
	@CacheLookup
	WebElement addDescription;
	
	@FindBy(xpath = "//button[@id='new']")
	@CacheLookup
	WebElement addProgramBtn;
	
	@FindBy(xpath = "//input[@id='programName']")
	@CacheLookup
	WebElement addName;
	
	@FindBy(xpath = "//button[@id='new']")
	@CacheLookup
	WebElement addNewProgramButton;
	
	@FindBy(xpath ="//p-confirmdialog[@class='ng-tns-c133-4']")
	WebElement successMessage;
	
	@FindBy(xpath = "//span[normalize-space()='Cancel']")
	@CacheLookup
	WebElement cancelButton;

	@FindBy(xpath = "//span[normalize-space()='Save']")
	@CacheLookup
	WebElement saveButton;
	
	@FindBy(css ="#pr_id_68-label")
	@CacheLookup
	WebElement programDetailstext;
	
	public String programDetailsDisplay() {
		String data=programDetailstext.getText();
		return(data);
	}
	public String successfullyCreated() {
		String data=successMessage.getText();
		return(data);
	}
	public void addingNewProgramBtn() {
		addProgramBtn.click();
	}
	public void cancelAddingBtn() {
		cancelButton.click();
	}
	
	public void saveAddedBtn() {
		saveButton.click();
	}
	public void addName() {
		addName.sendKeys("Geeta");
	}
	
	public void addDescription() {
		addDescription.sendKeys("software");
	}
	public void viewaddDescription() {
		String viewDecription= driver.findElement(By.id("programDescription")).getText();
		System.out.println("View Added Description:" + viewDecription  );
	}
	public void viewAddedName()
	{
		String viewName = driver.findElement(By.id("programName")).getText();
		System.out.println("View Added Name:" +  viewName );
	}
}
